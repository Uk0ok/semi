package com.reci.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.dao.RepoDao;
import com.reci.sup.service.NotiService;
import com.reci.sup.service.QnaService;
import com.reci.sup.service.RepoService;
import com.reci.sup.vo.NotiVo;
import com.reci.sup.vo.QnaVo;
import com.reci.sup.vo.RepoVo;

@WebServlet("/mReport")
public class MRepoController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<RepoVo> repoListAll = new RepoService().repoListAll();
		
		req.setAttribute("repoListAll", repoListAll);
		req.getRequestDispatcher("/WEB-INF/views/admin/mRepo.jsp").forward(req, resp);
	}
}
