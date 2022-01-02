package com.reci.sup.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.service.QnaService;
import com.reci.sup.vo.QnaVo;

@WebServlet("/qna")
public class QnaController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<QnaVo> qnaList = new QnaService().selectQnaList();
		
		req.setAttribute("qnaList", qnaList);
		req.getRequestDispatcher("/WEB-INF/views/support/qna.jsp").forward(req, resp);
	}
}
