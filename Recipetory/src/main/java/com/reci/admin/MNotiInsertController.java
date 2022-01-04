package com.reci.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.service.NotiService;
import com.reci.sup.vo.NotiVo;

@WebServlet("/mNotiInsert")
public class MNotiInsertController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String noticeTitle = req.getParameter("noticeTitle");
		String adminId = req.getParameter("adminId");
		String 사진 = req.getParameter("사진");
		String noticeContent = req.getParameter("noticeContent");
	
		AdminVo getAdminNo = NotiService.getAdminNo(adminId);
		
		NotiVo n = new NotiVo();
		n.setNoticeTitle(noticeTitle);
		n.set();
		n.setNoticeContent(noticeContent);
		
		int result = new AdminService().insertNotice(n);
		
		System.out.println(result);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('공지사항이 정상적으로 등록되었습니다.');"
					+ "location.href='./mAdmin';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('공지사항 등록에 실패하였습니다.');"
					+ "location.href='./mAdmin';</script>"
					); 
			writer.close();
			
		}
	}
	}
}
