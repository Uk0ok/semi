package com.reci.join.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	//로그인 화면 보여주기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/join/login.jsp").forward(req, resp);
	}

		//로그인 진행
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			String userId = req.getParameter("userId");
			String userPwd = req.getParameter("userPwd");
			
			MemberVo m = new MemberVo();
			m.setUserId(userId);
			m.setUserPwd(userPwd);
			
			MemberVo loginUser = new MemberService().login(m);
			
			System.out.println(loginUser);
			
			if(loginUser != null) {
				//success
				req.getSession().setAttribute("loginUser", loginUser);
				req.getRequestDispatcher("./home").forward(req, resp);
			}else {
				//error
				req.getRequestDispatcher("./login").forward(req, resp);
			}
		}
	}
