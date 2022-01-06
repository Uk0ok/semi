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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.mag.Vo.MagC_Vo;
import com.reci.mag.Vo.MagVo;
import com.reci.mag.service.MagC_Service;

@WebServlet("/mag_content1")
public class Mag_content1_Controller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/magazine/mag_content1.jsp").forward(req, resp);
		
	}
}
		
		
//		int no = Integer.parseInt(req.getParameter("no"));
		
		
//		//쿠키에 조회한 이력이 있는 지 확인
//		Cookie[] cookies = req.getCookies();
//		String boardHistory = "";
//		boolean hasRead = false;
//		
//		if(cookies != null) {
//			String name = null;
//			String value = null;
//			
//			for(Cookie cookie : cookies) {
//				name = cookie.getName();
//				value = cookie.getValue();
//				
//				if("boardHistoy".equals(name)) {
//					boardHistory = value;
//					if(value.contains("|" + no + "|")) {
//						//읽은 게시글
//						hasRead = true;
//						
//						break;
//					}
//				}
//			}
//		}
//		
//		// 읽지 않은 게시글이면 cookie에 기록
//		if(!hasRead) {
//			Cookie cookie = new Cookie("boardHistory", boardHistory + "|" + no + "|");
//			
//			cookie.setMaxAge(7*24*60*60);//생명주기 일단 일주일
//			resp.addCookie(cookie);
//		}
		
		
		
		
		
//		List<MagC_Vo> magCList = new MagC_Service().selectMagCList(); //결과를 받아준다. 그리고 jsp에 넘기기. mymethod가 리턴하고 있지 않기때문에~
		
//		if (~~~) {
//			성공페이지로 포워딩
//		} else {
//			에러페이지로 포워딩
//		}
		
		//2.조회한 데이터를 화면(JSP)한테 넘겨줌  //단순 리스트 포워딩.
//		req.setAttribute("magC_search", magCList); // mag를 넘겨준다. // try안에 선언되어있는 mag 변수를 try밖에 선언.
		//data라는 키값을 이용해서 mag를 가져올수가 있다. //list로 만들어서 넘겨준다.
//		req.getRequestDispatcher("/WEB-INF/views/magazine/mag_content1.jsp").forward(req, resp);
		
	
