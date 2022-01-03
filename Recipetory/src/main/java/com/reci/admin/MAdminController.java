package com.reci.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mAdmin")
public class MAdminController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<AdminVo> adminList = new AdminService().search();
		
		req.setAttribute("adminList", adminList);
		
		req.getRequestDispatcher("/WEB-INF/views/admin/mAdmin.jsp").forward(req, resp);
	}
	
	//관리자 생성
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String adminId = req.getParameter("adminId");
		String adminPwd = req.getParameter("adminPwd");
		String adminName = req.getParameter("adminName");
		String adminLv = req.getParameter("adminLv");
		
		System.out.println(adminId);
		System.out.println(adminPwd);
		System.out.println(adminName);
		System.out.println(adminLv);
		
		AdminVo ad = new AdminVo();
		ad.setAdminId(adminId);
		ad.setAdminPwd(adminPwd);
		ad.setAdminName(adminName);
		ad.setAdminLv(adminLv);

		//회원가입은 insert update 로직, 몇개 행을 건드렸는지 정수값
		int result = new AdminService().join(ad);
		
		System.out.println(result);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('새로운 관리자 계정이 생성되었습니다.');"
					+ "location.href='./mAdmin';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('다시 시도해주십시오.');"
					+ "location.href='./mAdmin';</script>"
					); 
			writer.close();
			
		}
	}
}
