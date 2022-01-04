package com.reci.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mAdmin")
public class MAdminController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<AdminVo> adminList = new AdminService().search();
		
		req.setAttribute("adminList", adminList);
		
		req.getRequestDispatcher("/WEB-INF/views/admin/mAdmin.jsp").forward(req, resp);
	}

}
