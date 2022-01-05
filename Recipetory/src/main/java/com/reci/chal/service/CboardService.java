package com.reci.chal.service;

import static com.reci.common.JDBCTemplate.close;
import static com.reci.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.chal.dao.CboardDao;
import com.reci.chal.vo.CwriteVo;

public class CboardService {

	public List<CwriteVo> selectCboardList(){
//		System.out.println("SEVICE 호출됨...");//swy
	
		Connection conn = JDBCTemplate.getConnection();
		
		List<CwriteVo> CboardList = new CboardDao().selectCboardList(conn);

		JDBCTemplate.close(conn);
		
		return CboardList;
		
	}
	public static CwriteVo viewChallenge(int postNo) {
		CwriteVo viewChallenge = null;
		Connection conn = getConnection();
		
		viewChallenge = new CboardDao().viewChallenge(conn, postNo);
		close(conn);
		
		return viewChallenge;

	}
}
