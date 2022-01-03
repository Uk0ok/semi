package com.reci.recipe.service;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.dao.RwritingDao;
import com.reci.recipe.vo.registerRecipeVo;

public class RwritingService {

	public int regist(registerRecipeVo rrv) {

		// DB Connection 가져오기
		Connection conn = getConnection();

		// 쿼리 날리기 //insert
		int result = 0;
		try {
			result = insertRecipe(conn, rrv);
			if(result > 0)
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

	public int insertRecipe(Connection conn, registerRecipeVo rrv) throws SQLException {
		// dao 불러서 쿼리 실행
		// dao한테 쿼리 실행 결과 받기
		return new RwritingDao().insertRecipe(conn, rrv);
	}

}