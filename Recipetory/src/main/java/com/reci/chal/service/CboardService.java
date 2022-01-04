package com.reci.chal.service;

import java.sql.Connection;
import java.util.List;

import com.reci.chal.dao.CboardDao;
import com.reci.chal.vo.CwriteVo;
import com.reci.common.JDBCTemplate;

public class CboardService {

	public List<CwriteVo> selectCboardList(){
//		System.out.println("SEVICE 호출됨...");//swy
		//1.DB가서 데이터 조회
		//DB랑 연결 - 템플릿 생성.
		Connection conn = JDBCTemplate.getConnection();
		
		List<CwriteVo> CboardList = new CboardDao().selectCboardList(conn);

		JDBCTemplate.close(conn);
		
		return CboardList;
		
	}
}
