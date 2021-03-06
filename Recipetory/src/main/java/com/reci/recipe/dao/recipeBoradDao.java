package com.reci.recipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;

import com.reci.recipe.vo.recipeImgVo;
import com.reci.recipe.vo.recipeVo;
import com.reci.sup.vo.NotiVo;

public class recipeBoradDao {

	public List<recipeVo> selectRBoardList(Connection conn) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		RBoardVo rb = null;
		List<recipeVo> RboardList = new ArrayList<recipeVo>();
		String sql = "SELECT * FROM TB_BOARD_RECIPE2 ORDER BY POST_NO DESC";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int rpostNo = rs.getInt("POST_NO");
				int userNo = rs.getInt("USER_NO");
				String rpostName = rs.getString("POST_NAME");
				Timestamp rbegDate = rs.getTimestamp("BEG_DATE");
				String ingredient1 = rs.getString("INGREDIENT1");
				String ingredient2 = rs.getString("INGREDIENT2");
				String ingredient3 = rs.getString("INGREDIENT3");
				String ingredient4 = rs.getString("INGREDIENT4");
				String ingredient5 = rs.getString("INGREDIENT5");
				String rpostContent1 = rs.getString("POST_CONTENT1");
				String rpostContent2 = rs.getString("POST_CONTENT2");
				String rpostContent3 = rs.getString("POST_CONTENT3");
				String rpostContent4 = rs.getString("POST_CONTENT4");
				String rpostContent5 = rs.getString("POST_CONTENT5");
				String rthumbnail = rs.getString("THUMBNAIL");
				String rmodYn = rs.getString("MOD_YN");
				String rdelYn = rs.getString("DEL_YN");
				Timestamp rmodDate = rs.getTimestamp("FMOD_DATE");

				recipeVo rrv = new recipeVo();
				rrv.setRpostNo(rpostNo);
				rrv.setUserNo(userNo);
				rrv.setRpostName(rpostName);
				rrv.setRbegDate(rbegDate);
				rrv.setIngredient1(ingredient1);
				rrv.setIngredient2(ingredient2);
				rrv.setIngredient3(ingredient3);
				rrv.setIngredient4(ingredient4);
				rrv.setIngredient5(ingredient5);
				rrv.setRpostContent1(rpostContent1);
				rrv.setRpostContent2(rpostContent2);
				rrv.setRpostContent3(rpostContent3);
				rrv.setRpostContent4(rpostContent4);
				rrv.setRpostContent5(rpostContent5);
				rrv.setRthumbnail(rthumbnail);
				rrv.setRmodYn(rmodYn);
				rrv.setRdelYn(rdelYn);
				rrv.setRmodDate(rmodDate);

				RboardList.add(rrv);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}

		return RboardList;
	}

	public recipeVo viewRecipe(Connection conn, int postNo) {

		String sql = "SELECT * FROM TB_BOARD_RECIPE2 WHERE POST_NO = ?";

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		recipeVo viewRecipe = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, postNo);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				viewRecipe = new recipeVo();
				viewRecipe.setRpostNo(postNo);
				viewRecipe.setUserNo(rs.getInt("USER_NO"));
				viewRecipe.setRpostName(rs.getString("POST_NAME"));
				viewRecipe.setRbegDate(rs.getTimestamp("BEG_DATE"));
				viewRecipe.setIngredient1(rs.getString("INGREDIENT1"));
				viewRecipe.setIngredient2(rs.getString("INGREDIENT2"));
				viewRecipe.setIngredient3(rs.getString("INGREDIENT3"));
				viewRecipe.setIngredient4(rs.getString("INGREDIENT4"));
				viewRecipe.setIngredient5(rs.getString("INGREDIENT5"));
				viewRecipe.setRpostContent1(rs.getString("POST_CONTENT1"));
				viewRecipe.setRpostContent2(rs.getString("POST_CONTENT2"));
				viewRecipe.setRpostContent3(rs.getString("POST_CONTENT3"));
				viewRecipe.setRpostContent4(rs.getString("POST_CONTENT4"));
				viewRecipe.setRpostContent5(rs.getString("POST_CONTENT5"));
				viewRecipe.setRthumbnail(rs.getString("THUMBNAIL"));
				viewRecipe.setRmodYn(rs.getString("MOD_YN"));
				viewRecipe.setRdelYn(rs.getString("DEL_YN"));
				viewRecipe.setRmodDate(rs.getTimestamp("FMOD_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return viewRecipe;
	}

	public List<recipeImgVo> viewImg(Connection conn, int postNo) {

		String sql = "SELECT MFILE_NAME FROM TB_ATTACHED_FILE_R WHERE POST_NO = ?";

		List<recipeImgVo> fnList = new ArrayList<recipeImgVo>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, postNo);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String fileName = rs.getString("MFILE_NAME");

				recipeImgVo vi = new recipeImgVo();
				vi.setMfileName(fileName);

				fnList.add(vi);
			}
			for (recipeImgVo x : fnList) {
				System.out.println("==================");
				System.out.println("test ::: " + x);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);

		}

		return fnList;
	}
}
