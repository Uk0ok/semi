package com.reci.sup.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.admin.AdminVo;
import com.reci.admin.FileVo;
import com.reci.sup.vo.NotiVo;

public class NotiDao {

	public List<NotiVo> selectNotiList(Connection conn, int startNo, int endNo) {
		//쿼리 날릴 준비
		String sql = "SELECT * "
				+ "FROM "
				+ "("
				+ "SELECT ROWNUM AS RNUM, m.* FROM TB_NOTICE m WHERE DELETE_YN = 'N'"
				+ ")"
				+ "WHERE ROWNUM BETWEEN ? AND ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<NotiVo> notiList = new ArrayList<NotiVo>(); //리스트안에 제네릭이용해서 notivo만 들어오게
		
		//쿼리 날리기
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startNo);
			pstmt.setInt(2,endNo);
			rs = pstmt.executeQuery(); //실행결과가 resultset에 나오기 때문에
			
			//모든게시글 가져오기위해, 다음줄마다 모두 실행되려면 while
			while(rs.next()) {
				//rs에서 현재 커서가 가리키는 행의 데이터를 가져오기
				int noticeNo = rs.getInt("NOTICE_NO");
				int adminNo = rs.getInt("ADMIN_NO");
				String noticeTitle = rs.getString("NOTICE_TITLE");
				String noticeContent = rs.getString("NOTICE_CONTENT");
				Timestamp createDate = rs.getTimestamp("CREATE_DATE");
				int hits = rs.getInt("HITS");
				String modYn = rs.getString("MOD_YN");
				Timestamp modDate = rs.getTimestamp("MOD_DATE");
				String deleteYn = rs.getString("DELETE_YN");
				
				//여러 변수에 흩어져있는 데이터를 하나로 뭉침
				NotiVo n = new NotiVo();
				n.setNoticeNo(noticeNo);
				n.setAdminNo(adminNo);
				n.setNoticeTitle(noticeTitle);
				n.setNoticeContent(noticeContent);
				n.setCreateDate(createDate);;
				n.setHits(hits);
				n.setModYn(modYn);
				n.setModDate(modDate);
				n.setDeleteYn(deleteYn);
				
				notiList.add(n);
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return notiList;
	}
	
	public List<NotiVo> notiListAll(Connection conn) {
		String sql = "SELECT * FROM TB_NOTICE";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<NotiVo> notiListAll = new ArrayList<NotiVo>();
		
		//쿼리 날리기
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //실행결과가 resultset에 나오기 때문에
			
			//모든게시글 가져오기위해, 다음줄마다 모두 실행되려면 while
			while(rs.next()) {
				//rs에서 현재 커서가 가리키는 행의 데이터를 가져오기
				int noticeNo = rs.getInt("NOTICE_NO");
				int adminNo = rs.getInt("ADMIN_NO");
				String noticeTitle = rs.getString("NOTICE_TITLE");
				String noticeContent = rs.getString("NOTICE_CONTENT");
				Timestamp createDate = rs.getTimestamp("CREATE_DATE");
				int hits = rs.getInt("HITS");
				String modYn = rs.getString("MOD_YN");
				Timestamp modDate = rs.getTimestamp("MOD_DATE");
				String deleteYn = rs.getString("DELETE_YN");
				
				//여러 변수에 흩어져있는 데이터를 하나로 뭉침
				NotiVo n = new NotiVo();
				n.setNoticeNo(noticeNo);
				n.setAdminNo(adminNo);
				n.setNoticeTitle(noticeTitle);
				n.setNoticeContent(noticeContent);
				n.setCreateDate(createDate);;
				n.setHits(hits);
				n.setModYn(modYn);
				n.setModDate(modDate);
				n.setDeleteYn(deleteYn);
				
				notiListAll.add(n);
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return notiListAll;
	}
	
	//상세보기
	public NotiVo notiView(Connection conn, int noticeNo) {
		
		String sql = "SELECT * FROM TB_NOTICE WHERE NOTICE_NO = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		NotiVo notiView = null;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, noticeNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				notiView= new NotiVo();
				notiView.setNoticeNo(noticeNo);
				notiView.setAdminNo(rs.getInt("ADMIN_NO"));
				notiView.setNoticeTitle(rs.getString("NOTICE_TITLE"));
				notiView.setNoticeContent(rs.getString("NOTICE_CONTENT"));
				notiView.setCreateDate(rs.getTimestamp("CREATE_DATE"));;
				notiView.setHits(rs.getInt("HITS"));
				notiView.setModYn(rs.getString("MOD_YN"));
				notiView.setModDate(rs.getTimestamp("MOD_DATE"));
				notiView.setDeleteYn(rs.getString("DELETE_YN"));
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return notiView;
	}

	public int countNotiAll(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT COUNT(NOTICE_NO) FROM TB_NOTICE WHERE DELETE_YN = 'N'";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		
		return result;
	}

	public int updateHits(Connection conn, int noticeNo) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TB_NOTICE SET HITS = HITS + 1 WHERE NOTICE_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, noticeNo);
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}


	/*
	 * try { pstmt = conn.prepareStatement(sql);
	 * 
	 * if(hasRead = false) { pstmt.setInt(1, noticeNo); result =
	 * pstmt.executeUpdate(); }else { result = 0; } } catch (SQLException e) {
	 * e.printStackTrace(); } finally { close(pstmt); } return result;
	 */

	public int insertNotice(Connection conn, NotiVo n) {
		String sql = "INSERT INTO TB_NOTICE ( NOTICE_NO, ADMIN_NO, NOTICE_TITLE, NOTICE_CONTENT)"
				+ "VALUES ( SEQ_NOTICE.NEXTVAL, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, n.getAdminNo());
			pstmt.setString(2, n.getNoticeTitle());
			pstmt.setString(3, n.getNoticeContent());
	
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int delete(Connection conn, NotiVo n) {
		String sql = "UPDATE TB_NOTICE SET MOD_DATE = SYSDATE, MOD_YN = 'Y' WHERE NOTICE_NO = ?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, n.getAdminNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return -1;
	}

}

