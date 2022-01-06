package com.reci.recipe.service;

import java.sql.Connection;
import java.sql.SQLException;

import static com.reci.common.JDBCTemplate.*;

import com.reci.recipe.dao.modifyRecipeDao;
import com.reci.recipe.dao.registerRecipeDao;
import com.reci.recipe.vo.recipeVo;

public class modifyRecipeService {
	
	public int modify(recipeVo mrv) {
		Connection conn = getConnection();
		
		int result = 0;
		try {
			result = modifytRecipe(conn, mrv);
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

	private int modifytRecipe(Connection conn, recipeVo mrv) throws SQLException {
		// TODO Auto-generated method stub
		return new modifyRecipeDao().modifyRecipe(conn, mrv);
	}
}
