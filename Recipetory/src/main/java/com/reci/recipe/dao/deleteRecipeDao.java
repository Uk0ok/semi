package com.reci.recipe.dao;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reci.recipe.vo.recipeVo;

import static com.reci.common.JDBCTemplate.*;

public class deleteRecipeDao {
	
	public int deleteRecipe(Connection conn, recipeVo rv) {

		String sql = "UPDATE TB_BOARD_RECIPE2 SET DEL_YN='Y' WHERE POST_NO = ?";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rv.getRpostNo());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
}
