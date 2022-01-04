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
	
	public MemberVo updateMember(Connection conn, MemberVo m) {
		return new MemberDao().updateMember(conn, m);
	}

	public MemberVo deleteMember(MemberVo m) {

		Connection conn = getConnection();

		MemberVo selectedMember = selectMember(conn, m);

		close(conn);

		if (selectedMember.getUserPwd().equals(m.getUserPwd())) {
			return selectedMember;
		} else {
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
