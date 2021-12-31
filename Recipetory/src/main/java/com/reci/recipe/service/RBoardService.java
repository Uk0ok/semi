package com.reci.recipe.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.dao.RBoardDao;
import com.reci.recipe.vo.RBoardVo;

public class RBoardService {

	public List<RBoardVo> selectRBoardList() {
		
		// 쿼리 날릴 준비
		Connection conn = JDBCTemplate.getConnection();
		
		List<RBoardVo> RboardList = new RBoardDao().selectRBoardList(conn);

		JDBCTemplate.close(conn);
		
		return RboardList;
	}
}
