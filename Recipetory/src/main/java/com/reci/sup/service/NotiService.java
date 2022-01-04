package com.reci.sup.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.reci.common.JDBCTemplate.* ;

import com.reci.join.controller.MemberDao;
import com.reci.sup.dao.NotiDao;
import com.reci.sup.vo.NotiVo;

public class NotiService {
	
	//유저페이지에서 공지 보이기
	public List<NotiVo> selectNotiList(String currentPage) {
		Connection conn = getConnection();
		int totalBoardCount = countNotiAll(conn); //총 게시글 수
		int pageLimit = 3; 		 //페이징 목록 최대갯수
		int boardLimit = 5; 	 //한 페이지당 게시글 수

		int p = Integer.parseInt(currentPage);
		int endNo = p * boardLimit;
		int startNo = endNo - boardLimit + 1;
		
		//디비에서 데이터조회
		//커넥션 가져옴 -> 가져온 쪽에서 클로즈 해야함
		List<NotiVo> notiList = new NotiDao().selectNotiList(conn, startNo, endNo);
		close(conn); 
		
		return notiList;
	}

	private int countNotiAll(Connection conn) {
		return new NotiDao().countNotiAll(conn);
	}

	//관리자페이지에서 공지 보이기
	public List<NotiVo> notiListAll() {
		Connection conn = getConnection();
		List<NotiVo> notiListAll = new NotiDao().notiListAll(conn);
		close(conn); 
		
		return notiListAll;
	}
	
	public static NotiVo notiView(int noticeNo) { 
		NotiVo notiView = null;
		Connection conn = getConnection();
		
		notiView = new NotiDao().notiView(conn, noticeNo);
		close(conn);
				
		return notiView; 
	}

	public static int updateHits(int noticeNo, boolean hasRead) {
		Connection conn = getConnection();
		int updateHits = new NotiDao().updateHits(conn, noticeNo, hasRead);
		close(conn);
		
		return updateHits; 
	}

}
