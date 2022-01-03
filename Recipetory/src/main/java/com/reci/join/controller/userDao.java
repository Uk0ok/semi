package com.reci.join.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.reci.common.JDBCTemplate;

public class userDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public userDao() {
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
			String id = "WEB";
			String pwd = "WEB";
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int login(String userId, String userPassword) {
		String SQL = "SELECT USER_PWD FROM TB_USER WHERE USER_ID = ?";

		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if(rs.getString(1).equals(userPassword)) {
					return 1; // 로그인 성공
				}else {
					return 0; // 비밀번호 불일치
				}
			}
			return -1; // 아이디 없음
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // 데이터베이스 오류
	}

}
