package com.reci.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.service.QnaService;
import com.reci.sup.vo.QnaVo;

@WebServlet("/mQna")
public class MQnaController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<QnaVo> qnaListAll = new QnaService().qnaListAll();
		
		req.setAttribute("qnaListAll", qnaListAll);
		req.getRequestDispatcher("/WEB-INF/views/admin/mQna.jsp").forward(req, resp);
	}
}
