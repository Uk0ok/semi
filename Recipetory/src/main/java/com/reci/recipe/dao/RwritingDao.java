package com.reci.recipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;

import com.reci.recipe.vo.recipeImgVo;
import com.reci.recipe.vo.registerRecipeVo;

public class RwritingDao {

	public int insertRecipe(Connection conn, registerRecipeVo rrv) throws SQLException {
		// 쿼리 날리기
		String sql = "INSERT INTO TB_BOARD_RECIPE2 VALUES(SEQ_REC_RNO.NEXTVAL, '1', ?, SYSDATE, ?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, 'N', 'N', SYSDATE)";
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rrv.getRpostName());
			pstmt.setString(2, rrv.getIngredient1());
			pstmt.setString(3, rrv.getIngredient2());
			pstmt.setString(4, rrv.getIngredient3());
			pstmt.setString(5, rrv.getIngredient4());
			pstmt.setString(6, rrv.getIngredient5());
			pstmt.setString(7, rrv.getRpostContent1());
			pstmt.setString(8, rrv.getRpostContent2());
			pstmt.setString(9, rrv.getRpostContent3());
			pstmt.setString(10, rrv.getRpostContent4());
			pstmt.setString(11, rrv.getRpostContent5());
			pstmt.setString(12, rrv.getRthumbnail());

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int insertRecipeImg(Connection conn, recipeImgVo rImg) {
		String sql = "INSERT INTO TB_ATTACHED_FILE_R VALUES(SEQ_REC_FNO.NEXTVAL, ?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rImg.getPostNo());
			pstmt.setInt(2, rImg.getUserNo());
			pstmt.setString(3, rImg.getFileName());
			pstmt.setString(4, rImg.getMfileName());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

}
