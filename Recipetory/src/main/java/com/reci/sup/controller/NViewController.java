package com.reci.sup.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.service.NotiService;
import com.reci.sup.vo.NotiVo;

@WebServlet("/support/nView")
public class NViewController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//글 상세보기
		int noticeNo = Integer.parseInt(req.getParameter("noticeNo"));
		req.setAttribute("noticeNo", noticeNo);
		
		String pageNo = req.getParameter("pageNo");
		req.setAttribute("pageNo", pageNo);
		
		System.out.println(noticeNo);
		System.out.println(pageNo);
		
		NotiVo notiView = NotiService.notiView(noticeNo);
		System.out.println("notiView : " + notiView);
		req.setAttribute("notiView", notiView);

	}
}
