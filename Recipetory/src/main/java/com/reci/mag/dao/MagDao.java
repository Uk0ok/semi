package com.reci.mag.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.mag.Vo.MagVo;
import com.reci.mag.Vo.MagDto;

public class MagDao {
		private static MagDao magDao = new MagDao();
		private Connection conn;
		private PreparedStatement pstmt;
		private ResultSet rs;
		private int result = 0;
		
		private MagDao() {
			super();
		}
		
		public static MagDao getInstance() {
			return magDao;
		}
		
		public Connection getConnect() {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
			String id = "WEB", pw = "WEB";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, id, pw);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
		
		public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
	public int nextval() {
		conn = getConnect();
		StringBuffer query = new StringBuffer();
		query.append("SELECT MAX(POST_NO) ").append("FROM TB_BOARD_MAGAZINE");
		
		try {
			pstmt = conn.prepareStatement(query.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				result = rs.getInt("MAX(POST_NO)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		return result;
	}
	
	public int write(MagDto magDto) {
		conn = getConnect();
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO TB_BOARD_MAGAZINE ");
		query.append("(POST_NO, POST_NAME, POST_CONTENT, BEG_DATE, HITS, RECOM_NUM, SCRAP_NUM, "
				+ "COMM_NUM, MOD_YN, FMOD_DATE, DEL_YN, ADMIN_NO) ");
		query.append("VALUES (?, ?, ?, sysdate, default, default, default, default, default, "
				+ "sysdate, default, ?)");
		try {
			pstmt = conn.prepareStatement(query.toString());
			pstmt.setInt(1, magDto.getPOST_NO());
			pstmt.setString(2, magDto.getPOST_NAME());
			pstmt.setString(3, magDto.getPOST_CONTENT());
			pstmt.setTimestamp(4, magDto.getBEG_DATE());
			pstmt.setInt(5, magDto.getHITS());
			pstmt.setInt(6, magDto.getRECOM_NUM());
			pstmt.setInt(7, magDto.getSCRAP_NUM());
			pstmt.setInt(8, magDto.getCOMM_NUM());
			pstmt.setString(9, magDto.getMOD_YN());
			pstmt.setTimestamp(10, magDto.getFMOD_DATE());
			pstmt.setString(11, magDto.getDEL_YN());
			pstmt.setInt(12, magDto.getADMIN_NO());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, null);
		}
		return result;
	}
	
	public List<MagDto> selectList(){
		List<MagDto> list = new ArrayList<>();
		
		try {
			conn = getConnect();
			String sql ="SELECT * FROM TB_BOARD_MAGAZINE ORDER BY POST_NO DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MagDto magDto = new MagDto();
				magDto.setPOST_NO(rs.getInt("POST_NO"));
				magDto.setPOST_NAME(rs.getString("POST_NAME"));
				magDto.setPOST_CONTENT(rs.getString("POST_CONTENT"));
				magDto.setBEG_DATE(rs.getTimestamp("BEG_DATE"));
				magDto.setHITS(rs.getInt("HITS"));
				magDto.setRECOM_NUM(rs.getInt("RECOM_NUM"));
				magDto.setSCRAP_NUM(rs.getInt("SCRAP_NUM"));
				magDto.setCOMM_NUM(rs.getInt("COMM_NUM"));
				magDto.setMOD_YN(rs.getString("MOD_YN"));
				magDto.setFMOD_DATE(rs.getTimestamp("FMOD_DATE"));
				magDto.setDEL_YN(rs.getString("DEL_YN"));
				magDto.setADMIN_NO(rs.getInt("ADMIN_NO"));
				list.add(magDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		return list;
	}
	
	
	/*
	public List<MagVo> selectMagList(Connection conn) {
		//쿼리 날릴 준비
		PreparedStatement pstmt = null; //변수 생성
		ResultSet rs = null;
		String sql = "SELECT * FROM TB_BOARD_MAGAZINE";
		List<MagVo> magList = new ArrayList<MagVo>(); //Magvo로 제한. 제한이 없다면 다 들어와버린다.
		
		//이제 쿼리 날리자
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //result 셋에 결과가 나오니까 executeQuery를 쓴다.
			
			while(rs.next()) { //계속 반복해서 모든 게시글들을 조회하기위해 while을 넣어준다
				//rs에서 현재 커서가 가리키는 행
				//의 데이터를 가져오기
				String POST_NO = rs.getString("POST_NO"); //문자로 가져오기
				String POST_NAME = rs.getString("POST_NAME");
				String POST_CONTENT = rs.getString("POST_CONTENT");
				String BEG_DATE = rs.getString("BEG_DATE");
				String HITS = rs.getString("HITS");
				String RECOM_NUM = rs.getString("RECOM_NUM");
				String SCRAP_NUM = rs.getString("SCRAP_NUM");
				String COMM_NUM = rs.getString("COMM_NUM");
				String MOD_YN = rs.getString("MOD_YN");
				String FMOD_DATE = rs.getString("FMOD_DATE");
				String DEL_YN = rs.getString("DEL_YN");
				String USER_NO = rs.getString("USER_NO");
				
				//관리하기 힘드니 하나로 뭉친다.
				MagVo mag = new MagVo();
				mag.setPOST_NO(POST_NO);
				mag.setPOST_NAME(POST_NAME);
				mag.setPOST_CONTENT(POST_CONTENT);
				mag.setBEG_DATE(BEG_DATE);
				mag.setHITS(HITS);
				mag.setRECOM_NUM(RECOM_NUM);
				mag.setSCRAP_NUM(SCRAP_NUM);
				mag.setCOMM_NUM(COMM_NUM);
				mag.setMOD_YN(MOD_YN);
				mag.setFMOD_DATE(FMOD_DATE);
				mag.setDEL_YN(DEL_YN);
				mag.setUSER_NO(USER_NO);
				
				magList.add(mag);
				//mag 라는 데이터를 화면에 넘겨주면 된다.
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs); //connection은 클로즈 하지 않는다. service에서 만들었기때문. go service
		}
		
		return magList;
	}
	
	public List<MagVo> MagListAll(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM TB_BOARD_MAGAZINE";
		List<MagVo> MagListAll = new ArrayList<MagVo>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String POST_NO = rs.getString("POST_NO"); //문자로 가져오기
				String POST_NAME = rs.getString("POST_NAME");
				String POST_CONTENT = rs.getString("POST_CONTENT");
				String BEG_DATE = rs.getString("BEG_DATE");
				String HITS = rs.getString("HITS");
				String RECOM_NUM = rs.getString("RECOM_NUM");
				String SCRAP_NUM = rs.getString("SCRAP_NUM");
				String COMM_NUM = rs.getString("COMM_NUM");
				String MOD_YN = rs.getString("MOD_YN");
				String FMOD_DATE = rs.getString("FMOD_DATE");
				String DEL_YN = rs.getString("DEL_YN");
				String USER_NO = rs.getString("USER_NO");
				
				MagVo mag = new MagVo();
				mag.setPOST_NO(POST_NO);
				mag.setPOST_NAME(POST_NAME);
				mag.setPOST_CONTENT(POST_CONTENT);
				mag.setBEG_DATE(BEG_DATE);
				mag.setHITS(HITS);
				mag.setRECOM_NUM(RECOM_NUM);
				mag.setSCRAP_NUM(SCRAP_NUM);
				mag.setCOMM_NUM(COMM_NUM);
				mag.setMOD_YN(MOD_YN);
				mag.setFMOD_DATE(FMOD_DATE);
				mag.setDEL_YN(DEL_YN);
				mag.setUSER_NO(USER_NO);
				
				MagListAll.add(mag);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs);
		}
		return MagListAll;
		
	}*/
}
