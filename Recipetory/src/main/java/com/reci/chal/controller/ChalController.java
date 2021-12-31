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

@WebServlet("/challenge2")
public class ChalController extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("컨트롤러 호출됨...");//swy
		
		List<CboardVo> CboardList = new CboardService().selectCboardList();
		
		

		req.setAttribute("data", CboardList);
		for(CboardVo x : CboardList) {
			System.out.println("==================");
			System.out.println("test ::: " + x);
		}
		req.getRequestDispatcher("/WEB-INF/views/challenge/challenge.jsp").forward(req, resp);
	}
}
