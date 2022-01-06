package com.reci.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.service.NotiService;
import com.reci.sup.vo.NotiVo;

@WebServlet("/noDelete")
public class MNotiDeleteController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("delete controller");
		
		int noticeNo = 0;
		try {
			String no = req.getParameter("noticeNo");
			noticeNo = Integer.parseInt(no);
		} catch(NumberFormatException e ) {
			noticeNo = 100;
		}
		
		System.out.println(noticeNo);
		
		NotiVo n = new NotiVo();
		n.setNoticeNo(noticeNo);
	
		int result = new NotiService().delete(n);
		
		System.out.println(result);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('선택한 공지사항이 삭제되었습니다.');"
					+ "location.href='./mNoti';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('선택한 공지사항 삭제를 실패하였습니다. 다시 시도해주세요.');"
					+ "location.href='./mNoti';</script>"
					); 
			writer.close();
			
		}
	}

}
