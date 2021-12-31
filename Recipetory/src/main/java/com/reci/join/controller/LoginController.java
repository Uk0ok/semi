package com.reci.join.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;

@WebServlet("/login")
public class LoginController extends HttpServlet {

//	private MemberService service = new MemberService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/join/login.jsp").forward(req, resp);
		req.setCharacterEncoding("UTF-8");
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");

		System.out.println("ID : " + userId);
		System.out.println("PASSWORD : " + userPwd);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO TB_USER"
				+ "(USER_NO, USER_ID, USER_PWD, USER_NICKNAME, USER_EMAIL, USER_PHONE, USER_JOIN_DATE, USER_TYPE, USER_DELETE_YN)"
				+ "VALUES " + "(SEQ_UNO.NEXTVAL, ?, ?, ?, ?, ?, SYSDATE, 'USER', 'N')";

		conn = JDBCTemplate.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);

			rs = pstmt.executeQuery();

			JDBCTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JDBCTemplate.rollback(conn);
		} finally {
			JDBCTemplate.close(conn);
		}

		if (rs.equals(userId)) {
			if (rs.equals(userPwd)) {
				System.out.println("login~~~");
				resp.sendRedirect("./home");
			}
		} else {
			System.out.println("fail~~");
			resp.sendRedirect("./join");
		}

//				Member loginMember = service.login(userId, userPwd);

//				System.out.println(loginMember);

	}
}