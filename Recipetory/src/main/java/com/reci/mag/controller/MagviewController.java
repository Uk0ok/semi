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

@WebServlet("/magView")
public class MagviewController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
		System.out.println("ddd");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
		System.out.println("post");
	}
	
	private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int postNo = Integer.parseInt(req.getParameter("postNo"));
//		MagHDao magVDao = MagHDao.getInstance();
		MagVo magVo = new MagVo();
//		MagHDao.hitUpdate(magVo);
//		magVo = MagHDao.selectById(postNo);
		
		req.setAttribute("magview", magVo);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/magazine/magView.jsp");
		rd.forward(req, resp);
	}
}
