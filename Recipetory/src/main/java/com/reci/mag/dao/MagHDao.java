package com.reci.mag.dao;

import java.sql.*;

import com.reci.mag.Vo.MagVo;
import static com.reci.common.JDBCTemplate.*;

public class MagHDao {
	
	public static int hitUpdate(Connection conn, MagVo vm) throws SQLException {
		String sql = "UPDATE TB_BOARD_MAGAZINE SET HITS = HITS + 1 WHERE POST_NO = ?";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, vm.getPostNo());
			
			result = pstmt.executeUpdate();
			System.out.println("hitup");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}	
	
}
