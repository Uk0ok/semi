package com.reci.join.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;

import com.reci.common.JDBCTemplate;
import com.reci.join.controller.MemberDao;
import com.reci.join.controller.MemberVo;

public class MemberService {
	
//	public MemberVo login(MemberVo m) {
//		// 커넥션 가져오기
//		Connection conn = getConnection();
//
//		// id 가지고 그 아이디의 비번 조회
//
//		MemberVo selectedMember = selectMember(conn, m);
//
//		close(conn);
//
//		if (selectedMember.getUserPwd().equals((m.getUserPwd()))) {
//			return selectedMember;
//		} else {
//			return null;
//		}
//	}

	
	public boolean login(MemberVo m) {
		Connection conn = getConnection();
		
		MemberVo selectedMember = selectMember(conn, m);
		
		close(conn);
		
		return selectedMember.getUserPwd().equals(m.getUserPwd());
	}
	
	
	
	
	
	
	
	
	public MemberVo selectMember(Connection conn, MemberVo m) {
		return new MemberDao().selectMember(conn, m);
	}
	
}