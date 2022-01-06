package com.reci.join.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.admin.AdminService;
import com.reci.admin.AdminVo;

@WebServlet("/delete")
public class DeleteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/join/delete.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String userPwd = req.getParameter("userPwd");
		String userId = req.getParameter("userId");

		MemberVo m = new MemberVo();
		m.setUserPwd(userPwd);
		m.setUserId(userId);

		int result = new MemberService().delete(m);
		
		System.out.println(result);
		
		if(result > 0) {
			//success
			req.getRequestDispatcher("/WEB-INF/views/join/delete1.jsp").forward(req, resp);
		}else {
			//error
			req.getRequestDispatcher("/WEB-INF/views/join/delete2.jsp").forward(req, resp);
			
		}
	}
}