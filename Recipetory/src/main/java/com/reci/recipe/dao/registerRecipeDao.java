package com.reci.recipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;

import com.reci.recipe.vo.recipeImgVo;
import com.reci.recipe.vo.registerRecipeVo;

public class registerRecipeDao {

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

	public int registerRecipeImg(Connection conn, List<recipeImgVo> rImgList) {
		
		
		String sql = "INSERT INTO TB_ATTACHED_FILE_R VALUES(SEQ_REC_FNO.NEXTVAL, "
				+ "(SELECT POST_NO FROM (SELECT ROWNUM AS RNUM, p.* FROM TB_BOARD_RECIPE2 p ORDER BY P.POST_NO DESC) "
				+ "WHERE ROWNUM = 1), 1, ?)";
		PreparedStatement pstmt = null;
		int result = 0;
		for(int i = 0; i < rImgList.size(); i++) {
			try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, rImgList.get(i).getMfileName());
			result = pstmt.executeUpdate();
			} catch (SQLException e) {
			e.printStackTrace();
			} finally {
			close(pstmt);
			}
			}
		System.out.println(rImgList.size());
		System.out.println("이미지이름 1: " + rImgList.get(0).getMfileName());
		System.out.println("이미지이름 2: " + rImgList.get(1).getMfileName());
		System.out.println("이미지이름 3: " + rImgList.get(2).getMfileName());
		System.out.println("이미지이름 4: " + rImgList.get(3).getMfileName());
		System.out.println("이미지이름 5: " + rImgList.get(4).getMfileName());
		return result;
		
	}
}
