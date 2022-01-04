package com.reci.mag.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.reci.mag.Vo.MagVo;
import com.reci.mag.dao.MagDao;
import com.reci.mag.service.MagService;

@WebServlet("/mwrite")
public class MwriteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher mw = req.getRequestDispatcher("/WEB-INF/views/magazine/magWrite.jsp");
		mw.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		String postName = req.getParameter("postName");
		String postContent = req.getParameter("postContent");
		int adminNo = Integer.parseInt(req.getParameter("adminNo"));
		
		System.out.println(postName);
		System.out.println(postContent);
		System.out.println(adminNo);
		
		MagVo mw = new MagVo();
		mw.setPostName(postName);
		mw.setPostContent(postContent);
		mw.setAdminNo(adminNo);
		
		int result = new MagService().insert(mw);
		
		System.out.println(result);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('새로운 매거진 게시글이 생성되었습니다.');"
					+ "location.href='./mMag';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('게시글 작성에 실패하였습니다. 다시 시도해주십시오.');"
					+ "location.href='./mMag';</script>"
					); 
			writer.close();
	}
	
	
	}
}
