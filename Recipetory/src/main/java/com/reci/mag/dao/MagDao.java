package com.reci.mag.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.reci.mag.Vo.MagVo;

public class MagDao {
	
		public List<MagVo> magListAll(Connection conn){
			String sql = "SELECT * FROM TB_BOARD_MAGAZINE";
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<MagVo> magListAll = new ArrayList<MagVo>(); 
			
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				MagVo m = null;
				
				while(rs.next()) {
					
					int postNo = rs.getInt("POST_NO");
					String postName = rs.getString("POST_NAME");
					String postContent = rs.getString("POST_CONTENT");
					Timestamp begDate = rs.getTimestamp("BEG_DATE");
					int hits = rs.getInt("HITS");
					int recomNum = rs.getInt("RECOM_NUM");
					int scrapNum = rs.getInt("SCRAP_NUM");
					int commNum = rs.getInt("COMM_NUM");
					String modYn = rs.getString("MOD_YN");
					Timestamp fmodDate = rs.getTimestamp("FMOD_DATE");
					String delYn = rs.getString("DEL_YN");
					int adminNo = rs.getInt("ADMIN_NO");
					
					m = new MagVo();
					m.setPostNo(postNo);
					m.setPostName(postName);
					m.setPostContent(postContent);
					m.setBegDate(begDate);
					m.setHits(hits);
					m.setRecomNum(recomNum);;
					m.setHits(scrapNum);
					m.setCommNum(commNum);
					m.setModYn(modYn);
					m.setFmodDate(fmodDate);
					m.setDelYn(delYn);
					m.setAdminNo(adminNo);
					
					magListAll.add(m);
					
				}
					
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(rs);
			}
			return magListAll;
		}
}
	
	
//		private static MagDao magDao = new MagDao();
//		private Connection conn;
//		private PreparedStatement pstmt;
//		private ResultSet rs;
//		private int result = 0;
//		
//		private MagDao() {
//			super();
//		}
//		
//		public static MagDao getInstance() {
//			return magDao;
//		}
//		
//		public Connection getConnect() {
//			String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
//			String id = "WEB", pw = "WEB";
//			
//			try {
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//				conn = DriverManager.getConnection(url, id, pw);
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			return conn;
//		}
//		
//		public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	
//	public int nextval() {
//		conn = getConnect();
//		StringBuffer query = new StringBuffer();
//		query.append("SELECT MAX(POST_NO) ").append("FROM TB_BOARD_MAGAZINE");
//		
//		try {
//			pstmt = conn.prepareStatement(query.toString());
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				result = rs.getInt("MAX(POST_NO)");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(conn, pstmt, rs);
//		}
//		return result;
//	}
//	
//	public int write(MagDto magDto) {
//		conn = getConnect();
//		StringBuffer query = new StringBuffer();
//		query.append("INSERT INTO TB_BOARD_MAGAZINE ");
//		query.append("(POST_NO, POST_NAME, POST_CONTENT, BEG_DATE, HITS, RECOM_NUM, SCRAP_NUM, "
//				+ "COMM_NUM, MOD_YN, FMOD_DATE, DEL_YN, ADMIN_NO) ");
//		query.append("VALUES (SEQ_MEG_PNO.NEXTVAL, ?, ?, sysdate, default, default, default, default, default, "
//				+ "sysdate, default, '1')");
//		try {
//			pstmt = conn.prepareStatement(query.toString());
//			pstmt.setInt(1, magDto.getPOST_NO());
//			pstmt.setString(2, magDto.getPOST_NAME());
//			pstmt.setString(3, magDto.getPOST_CONTENT());
//			pstmt.setTimestamp(4, magDto.getBEG_DATE());
//			pstmt.setInt(5, magDto.getHITS());
//			pstmt.setInt(6, magDto.getRECOM_NUM());
//			pstmt.setInt(7, magDto.getSCRAP_NUM());
//			pstmt.setInt(8, magDto.getCOMM_NUM());
//			pstmt.setString(9, magDto.getMOD_YN());
//			pstmt.setTimestamp(10, magDto.getFMOD_DATE());
//			pstmt.setString(11, magDto.getDEL_YN());
//			pstmt.setInt(12, magDto.getADMIN_NO());
//			result = pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(conn, pstmt, null);
//		}
//		return result;
//	}
//	
//	public List<MagDto> selectList(){
//		List<MagDto> list = new ArrayList<>();
//		
//		try {
//			conn = getConnect();
//			String sql ="SELECT * FROM TB_BOARD_MAGAZINE ORDER BY POST_NO DESC";
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			while (rs.next()) {
//				MagDto magDto = new MagDto();
//				magDto.setPOST_NO(rs.getInt("POST_NO"));
//				magDto.setPOST_NAME(rs.getString("POST_NAME"));
//				magDto.setPOST_CONTENT(rs.getString("POST_CONTENT"));
//				magDto.setBEG_DATE(rs.getTimestamp("BEG_DATE"));
//				magDto.setHITS(rs.getInt("HITS"));
//				magDto.setRECOM_NUM(rs.getInt("RECOM_NUM"));
//				magDto.setSCRAP_NUM(rs.getInt("SCRAP_NUM"));
//				magDto.setCOMM_NUM(rs.getInt("COMM_NUM"));
//				magDto.setMOD_YN(rs.getString("MOD_YN"));
//				magDto.setFMOD_DATE(rs.getTimestamp("FMOD_DATE"));
//				magDto.setDEL_YN(rs.getString("DEL_YN"));
//				magDto.setADMIN_NO(rs.getInt("ADMIN_NO"));
//				list.add(magDto);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			close(conn, pstmt, rs);
//		}
//		return list;
//	}
