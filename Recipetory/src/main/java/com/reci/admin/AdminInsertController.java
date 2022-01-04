package com.reci.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adInsert")
public class AdminInsertController extends HttpServlet {
	
	//관리자 생성
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("UTF-8");
			
			String adminId = req.getParameter("adminId");
			String adminPwd = req.getParameter("adminPwd");
			String adminName = req.getParameter("adminName");
			String adminLv = req.getParameter("adminLv");
		
			AdminVo ad = new AdminVo();
			ad.setAdminId(adminId);
			ad.setAdminPwd(adminPwd);
			ad.setAdminName(adminName);
			ad.setAdminLv(adminLv);

			//회원가입은 insert update 로직, 몇개 행을 건드렸는지 정수값
			int result = new AdminService().insert(ad);
			
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
						"<script>alert('계정 생성에 실패하였습니다. 다시 시도해주십시오.');"
						+ "location.href='./mAdmin';</script>"
						); 
				writer.close();
				
			}
		}
}
