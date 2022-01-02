package com.reci.admin;

import java.sql.Connection;
import java.sql.SQLException;

import static com.reci.common.JDBCTemplate.*; //static 으로 바꿔서 클래스명 생략해서 쓸 수 있게

public class AdminService {

	public int join(AdminVo ad) {

		//DB Connection 가져오기
		Connection conn = getConnection();
		
		//쿼리날리기 //insert
		int result = 0;
		try {
			result = insertAdmin(conn, ad);
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
		
		//결과 반환해주기
		return result;
	}
	
	public int insertAdmin(Connection conn, AdminVo ad) throws SQLException {
		
		//dao 불러서 쿼리 실행 //db와 ad 두 정보를 받아와야함
		//dao 한테 쿼리 실행 결과 받기 (int result)
		
		//int result = new AdminDao().insertAdmin(conn, ad);
		//return result;
		
		return new AdminDao().insertAdmin(conn, ad);
		
	}

	public AdminVo login(AdminVo ad) {
		
		//커넥션 가져오기
		Connection conn = getConnection();
		
		//id 가지고 그 아이디의 비번 조회
		
		AdminVo selectedAdmin = selectAdmin(conn, ad);
		
		close(conn);
		
		//가져온 pwd랑 사용자의 pwd랑 같은지 비교
		//true면 return/false면 rollback이니까 바로 (결과)리턴값에 넣어주기
		//로그인 성공하면 그 정보를 기억하기위해 selectedAdmin에 기록
		if(selectedAdmin.getAdminPwd().equals(ad.getAdminPwd())) {
			return selectedAdmin;
		}else {
			return null;
		}
	}

	public AdminVo selectAdmin(Connection conn, AdminVo ad) {
		return new AdminDao().selectAdmin(conn, ad);
	}
}
