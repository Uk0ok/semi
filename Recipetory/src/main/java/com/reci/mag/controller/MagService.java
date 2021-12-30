package com.reci.mag.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;

public class MagService {
	
	public List<MagVo> selectMagList() {
		
		//1.DB가서 데이터 조회
				//DB랑 연결 - 템플릿 생성.
				Connection conn = JDBCTemplate.getConnection();
				
				List<MagVo> magList = new MagDao().selectMagList(conn);
				
				JDBCTemplate.close(conn);
				
				return magList;
	}
	
}
