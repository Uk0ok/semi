package com.reci.chal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CreviewDao {

		private Connection conn;
		private ResultSet rs;
		
		//기본 생성자
		public CreviewDao() {
			try {
				String url ="jdbc:oracle:thin:@127.0.0.1:1521/xe";
				String id = "WEB";
				String pwd = "WEB";
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection(url, id, pwd);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		//작성일자 메소드
		public String getDate() {
			String sql = "select now()";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					return rs.getString(1);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			return ""; //데이터베이스 오류
		}
		
		//게시글 번호 부여 메소드
		public int getNext() {
			//현재 게시글을 내림차순으로 조회하여 가장 마지막 글의 번호를 구한다
			String sql = "select reviewNo from tb_review_c order by reviewNo desc";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					return rs.getInt(1) + 1;
				}
				return 1; //첫 번째 게시물인 경우
			}catch (Exception e) {
				e.printStackTrace();
			}
			return -1; //데이터베이스 오류
		}
		
		//글쓰기 메소드
		public int reviewwrite(String reviewStar, String reviewName, String cthumbnail, String reviewContent) {
			String sql = "insert into tb_review_c values(SEQ_CHA_RVO.NEXTVAL, '1', ?, ?, ?, SYSDATE, ?, 'N', SYSDATE, 'N')";
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, getNext());
				pstmt.setString(2, reviewStar);
				pstmt.setString(3, reviewName);
				pstmt.setString(4, cthumbnail);
				pstmt.setString(5, reviewContent);
				pstmt.setInt(6, 1); //글의 유효번호
				return pstmt.executeUpdate();
			}catch (Exception e) {
				e.printStackTrace();
			}
			return -1; //데이터베이스 오류
		}
	    
}
