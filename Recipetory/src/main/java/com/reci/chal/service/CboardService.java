package com.reci.chal.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.chal.dao.CboardDao;
import com.reci.chal.vo.CboardVo;
import com.reci.common.JDBCTemplate;

public class CboardService {

	public List<CboardVo> selectCboardList(){
		System.out.println("SEVICE 호출됨...");//swy
		//1.DB가서 데이터 조회
		//DB랑 연결 - 템플릿 생성.
		Connection conn = JDBCTemplate.getConnection();
		
		List<CboardVo> CboardList = new CboardDao().selectCboardList(conn);

		JDBCTemplate.close(conn);
		
		return CboardList;
		
	}
}
