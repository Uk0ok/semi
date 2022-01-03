package com.reci.recipe.service;

import java.sql.Connection;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.dao.RBoardDao;
import com.reci.recipe.vo.registerRecipeVo;

public class RBoardService {

	public List<registerRecipeVo> selectRBoardList() {
		
		// 쿼리 날릴 준비
		Connection conn = JDBCTemplate.getConnection();
		
		List<registerRecipeVo> RboardList = new RBoardDao().selectRBoardList(conn);

		JDBCTemplate.close(conn);
		
		return RboardList;
	}
}
