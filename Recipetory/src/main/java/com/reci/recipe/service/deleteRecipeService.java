package com.reci.recipe.service;

import java.sql.Connection;
import java.sql.SQLException;

import static com.reci.common.JDBCTemplate.*;

import com.reci.recipe.dao.deleteRecipeDao;
import com.reci.recipe.vo.recipeVo;

public class deleteRecipeService {
	
	public int delete(recipeVo rv) {
		Connection conn = getConnection();
		
		int result = 0;
		try {
		result = deleteRecipe(conn, rv);
		if(result > 0)
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

	private int deleteRecipe(Connection conn, recipeVo rv) {
		
		return new deleteRecipeDao().deleteRecipe(conn, rv);
	}
}
