package com.reci.mag.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.reci.mag.Vo.MagDto;
import com.reci.mag.dao.MagDao;

public class MwriteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher mw = req.getRequestDispatcher("/WEB-INF/views/magazine/magWrite.jsp");
		mw.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
//		HttpSession session = req.getSession();
//		int sessionID = (int) session.getAttribute("sessionID");
		
		String POST_NAME = req.getParameter("POST_NAME");
		String POST_CONTENT = req.getParameter("POST_CONTENT");
//		int ADMIN_NO = Integer.parseInt(req.getParameter("ADMIN_NO"));
		
		MagDao magDao = MagDao.getInstance();
		MagDto magDto = new MagDto();
		magDto.setPOST_NO(magDao.nextval() + 1);
		magDto.setPOST_NAME(POST_NAME);
		magDto.setPOST_CONTENT(POST_CONTENT);
//		magDto.setADMIN_NO(sessionID);
		
		int wResult = magDao.write(magDto);
		System.out.println(wResult);
		resp.sendRedirect("mMag.do");
		
		
	}
	
	
}
