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

		Connection conn = getConnection();

		int result = 0;
		try {
			result = insertMember(conn, m);
			if (result > 0)
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

	public int insertMember(Connection conn, MemberVo m) throws SQLException {
		return new MemberDao().insertMember(conn, m);
	}
	
	public int deleteMember(Connection conn, MemberVo m) throws SQLException {
		return new MemberDao().deleteMember(conn, m);
	}
	
	public int updateEmail(Connection conn, MemberVo m) throws SQLException {
		return new MemberDao().updateEmail(conn, m);
	}
	
	public int updatePhone(Connection conn, MemberVo m) throws SQLException {
		return new MemberDao().updatePhone(conn, m);
	}
	
	public int updateNickname(Connection conn, MemberVo m) throws SQLException {
		return new MemberDao().updateNickname(conn, m);
	}
	
	public int updatePwd(Connection conn, MemberVo m) throws SQLException {
		return new MemberDao().updatePwd(conn, m);
	}
	
	public int insert(MemberVo m) {

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
	
	public int delete(MemberVo m) {

		Connection conn = getConnection();

		int result = 0;
		try {
			result = deleteMember(conn, m);
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

	public MemberVo login(MemberVo m) {

		Connection conn = getConnection();

		MemberVo selectedMember = selectMember(conn, m);

		close(conn);

		if (selectedMember.getUserPwd().equals(m.getUserPwd())) {
			return selectedMember;
		} else {
			return null;
		}
	}

	public MemberVo selectMember(Connection conn, MemberVo m) {
		return new MemberDao().selectMember(conn, m);
	}
	

//	public MemberVo deleteMember(MemberVo m) {
//
//		Connection conn = getConnection();
//
//		MemberVo selectedMember = selectMember(conn, m);
//
//		close(conn);
//
//		if (selectedMember.getUserPwd().equals(m.getUserPwd())) {
//			return selectedMember;
//		} else {
//			return null;
//		}
//	}

	public List<MemberVo> search() {
		Connection conn = getConnection();
		List<MemberVo> memberList = selectmemberAll(conn);
		close(conn);

		return memberList;
	}

	private List<MemberVo> selectmemberAll(Connection conn) {
		return new MemberDao().selectMemberAll(conn);
	}
	
	public int updateEmail(MemberVo m) {

		Connection conn = getConnection();
		
		int result = 0;
		try {
			result = updateEmail(conn, m);
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
	
	public int updatePhone(MemberVo m) {

		Connection conn = getConnection();
		
		int result = 0;
		try {
			result = updatePhone(conn, m);
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
	
	public int updateNickname(MemberVo m) {

		Connection conn = getConnection();
		
		int result = 0;
		try {
			result = updateNickname(conn, m);
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
	
	public int updatePwd(MemberVo m) {

		Connection conn = getConnection();
		
		int result = 0;
		try {
			result = updatePwd(conn, m);
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
	
//	public MemberVo updatePwd2(MemberVo m) {
//
//		Connection conn = getConnection();
//
//		MemberVo updatePwd2 = updatePwd2(conn, m);
//
//		close(conn);
//
//		if (updatePwd2.getUserPwd().equals(m.getUserPwd())) {
//			return updatePwd2;
//		} else {
//			return null;
//		}
//	}
	
//	public MemberVo updatePwd2(Connection conn, MemberVo m) {
//		return new MemberDao().selectMember(conn, m);
//	}
}
