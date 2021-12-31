package com.reci.join.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.reci.join.controller.MemberService;
import com.reci.common.JDBCTemplate;
import com.reci.join.controller.Member;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
@WebServlet("/join")
public class JoinController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/join/join.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String userId = req.getParameter("userId");
		String userPwd1 = req.getParameter("userPwd1");
		String userNickname = req.getParameter("userNickname");
		String userEmail = req.getParameter("userEmail");
		String userPhone = req.getParameter("userPhone");

		System.out.println("ID : " + userId);
		System.out.println("PASSWORD : " + userPwd1);
		System.out.println("NICKNAME : " + userNickname);
		System.out.println("EMAIL : " + userEmail);
		System.out.println("PHONE : " + userPhone);

		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "INSERT INTO TB_USER"
				+ "(USER_NO, USER_ID, USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN)"
				+ "VALUES " + "(SEQ_UNO.NEXTVAL, ?, ?, ?, ?, ?, SYSDATE, 'USER', 'N')";

		conn = JDBCTemplate.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd1);
			pstmt.setString(3, userNickname);
			pstmt.setString(4, userEmail);
			pstmt.setString(5, userPhone);
			result = pstmt.executeUpdate();

			JDBCTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback(conn);
		} finally {
			JDBCTemplate.close(conn);
		}

		if (result > 0) {
			resp.sendRedirect("./home");
		} else {
			resp.sendRedirect("./join");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// swy start
		/*
		 * 
		 * // 회원 정보를 DB에 insert // DB 연결 connection // sql // stmt || pstmt // int
		 * result(추가) || ResultSet rs(조회)
		 * 
		 * Connection conn = null; PreparedStatement pstmt = null; int result = 0;
		 * String sql = "INSERT INTO TB_USER" +
		 * "(USER_NO, USER_ID, USER_PWD, USER_NICKNAME, UESR_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN)"
		 * + "VALUES " + "(SEQ_UNO.NEXTVAL, ?, ?, ?, ?, ?, SYSDATE, 'U', 'N')";
		 * 
		 * conn = JDBCTemplate.getConnection(); try { pstmt =
		 * conn.prepareStatement(sql); pstmt.setString(1, userId); pstmt.setString(2,
		 * userPwd1); pstmt.setString(3, userNickname); pstmt.setString(4, userEmail);
		 * pstmt.setString(5, userPhone); result = pstmt.executeUpdate(); // int(행)일때(INSERT(추가)) executeQuery는 테이블값일때(SELECT(조회))
		 * 
		 * //별 문제 없으면 커밋 JDBCTemplate.commit(conn); } catch (SQLException e) {
		 * e.printStackTrace(); JDBCTemplate.rollback(conn); } finally {
		 * JDBCTemplate.close(conn); }
		 * 
		 * // insert 성공 여부 알려주기 if(result > 0) { resp.sendRedirect("./home"); }else {
		 * resp.sendRedirect("./join"); }
		 */
		// swy end

	}

}
