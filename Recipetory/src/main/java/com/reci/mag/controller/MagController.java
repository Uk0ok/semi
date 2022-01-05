package com.reci.mag.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.mag.Vo.MagVo;
import com.reci.mag.service.MagService;

@WebServlet("/magazine")
public class MagController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String currentPage = req.getParameter("currentPage");
		if(currentPage == null) currentPage = "1";
		
		int maxPage = 5;
		
		int startPage = Integer.parseInt(currentPage) - 2;
		if(startPage <= 0) startPage = 1;
		int endPage = startPage + 2;
		
		req.setAttribute("maxPage", maxPage);
		req.setAttribute("currentPage", currentPage);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		
		List<MagVo> magList = new MagService().selectMagList(currentPage);
		//마이메소드에 리스트값 입력 (마지막순서)
		//메소드는 service로 분리
		//myMethod -> selectNotiList 이름변경
				
		//조회한 데이터를 jsp에 넘겨줌
		req.setAttribute("data", magList);
		req.getRequestDispatcher("/WEB-INF/views/magazine/magazine.jsp").forward(req, resp);
	}
}
