package com.reci.mag.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mag_content1")
public class Mag_content1_Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<MagVo> magList = new MagService().selectMagList(); //결과를 받아준다. 그리고 jsp에 넘기기. mymethod가 리턴하고 있지 않기때문에~
		
//		if (~~~) {
//			성공페이지로 포워딩
//		} else {
//			에러페이지로 포워딩
//		}
		
		//2.조회한 데이터를 화면(JSP)한테 넘겨줌  //단순 리스트 포워딩.
		req.setAttribute("mag_search", magList); // mag를 넘겨준다. // try안에 선언되어있는 mag 변수를 try밖에 선언.
		//data라는 키값을 이용해서 mag를 가져올수가 있다. //list로 만들어서 넘겨준다.
		req.getRequestDispatcher("/WEB-INF/views/magazine/mag_content1.jsp").forward(req, resp);
		
	}
	
}
