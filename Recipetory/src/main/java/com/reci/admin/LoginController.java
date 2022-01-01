package com.reci.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class LoginController extends HttpServlet {

	//로그인 화면 보여주기
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/admin/login.jsp").forward(req, resp);
	}

	//로그인 진행
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String adminId = req.getParameter("adminId");
		String adminPwd = req.getParameter("adminPwd");
		
		AdminVo ad = new AdminVo();
		ad.setAdminId(adminId);
		ad.setAdminPwd(adminPwd);
		
		AdminVo loginUser = new AdminService().login(ad);
		
		System.out.println(loginUser);
		
		if(loginUser != null) {
			//success
			req.getSession().setAttribute("loginUser", loginUser);
			req.getRequestDispatcher("/WEB-INF/views/admin/home.jsp").forward(req, resp);
		}else {
			//error
			req.getRequestDispatcher("/WEB-INF/views/admin/login.jsp").forward(req, resp);
		}
	}
}
