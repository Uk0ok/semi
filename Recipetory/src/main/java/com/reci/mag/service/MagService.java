package com.reci.mag.service;

import static com.reci.common.JDBCTemplate.close;
import static com.reci.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.reci.mag.Vo.MagVo;
import com.reci.mag.dao.MagDao;

public class MagService {
	
	public List<MagVo> magListAll() {
		Connection conn = getConnection();
		
		List<MagVo> magListAll = new MagDao().magListAll(conn);
		close(conn); 
		
		return magListAll;
	}
}
