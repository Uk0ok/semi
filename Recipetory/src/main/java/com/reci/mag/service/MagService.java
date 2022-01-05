package com.reci.mag.service;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

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
	
	private int insertMag(Connection conn, MagVo mw) throws SQLException {
		
		//dao 불러서 쿼리 실행 // db와 mw 두 정보를 받아와야함
		//dao 한테 쿼리 실행 결과 받기(int result)
		
		//int result = new MagWDao().insertMag(conn, ad);
		//return result;
		
		return new MagWDao().insertMag(conn, mw);
	}
	
	public static int deleteArticle(int postNo) {
		int articleNum = 0;
		articleNum = MagDDao.deleteArticle(postNo);
		return articleNum;
	}
	
	
	
	
}
