package com.reci.recipe.service;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.dao.registerRecipeDao;
import com.reci.recipe.vo.recipeImgVo;
import com.reci.recipe.vo.recipeVo;

public class registerRecipeService {

	public int regist(recipeVo rrv) {

		// DB Connection 가져오기
		Connection conn = getConnection();

		// 쿼리 날리기 //insert
		int result = 0;
		try {
			result = insertRecipe(conn, rrv);
			if (result > 0)
				commit(conn);
			else
				rollback(conn);
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(conn);
		}

		// 결과 반환해주기
		return result;
	}

	public int insertRecipe(Connection conn, recipeVo rrv) throws SQLException {
		// dao 불러서 쿼리 실행
		// dao한테 쿼리 실행 결과 받기
		return new registerRecipeDao().insertRecipe(conn, rrv);
	}

	public int registerRecipeImg(List<recipeImgVo> rImgList) {

		Connection conn = getConnection();

		int result = 0;

		try {
			result = insertRecipeImg(conn, rImgList);
			if (result > 0)
				commit(conn);
			else
				rollback(conn);
		} catch (Exception e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return result;
	}

	private int insertRecipeImg(Connection conn, List<recipeImgVo> rImgList) {
		return new registerRecipeDao().registerRecipeImg(conn, rImgList);
	}

}
