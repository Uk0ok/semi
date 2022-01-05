package com.reci.join.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.admin.AdminService;
import com.reci.admin.AdminVo;

@WebServlet("/phoneUpdate")
public class PhoneUpdateController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/join/phoneupdate.jsp").forward(req, resp);

		int userNo = Integer.parseInt(req.getParameter("userNo"));

		MemberVo m = new MemberVo();
		m.setUserNo(userNo);

		
	}

}