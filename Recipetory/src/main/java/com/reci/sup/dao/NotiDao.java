package com.reci.sup.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.reci.sup.vo.NotiVo;

public class NotiDao {
	
	public int insertNotice(Connection conn, NotiVo n) {
		String sql = "INSERT INTO TB_NOTICE ( NOTICE_NO, ADMIN_NO, NOTICE_TITLE,"
				+ "NOTICE_CONTENT, CREATE_DATE, HITS, MOD_YN, MOD_DATE, DELETE_YN )"
				+ "VALUES ( SEQ_NOTICE.NEXTVAL, SEQ_ADMIN.NEXTVAL, ?, ?, SYSDATE, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getNoticeTitle());
			pstmt.setString(2, n.getNoticeContent());
			pstmt.setString(3, n.getHits());
			pstmt.setString(4, n.getModYn());
			pstmt.setString(5, n.getModDate());
			pstmt.setString(6, n.getDeleteYn());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}
	
	/*
	 * public List<NotiVo> selectNotiAll(Connection conn, int starNo, int endNo) {
	 * 
	 * String sql = ""
	 * 
	 * return null;
	 * 
	 * }
	 */
	
}
