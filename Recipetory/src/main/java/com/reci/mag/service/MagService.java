package com.reci.mag.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.mag.Vo.MagVo;
import com.reci.mag.dao.MagDao;

public class MagService {
	
	public List<MagVo> selectMagList() {
		
		//1.DB가서 데이터 조회
				//DB랑 연결 - 템플릿 생성.
				Connection conn = JDBCTemplate.getConnection();
				
				List<MagVo> magList = new MagDao().selectMagList(conn);
				
				JDBCTemplate.close(conn);
				
				return magList;
	}
	
	//어드민 메거진 관리 페이지
	public List<MagVo> MagListAll() {
		Connection conn = JDBCTemplate.getConnection();
		List<MagVo> MagListAll = new MagDao().MagListAll(conn);
		JDBCTemplate.close(conn);
		return MagListAll;
		
	}

	private Connection getconnection() {
		// TODO Auto-generated method stub
		return null;
	}
}
