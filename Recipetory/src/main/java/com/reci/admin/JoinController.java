package com.reci.admin;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/join")
public class JoinController extends HttpServlet {
	 
	//관리자 가입 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("관리자가입화면~").forward(req, resp);
	}
	
	//회원가입 진행
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int adminNo = Integer.parseInt(req.getParameter("adminNo")); 
		String adminId = req.getParameter("adminId");
		String adminPwd = req.getParameter("adminPwd");
		String adminName = req.getParameter("adminName");
		String adminLv = req.getParameter("adminLv");
	//	String joinDate = req.getParameter("joinDate");
	//	String deleteDate = req.getParameter("deleteDate");
		
		AdminVo ad = new AdminVo();
		ad.setAdminId(adminId);
		ad.setAdminPwd(adminPwd);
		ad.setAdminName(adminName);
		ad.setAdminLv(adminLv);
	//	ad.setJoinDate(joinDate);
	//	ad.setDeleteDate(deleteDate);
		
		//회원가입은 insert update 로직, 몇개 행을 건드렸는지 정수값
		int result = new AdminService().join(ad);
		
		if(result > 0) {
			//success
			req.setAttribute("msg", "가입성공");
			req.getRequestDispatcher("성공시 이동할 페이지");
		}else {
			//error
			req.setAttribute("msg", "가입실패");
			req.getRequestDispatcher("실패시 이동할 페이지");
			
		}
	}
}
