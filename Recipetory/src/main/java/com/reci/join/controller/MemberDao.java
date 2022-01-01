package com.reci.join.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import oracle.sql.TIMESTAMP;

import static com.reci.common.JDBCTemplate.*;

public class MemberDao {

	public MemberVo selectMember(Connection conn, MemberVo m) {
		String query = "SELECT * FROM TB_USER WHERE ID = ? AND USER_DELETE_YN = 'N'";

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo selectedMember = null;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getUserId());
			System.out.println(pstmt);
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
				Timestamp LastLoginDate = rs.getTimestamp("LAST_LOGIN_DATE");

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
				selectedMember.setLastLoginDate(LastLoginDate);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return selectedMember;
	}

//
//	public int selectMemberById(Connection conn, String id) {
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		int result = 0;
//		String sql = "SELECT COUNT(*) FROM TB_USER WHERE USER_ID = ?";
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			rs = pstmt.executeQuery();
//			
//			rs.next();
//			result = rs.getInt(1);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(rs);
//		}
//		return result;
//
//	}
//
//	public List<MemberVo> selectMemberBySearch(Connection conn, String type, String value) {
//		
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "SELECT * FROM TB_USER WHERE %s LIKE ?";
//		sql = String.format(sql, type);
//		System.out.println("SQL ::: " + sql);
//		
//		List<MemberVo> list = new ArrayList<MemberVo>();
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "%" + value + "%");
//			
//			MemberVo selectedMember = null;
//			
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				int userNo = rs.getInt("USER_NO");
//				String userId = rs.getString("USER_ID");
//				String userPassword = rs.getString("USER_PWD");;
//				String userNickname = rs.getString("USER_NICKNAME");;
//				String userEmail = rs.getString("USER_EMAIL");;
//				String userPhone = rs.getString("USER_PHONE");;
//				
//				selectedMember = new MemberVo();
//				selectedMember.setUserNo(userNo);
//				selectedMember.setUserId(userId);
//				selectedMember.setUserPwd1(userPassword);
//				selectedMember.setUserNickname(userNickname);
//				selectedMember.setUserEmail(userEmail);
//				selectedMember.setUserPhone(userPhone);
//				
//				list.add(selectedMember);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return list;
//	}
//
//	public int countMemberAll(Connection conn) {
//		
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		String sql = "SELECT COUNT(USER_NO) FROM TB_USER ";
////		 WHERE USER_DELETE_YN = 'Y'
//		int result = 0;
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			if(rs.next()) {
//				result = rs.getInt(1);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(rs);
//		}
//		
//		return result;
//	}

}
