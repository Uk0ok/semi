package com.reci.recipe.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.reci.recipe.vo.recipeVo;

public class modifyRecipeDao {

	public int modifyRecipe(Connection conn, recipeVo mrv) throws SQLException {
		String sql = "UPDATE TB_BOARD_RECIPE2 SET POST_NAME=?,INGREDIENT1=?,INGREDIENT2=?,INGREDIENT2=?,INGREDIENT2=?,INGREDIENT2=?,POST_CONTENT1=?,POST_CONTENT1=?,POST_CONTENT1=?,POST_CONTENT1=?,POST_CONTENT1=?,THUMBNAIL=?,MOD_YN='Y',FMOD_DATE=SYSDATE WHERE DEL_YN='N'";
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mrv.getRpostName());
			pstmt.setString(2, mrv.getIngredient1());
			pstmt.setString(3, mrv.getIngredient2());
			pstmt.setString(4, mrv.getIngredient3());
			pstmt.setString(5, mrv.getIngredient4());
			pstmt.setString(6, mrv.getIngredient5());
			pstmt.setString(7, mrv.getRpostContent1());
			pstmt.setString(8, mrv.getRpostContent2());
			pstmt.setString(9, mrv.getRpostContent3());
			pstmt.setString(10, mrv.getRpostContent4());
			pstmt.setString(11, mrv.getRpostContent5());
			pstmt.setString(12, mrv.getRthumbnail());

			result = pstmt.executeUpdate();	
		} finally {
			close(pstmt);
		}

		return result;
	}

}
