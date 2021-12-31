package com.reci.join.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	private MemberService service = new MemberService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/join/login.jsp").forward(req, resp);

				String userId = req.getParameter("userId");
				String userPwd = req.getParameter("userPwd");

				System.out.println("ID : " + userId + "\nPASSWORD : " + userPwd);

//				Member loginMember = service.login(userId, userPwd);
				
//				System.out.println(loginMember);

	}
}