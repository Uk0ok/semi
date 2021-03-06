package com.reci.recipe.service;

import static com.reci.common.JDBCTemplate.close;
import static com.reci.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.dao.recipeBoradDao;
import com.reci.recipe.vo.recipeImgVo;
import com.reci.recipe.vo.recipeVo;
import com.reci.sup.dao.NotiDao;
import com.reci.sup.vo.NotiVo;

public class recipeBoardService {
	// recipe 등록하기
	public List<recipeVo> selectRBoardList() {

		// 쿼리 날릴 준비
		Connection conn = JDBCTemplate.getConnection();

		List<recipeVo> RboardList = new recipeBoradDao().selectRBoardList(conn);

		JDBCTemplate.close(conn);

		return RboardList;
	}

	// recipe 보이기
	public static recipeVo viewRecipe(int postNo) {
		recipeVo viewRecipe = null;
		Connection conn = getConnection();

		viewRecipe = new recipeBoradDao().viewRecipe(conn, postNo);
		close(conn);

		return viewRecipe;
	}

	public static List<recipeImgVo> viewImg(int postNo) {
		List<recipeImgVo> fnLsit = null;
		Connection conn = getConnection();

		fnLsit = new recipeBoradDao().viewImg(conn, postNo);
		close(conn);

		return fnLsit;
	}
}
