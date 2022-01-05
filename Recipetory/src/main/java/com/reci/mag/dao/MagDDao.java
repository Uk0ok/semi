package com.reci.mag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.management.Query;

import com.reci.common.JDBCTemplate;
import com.reci.common.JDBCTemplate.*;
import com.reci.mag.Vo.MagVo;

public class MagDDao {

	public static int deleteMag(Connection conn, MagVo dm) {
		String sql = "UPDATE TB_BOARD_MAGAZINE SET DEL_YN = 'Y' WHERE POST_NO = ?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dm.getPostNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return -1;
	}

}
