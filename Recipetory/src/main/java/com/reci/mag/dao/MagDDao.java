package com.reci.mag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.management.Query;

import com.reci.common.JDBCTemplate;
import com.reci.common.JDBCTemplate.*;

public class MagDDao {

	public static int deleteArticle(int postNo) {
		int articlenum = 0;
		String sql = "DELETE FROM TB_MAGAZINE_BOARD WHERE POST_NO=?";
		PreparedStatement pstmt = null;
		
		try {
			Connection conn = JDBCTemplate.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, postNo);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return articlenum;
	}
}
