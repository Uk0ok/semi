package com.reci.mag.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.mag.service.MagService;

@WebServlet("/MboardRemove")
public class MagDeleteController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Object action = null;
		if(action.equals("/MboardRemove")) {
			int postNo = Integer.parseInt(req.getParameter(""));
			
			int articleNum = MagService.deleteArticle(postNo);
//			nextPage = "/mMag";
		}
		
	}
}
