package com.reci.join.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginController2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/join/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");

		MemberVo m = new MemberVo();
		m.setUserId(userId);
		m.setUserPwd(userPwd);

		MemberVo loginUser = new MemberService().login(m);

		System.out.println(loginUser);

		if (loginUser != null) {
			// success
			req.getSession().setAttribute("loginUser", loginUser);
			req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		} else {
			// error
			req.getRequestDispatcher("/WEB-INF/views/reci/login.jsp").forward(req, resp);
		}
	}
}
