package com.reci.join.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pwdUpdate")
public class PwdUpdateController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/join/pwdupdate.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String userPwd = req.getParameter("userPwd");
		String userId = req.getParameter("userId");

		MemberVo m = new MemberVo();
		m.setUserPwd(userPwd);
		m.setUserId(userId);

		int result = new MemberService().updatePwd(m);
		
		System.out.println(result);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('비밀번호 변경이 완료되었습니다.');"
					+ "location.href='./mypage';</script>"
					); 
			writer.close();
			req.getRequestDispatcher("/WEB-INF/views/join/mypage.jsp").forward(req, resp);
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('비밀번호가 변경되지 않았습니다.');"
					+ "location.href='./mypage4';</script>"
					); 
			writer.close();
			req.getRequestDispatcher("/WEB-INF/views/join/mypage4.jsp").forward(req, resp);
			
		}
	}
}