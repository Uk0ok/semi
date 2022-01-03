package com.reci.sup.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.dao.NotiDao;
import com.reci.sup.vo.NotiVo;

@WebServlet("/nView")
public class NViewController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int noticeNo = Integer.parseInt(req.getParameter("noticeNo"));
		int pageNo = Integer.parseInt(req.getParameter("pageNo"));
		
		NotiVo notiView = NotiDao.notiView(noticeNo);
		
		req.getRequestDispatcher("/WEB-INF/views/support/nView.jsp").forward(req, resp);
	}

}
