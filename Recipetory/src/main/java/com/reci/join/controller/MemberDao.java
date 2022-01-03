package com.reci.join.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import oracle.sql.TIMESTAMP;

import static com.reci.common.JDBCTemplate.*;


public class MemberDao {

	public int insertMember(Connection conn, MemberVo m) throws SQLException {
		//쿼리 날리기
		
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
			
			if(rs.next()) {
				int userNo = rs.getInt("USER_NO");
				String userId = rs.getString("USER_ID");
				String userPwd = rs.getString("USER_PWD");
				String userNickname = rs.getString("USER_NICKNAME");
				String userEmail = rs.getString("USER_EMAIL");
				String userPhone = rs.getString("USER_PHONE");
				Timestamp userJoinDate = rs.getTimestamp("USER_JOIN_DATE");
				String userType = rs.getString("USER_TYPE");
				String userDeleteYn = rs.getString("USER_DELETE_YN");
				Timestamp LastLoginDate = rs.getTimestamp("LAST_LOGIN_DATE");

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
	
}
