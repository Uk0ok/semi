package com.reci.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/adMod")
public class AdminModController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int adminNo = Integer.parseInt(req.getParameter("adminNo")) ;
		
		AdminVo ad = new AdminVo();
		ad.setAdminNo(adminNo);
	
		int result = new AdminService().mod(ad);
		
		System.out.println(adminNo);
		System.out.println(result);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('선택한 계정이 삭제되었습니다.');"
					+ "location.href='./mAdmin';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('선택한 계정 삭제를 실패하였습니다. 다시 시도해주세요.');"
					+ "location.href='./mAdmin';</script>"
					); 
			writer.close();
			
		}
	}
}
