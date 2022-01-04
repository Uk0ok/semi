package com.reci.join.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;

import com.reci.admin.AdminDao;
import com.reci.admin.AdminVo;
import com.reci.common.JDBCTemplate;
import com.reci.join.controller.MemberDao;
import com.reci.join.controller.MemberVo;

public class MemberService {
	
	public int join(MemberVo m) {

		//DB Connection 가져오기
		Connection conn = getConnection();
		
		//쿼리날리기 //insert
		int result = 0;
		try {
			result = insertMember(conn, m);
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
	
	public int insertMember(Connection conn, MemberVo m) throws SQLException {
		
		//dao 불러서 쿼리 실행 //db와 ad 두 정보를 받아와야함
		//dao 한테 쿼리 실행 결과 받기 (int result)
		
		//int result = new AdminDao().insertAdmin(conn, ad);
		//return result;
		
		return new MemberDao().insertMember(conn, m);
		
	}

	public MemberVo login(MemberVo m) {
		//커넥션 가져오기
		Connection conn = getConnection();
		
		//id 가지고 그 아이디의 비번 조회
		
		MemberVo selectedMember = selectMember(conn, m);
		
		close(conn);
		
		//가져온 pwd랑 사용자의 pwd랑 같은지 비교
		//true면 return/false면 rollback이니까 바로 (결과)리턴값에 넣어주기
		//로그인 성공하면 그 정보를 기억하기위해 selectedAdmin에 기록
		if(selectedMember.getUserPwd().equals(m.getUserPwd())) {
			return selectedMember;
		}else {
			return null;
		}
	}

	public MemberVo selectMember(Connection conn, MemberVo m) {
		return new MemberDao().selectMember(conn, m);
	}
	
	public MemberVo deleteMember(MemberVo m) {
		//커넥션 가져오기
		Connection conn = getConnection();
	
		MemberVo selectedMember = selectMember(conn, m);
		
		close(conn);
		
		//가져온 pwd랑 사용자의 pwd랑 같은지 비교
		//true면 return/false면 rollback이니까 바로 (결과)리턴값에 넣어주기
		//로그인 성공하면 그 정보를 기억하기위해 selectedAdmin에 기록
		if(selectedMember.getUserPwd().equals(m.getUserPwd())) {
			return selectedMember;
		}else {
			return null;
		}
	}
	
	public List<MemberVo> search() {
		Connection conn = getConnection();
		List<MemberVo> memberList = selectmemberAll(conn);
		close(conn);
		
		return memberList;
	}

	private List<MemberVo> selectmemberAll(Connection conn) {
		return new MemberDao().selectMemberAll(conn);
	}
}
