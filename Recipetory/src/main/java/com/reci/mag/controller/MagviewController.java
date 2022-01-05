package com.reci.mag.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.mag.Vo.MagVo;
import com.reci.mag.dao.MagHDao;
import com.reci.mag.service.MagviewService;

@WebServlet("/magView")
public class MagviewController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//화면에서 값 가져오기
		String mag = req.getParameter("mag");
		int postNo = Integer.parseInt(mag);
		int pageNo = Integer.parseInt(req.getParameter("pageNo"));
		
		req.setAttribute("postNo", postNo);
		req.setAttribute("pageNo", pageNo);
		
		//글 상세보기
		MagVo magView =  MagviewService.magView(postNo);
		System.out.println("magView : " + magView);
		req.setAttribute("magView", magView);
		
		req.getRequestDispatcher("/WEB-INF/views/magazine/magView.jsp").forward(req, resp);
	}
	
}
