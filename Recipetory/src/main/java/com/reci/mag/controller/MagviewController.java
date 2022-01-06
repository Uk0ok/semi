package com.reci.mag.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.mag.Vo.MagVo;
import com.reci.mag.service.MagService;
import com.reci.mag.service.MagviewService;

@WebServlet("/magazine/magView")
public class MagviewController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		//화면에서 값 가져오기
		String no = req.getParameter("no");
		int postNo = Integer.parseInt(no);
		int pageNo = Integer.parseInt(req.getParameter("pageNo"));
		
		req.setAttribute("postNo", postNo);
		req.setAttribute("pageNo", pageNo);
		
//		//조회수 증가
//				//새로고침 시 조회수가 증가하는 것을 방지하는 로직 -> 쿠키에 조회내용 기록
//				//1.쿠키에 조회한 이력이 있는지 확인
//				Cookie[] cookies = req.getCookies();
//				String boardHistory = ""; //이력을 저장하는 변수
//				boolean hasRead = false;  //읽었으면 true
//				
//				if(cookies != null) {
//					String name = null;
//					String value = null;
//					
//					for(Cookie cookie : cookies) {
//						name = cookie.getName();
//						value = cookie.getValue();
//						
//						//boardHistory인 쿠키값을 찾기
//						if("boardHistory".equals(name)) {
//							boardHistory = value;// 현재 저장된 값 대입
//							if(value.contains("|" + postNo + "|")) {
//								hasRead = true;
//								
//								break;
//							}
//						}
//					}
//				}
//				//2. 읽지 않았으면 cookie에 기록
//				if(!hasRead) {
//					Cookie cookie = new Cookie("boardHistory", boardHistory + "|" + postNo + "|");
//					
//					cookie.setMaxAge(-1); //브라우저 종료시 삭제
//					resp.addCookie(cookie);
//				}
//				
//				int result = MagService.updateHits(postNo, hasRead);
//				
		//글 상세보기
		MagVo magView =  MagviewService.magView(postNo);
		System.out.println("magView : " + magView);
		req.setAttribute("magView", magView);
		
		req.getRequestDispatcher("/WEB-INF/views/magazine/magView.jsp").forward(req, resp);
	}
	
}
