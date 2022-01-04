package com.reci.chal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/reviewwrite")
public class ChalReviewWriteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/challenge/challenge_review_write.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String postName = req.getParameter("postName");
		String challengePeriod = req.getParameter("challengePeriod");
		String thumbnail = req.getParameter("thumbnail");
		String postContent = req.getParameter("postContent");
		
		System.out.println(postName);
		System.out.println(thumbnail);
	}
}
