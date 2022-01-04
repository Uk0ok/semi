package com.reci.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.join.controller.MemberService;
import com.reci.join.controller.MemberVo;

@WebServlet("/mUser")
public class MUserController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<MemberVo> memberList = new MemberService().search();
		
		req.setAttribute("memberList", memberList);
		
		req.getRequestDispatcher("/WEB-INF/views/admin/mUser.jsp").forward(req, resp);
	}
}
