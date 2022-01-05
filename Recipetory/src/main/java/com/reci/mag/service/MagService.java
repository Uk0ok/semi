package com.reci.mag.service;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.reci.admin.AdminVo;
import com.reci.mag.Vo.MagVo;
import com.reci.mag.dao.MagDDao;
import com.reci.mag.dao.MagDao;
import com.reci.mag.dao.MagWDao;

public class MagService {
	
	 
	public List<MagVo> magListAll() {
		Connection conn = getConnection();
		
		List<MagVo> magListAll = new MagDao().magListAll(conn);
		close(conn); 
		
		return magListAll;
	}
	
	public int insert(MagVo mw) {
		
		//DB Connection 가져오기
		Connection conn = getConnection();
		
		//쿼리날리기 //insert
		int result = 0;
		try {
			result = insertMag(conn, mw);
			if(result > 0)
				commit(conn);
			else
				rollback(conn);
		} catch (Exception e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return result;
	}
	
	
	public List<MagVo> selectMagList(String currentPage){
		Connection conn = getConnection();
		int totalBoardCount = countMagAll(conn); //총 게시글 수
		int pageLimit = 3; 		 //페이징 목록 최대갯수
		int boardLimit = 5; 	 //한 페이지당 게시글 수
		
		int p = Integer.parseInt(currentPage);
		int endNo = p * boardLimit;
		int startNo = endNo - boardLimit + 1;
		
		//디비에서 데이터조회
		//커넥션 가져옴 -> 가져온 쪽에서 클로즈 해야함
		List<MagVo> magList = new MagDao().selectMagList(conn, startNo, endNo);
		close(conn);
		
		return magList;
	}
	
	private int countMagAll(Connection conn) {
		return new MagDao().countMagAll(conn);
	}
	
	
	private int insertMag(Connection conn, MagVo mw) throws SQLException {
		
		//dao 불러서 쿼리 실행 // db와 mw 두 정보를 받아와야함
		//dao 한테 쿼리 실행 결과 받기(int result)
		
		//int result = new MagWDao().insertMag(conn, ad);
		//return result;
		
		return new MagWDao().insertMag(conn, mw);
	}
	
	public int delete(MagVo dm) {
		
		Connection conn = getConnection();
		
		int result = 0;
		try {
			result = deleteMag(conn, dm);
			if(result > 0)
				commit(conn);
			else
				rollback(conn);
		} catch (SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return result;
	}
	
	public static int deleteMag(Connection conn, MagVo dm) throws SQLException {
		return new MagDDao().deleteMag(conn, dm);
	}
	
	
	
	
}
