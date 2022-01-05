package com.reci.mag.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.mag.Vo.MagVo;
import com.reci.mag.service.MagService;

@WebServlet("/MboardRemove")
public class MagDeleteController extends HttpServlet{

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		RequestDispatcher dm = req.getRequestDispatcher("/WEB-INF/views/magazine/mMag.jsp");
//		dm.forward(req, resp);
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int postNo = Integer.parseInt(req.getParameter("postNo"));
		
		MagVo dm = new MagVo();
		dm.setPostNo(postNo);
		
		int result = new MagService().delete(dm); 
				
		System.out.println(postNo);
		System.out.println(result);
		
		if (result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('선택한 게시글이 삭제되었습니다.');"
					+ "location.href='./mMag';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('선택한 게시글 삭제를 실패하였습니다. 다시 시도해주세요.');"
					+ "location.href='./mMag';</script>"
					); 
			writer.close();
			
		}
		
	}
}
