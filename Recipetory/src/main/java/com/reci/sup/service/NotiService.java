package com.reci.sup.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.reci.common.JDBCTemplate.* ;

import com.reci.sup.dao.NotiDao;
import com.reci.sup.vo.NotiVo;

public class NotiService {
	
	public List<NotiVo> selectNotiList() {
		//디비에서 데이터조회
		
				//커넥션 가져옴 -> 가져온 쪽에서 클로즈 해야함
				Connection conn = getConnection();
				
				List<NotiVo> notiList = new NotiDao().selectNotiList(conn);
				
				close(conn); 
				
				return notiList;
	}
}
