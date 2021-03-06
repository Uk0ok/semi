package com.reci.join.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.admin.AdminDao;

import oracle.sql.TIMESTAMP;

import static com.reci.common.JDBCTemplate.*;

public class MemberDao {

	public int insertMember(Connection conn, MemberVo m) throws SQLException {
		// 쿼리 날리기

		String sql = "INSERT INTO TB_USER"
				+ "(USER_NO, USER_ID, USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN)"
				+ "VALUES " + "(SEQ_UNO.NEXTVAL, ?, ?, ?, ?, ?, SYSDATE, DEFAULT, DEFAULT)";

		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getUserPwd());
			pstmt.setString(3, m.getUserNickname());
			pstmt.setString(4, m.getUserEmail());
			pstmt.setString(5, m.getUserPhone());

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public MemberVo selectMember(Connection conn, MemberVo m) {

		String query = "SELECT * FROM TB_USER WHERE USER_ID = ? AND USER_DELETE_YN = 'N'";

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo selectedMember = null;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getUserId());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				int userNo = rs.getInt("USER_NO");
				String userId = rs.getString("USER_ID");
				String userPwd = rs.getString("USER_PWD");
				String userNickname = rs.getString("USER_NICKNAME");
				String userEmail = rs.getString("USER_EMAIL");
				String userPhone = rs.getString("USER_PHONE");
				Timestamp userJoinDate = rs.getTimestamp("USER_JOIN_DATE");
				String userType = rs.getString("USER_TYPE");
				String userDeleteYn = rs.getString("USER_DELETE_YN");
				Timestamp LastLoginDate = rs.getTimestamp("LASTLOGIN_DATE");

				selectedMember = new MemberVo();
				selectedMember.setUserNo(userNo);
				selectedMember.setUserId(userId);
				selectedMember.setUserPwd(userPwd);
				selectedMember.setUserNickname(userNickname);
				selectedMember.setUserEmail(userEmail);
				selectedMember.setUserPhone(userPhone);
//				selectedMember.setUserJoinDate(userJoinDate);
//				selectedMember.setUserType(userType);
//				selectedMember.setUserDeleteYn(userDeleteYn);
//				selectedMember.setLastLoginDate(LastLoginDate);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}

		return selectedMember;
	}

	public int countNotiAll(Connection conn) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT COUNT(NOTICE_NO) FROM TB_NOTICE WHERE DELETE_YN = 'N'";
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}

		return result;
	}

//	public MemberVo updateMember(Connection conn, MemberVo m) {
//
//		String query = "UPDATE TB_USER SET USER_EMAIL = ? WHERE USER_ID = ?";
//
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		MemberVo selectedMember = null;
//
//		try {
//			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, m.getUserEmail());
//
//			rs = pstmt.executeQuery();
//
//			if (rs.next()) {
//				int userNo = rs.getInt("USER_NO");
//				String userId = rs.getString("USER_ID");
//				String userPwd = rs.getString("USER_PWD");
//				String userNickname = rs.getString("USER_NICKNAME");
//				String userEmail = rs.getString("USER_EMAIL");
//				String userPhone = rs.getString("USER_PHONE");
//				Timestamp userJoinDate = rs.getTimestamp("USER_JOIN_DATE");
//				String userType = rs.getString("USER_TYPE");
//				String userDeleteYn = rs.getString("USER_DELETE_YN");
//				Timestamp LastLoginDate = rs.getTimestamp("LASTLOGIN_DATE");
//
//				selectedMember = new MemberVo();
////				selectedMember.setUserNo(userNo);
//				selectedMember.setUserId(userId);
////				selectedMember.setUserPwd(userPwd);
////				selectedMember.setUserNickname(userNickname);
//				selectedMember.setUserEmail(userEmail);
////				selectedMember.setUserPhone(userPhone);
////				 selectedMember.setUserJoinDate(userJoinDate);
////				 selectedMember.setUserType(userType);
////				 selectedMember.setUserDeleteYn(userDeleteYn);
////				 selectedMember.setLastLoginDate(LastLoginDate);
//
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(rs);
//			close(pstmt);
//		}
//
//		return selectedMember;
//	}

	public int deleteMember(Connection conn, MemberVo m) throws SQLException {
		// 쿼리 날리기

		String sql = "UPDATE TB_USER SET USER_DELETE_YN = 'Y' WHERE USER_PWD = ? AND USER_ID = ?";

		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getUserPwd());
			pstmt.setString(2, m.getUserId()); // 세션에있는 유저아이디를 가져온다?

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public List<MemberVo> selectMemberAll(Connection conn) {
		String query = "SELECT * FROM TB_USER WHERE USER_DELETE_YN = 'N'";

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberVo> memberList = new ArrayList<MemberVo>();

		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			MemberVo selectedMember = null;

			while (rs.next()) {
				int userNo = rs.getInt("USER_NO");
				String userId = rs.getString("USER_ID");
				String userPwd = rs.getString("USER_PWD");
				String userNickname = rs.getString("USER_NICKNAME");
				String userEmail = rs.getString("USER_EMAIL");
				String userPhone = rs.getString("USER_PHONE");
				Timestamp userJoinDate = rs.getTimestamp("USER_JOIN_DATE");
				String userType = rs.getString("USER_TYPE");
				String userDeleteYn = rs.getString("USER_DELETE_YN");
				Timestamp lastLoginDate = rs.getTimestamp("LASTLOGIN_DATE");

				selectedMember = new MemberVo();
				selectedMember.setUserNo(userNo);
				selectedMember.setUserId(userId);
				selectedMember.setUserPwd(userPwd);
				selectedMember.setUserNickname(userNickname);
				selectedMember.setUserEmail(userEmail);
				selectedMember.setUserPhone(userPhone);
				selectedMember.setUserJoinDate(userJoinDate);
				selectedMember.setUserType(userType);
				selectedMember.setUserDeleteYn(userDeleteYn);
				selectedMember.setLastLoginDate(lastLoginDate);

				memberList.add(selectedMember);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}

		return memberList;
	}

	public int updateEmail(Connection conn, MemberVo m) throws SQLException {

		String sql = "UPDATE TB_USER SET USER_EMAIL = ? WHERE USER_ID = ?";

		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getUserEmail());
			pstmt.setString(2, m.getUserId());

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int updatePhone(Connection conn, MemberVo m) throws SQLException {

		String sql = "UPDATE TB_USER SET USER_PHONE = ? WHERE USER_ID = ?";

		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getUserPhone());
			pstmt.setString(2, m.getUserId());

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int updatePwd(Connection conn, MemberVo m) throws SQLException {

		String sql = "UPDATE TB_USER SET USER_PWD = ? WHERE USER_ID = ?";

		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getUserPwd());
			pstmt.setString(2, m.getUserId());

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}

		return result;
	}
	
//	public MemberVo updatePwd2(Connection conn, MemberVo m) {
//
//		String query = "UPDATE TB_USER SET USER_PWD = ?";
//		
//
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		MemberVo updatePwd2 = null;
//
//		try {
//			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, m.getUserPwd());
//			pstmt.setString(2, m.getUserPwd());
//
//			rs = pstmt.executeQuery();
//
//			if (rs.next()) {
//				int userNo = rs.getInt("USER_NO");
//				String userId = rs.getString("USER_ID");
//				String userPwd = rs.getString("USER_PWD");
//				String userNickname = rs.getString("USER_NICKNAME");
//				String userEmail = rs.getString("USER_EMAIL");
//				String userPhone = rs.getString("USER_PHONE");
//				Timestamp userJoinDate = rs.getTimestamp("USER_JOIN_DATE");
//				String userType = rs.getString("USER_TYPE");
//				String userDeleteYn = rs.getString("USER_DELETE_YN");
//				Timestamp LastLoginDate = rs.getTimestamp("LASTLOGIN_DATE");
//
//				updatePwd2 = new MemberVo();
//				updatePwd2.setUserPwd(userPwd);
//
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(rs);
//			close(pstmt);
//		}
//
//		return updatePwd2;
//	}
	
	public int updateNickname(Connection conn, MemberVo m) throws SQLException {

		String sql = "UPDATE TB_USER SET USER_NICKNAME = ? WHERE USER_ID = ?";

		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getUserNickname());
			pstmt.setString(2, m.getUserId());

			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}

		return result;
	}

	
}
