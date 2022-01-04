package com.reci.sup.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.admin.AdminService;
import com.reci.sup.service.NotiService;
import com.reci.sup.vo.NotiVo;

@WebServlet("/support/nView")
public class NViewController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no = req.getParameter("no");
		int noticeNo = Integer.parseInt(no);
		int pageNo = Integer.parseInt(req.getParameter("pageNo"));
		
		req.setAttribute("noticeNo", noticeNo);
		req.setAttribute("pageNo", pageNo);
	
		//조회수 증가
		int result = NotiService.updateHits(noticeNo);

		//글 상세보기
		NotiVo notiView = NotiService.notiView(noticeNo);
		System.out.println("notiView : " + notiView);
		req.setAttribute("notiView", notiView);
		
		req.getRequestDispatcher("/WEB-INF/views/support/nView.jsp").forward(req, resp);

	}
}
