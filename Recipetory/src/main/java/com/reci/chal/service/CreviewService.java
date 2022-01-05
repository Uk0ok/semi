package com.reci.chal.service;

import static com.reci.common.JDBCTemplate.close;
import static com.reci.common.JDBCTemplate.commit;
import static com.reci.common.JDBCTemplate.getConnection;
import static com.reci.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.sql.SQLException;

import com.reci.chal.dao.CreviewDao;
import com.reci.chal.vo.CreviewVo;

public class CreviewService {
	public int review(CreviewVo crv) {

		//DB Connection 가져오기
		Connection conn = getConnection();
		
		//쿼리 날리기 // insert
		int result = 0;
		try {
			result = reviewwrite(conn, crv);
			if(result > 0)
				commit(conn);
			else
				rollback(conn);
		} catch(SQLException e) {
			rollback(conn);
			e.printStackTrace();
		} finally {
			close(conn);
		}
		
		// 결과 반환해주기
		return result;
	}
	public int insertChallenge(Connection conn, CreviewVo cwv)throws SQLException{
		// dao 불러서 쿼리 실행
		// dao한테 쿼리 실행 결과 받기
		return new CreviewDao().reviewwrite(conn,cwv);
	}
}



