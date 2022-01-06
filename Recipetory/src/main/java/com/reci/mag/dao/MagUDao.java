package com.reci.mag.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MagUDao {

public int updateHits(Connection conn, int postNo, boolean hasRead) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TB_BOARD_MAGAZINE SET HITS = HITS + 1 WHERE POST_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			if(hasRead = false) {
				pstmt.setInt(1, postNo);
				result = pstmt.executeUpdate();
			}else {
				result = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
}
