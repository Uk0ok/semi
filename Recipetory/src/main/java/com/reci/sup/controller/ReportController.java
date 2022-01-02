package com.reci.sup.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.service.QnaService;
import com.reci.sup.service.RepoService;
import com.reci.sup.vo.QnaVo;
import com.reci.sup.vo.RepoVo;

@WebServlet("/report")
public class ReportController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<RepoVo> repoList = new RepoService().selectRepoList();
		
		req.setAttribute("repoList", repoList);
		req.getRequestDispatcher("/WEB-INF/views/support/report.jsp").forward(req, resp);
	}
}
