package com.reci.mag.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.mag.Vo.MagC_Vo;
import com.reci.mag.dao.MagC_Dao;

public class MagC_Service {

	public List<MagC_Vo> selectMagCList(){
		
		//1.DB가서 데이터 조회
		//DB랑 연결 - 템플릿 생성.
		Connection conn = JDBCTemplate.getConnection();
		
		List<MagC_Vo> magCList = new MagC_Dao().selectMagCList(conn);
		
		JDBCTemplate.close(conn);
		
		return magCList;
	}
}
