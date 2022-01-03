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
	
	//유저페이지에서 공지 보이기
	public List<NotiVo> selectNotiList(String currentPage) {
		//디비에서 데이터조회
		
		//커넥션 가져옴 -> 가져온 쪽에서 클로즈 해야함
		Connection conn = getConnection();
		List<NotiVo> notiList = new NotiDao().selectNotiList(conn, currentPage);
		close(conn); 
		
		return notiList;
	}

	//관리자페이지에서 공지 보이기
	public List<NotiVo> notiListAll() {
		Connection conn = getConnection();
		List<NotiVo> notiListAll = new NotiDao().notiListAll(conn);
		close(conn); 
		
		return notiListAll;
	}
	
	public NotiVo notiView(Connection conn, NotiVo n) {
		return new NotiDao().notiView(n, conn);
	}
}
