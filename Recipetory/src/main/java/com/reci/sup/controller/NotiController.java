package com.reci.sup.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;
import com.reci.sup.service.NotiService;
import com.reci.sup.vo.NotiVo;

@WebServlet("/support")
public class NotiController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String currentPage= req.getParameter("currentPage");
		if(currentPage == null) currentPage = "1";
		
		int maxPage = 4;
		
		int startPage = Integer.parseInt(currentPage) - 3 ;
		if(startPage <= 0) startPage = 1;
		int endPage = startPage + 3;
		
		req.setAttribute("maxPage", maxPage);
		req.setAttribute("currentPage", currentPage);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		
		List<NotiVo> notiList = new NotiService().selectNotiList(currentPage); 
		//마이메소드에 리스트값 입력 (마지막순서)
		//메소드는 service로 분리
		//myMethod -> selectNotiList 이름변경
		
		//조회한 데이터를 jsp에 넘겨줌
		req.setAttribute("data", notiList);
		req.getRequestDispatcher("/WEB-INF/views/support/notice.jsp").forward(req, resp);

	}
	
	
}

