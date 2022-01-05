package com.reci.join.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emailUpdate")
public class EmailUpdateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/join/emailupdate.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String userEmail = req.getParameter("userEmail");

		MemberVo m = new MemberVo();
		m.setUserEmail(userEmail);

		int result = new MemberService().updateEmail(m);
		
		System.out.println(result);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('이메일 변경이 완료되었습니다.');"
					+ "location.href='./mypage4';</script>"
					); 
			writer.close();
			req.getRequestDispatcher("/WEB-INF/views/join/mypage4.jsp").forward(req, resp);
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('이메일이 변경되지 않았습니다.');"
					+ "location.href='./mypage4';</script>"
					); 
			writer.close();
			req.getRequestDispatcher("/WEB-INF/views/join/mypage4.jsp").forward(req, resp);
			
		}
	}
}
