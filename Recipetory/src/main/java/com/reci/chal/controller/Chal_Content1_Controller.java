package com.reci.chal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.chal.service.CboardService;
import com.reci.chal.vo.CboardVo;

@WebServlet("/challenge_1")
public class Chal_Content1_Controller extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	List<CboardVo> CboardList = new CboardService().selectCboardList();
	
	req.setAttribute("data", CboardList);

	req.getRequestDispatcher("/WEB-INF/views/challenge/challenge_1.jsp").forward(req, resp);
}
}
