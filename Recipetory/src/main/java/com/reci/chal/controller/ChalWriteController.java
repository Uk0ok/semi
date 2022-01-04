package com.reci.chal.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;
import com.reci.chal.service.CwriteService;
import com.reci.chal.vo.CwriteVo;

@WebServlet("/challengewrite")
public class ChalWriteController extends HttpServlet{	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	  //챌린지 게시물 등록
	  req.setCharacterEncoding("UTF-8");
	  String cpostName = req.getParameter("postName");
	  String challengePeriod = req.getParameter("challengePeriod");
	  String cthumbnail = req.getParameter("thumbnail");
	  String cpostContent = req.getParameter("postContent");
	  
	  
	  CwriteVo cwv = new CwriteVo();
	  cwv.setCpostName(cpostName);
	  cwv.setChallengePeriod(challengePeriod);
	  cwv.setCthumbnail(cthumbnail);
	  cwv.setCpostContent(cpostContent);
	  
	  int result = new CwriteService().write(cwv);
	  
	  if(result > 0) {
		//success
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		writer.println("<script>alert('글이 정상적으로 작성되었습니다.');"
		+ "location.href='./challengeview';</script>"); 
		writer.close();
		}else {
		//error
		resp.setContentType("text/html; charset=UTF-8"); 
		PrintWriter writer = resp.getWriter();
		writer.println ("<script>alert('글 등록에 실패하였습니다. 다시 시도해주십시오.');"
		+ "location.href='./challengewrite';</script>"); 
		writer.close();
		}
			
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.getRequestDispatcher("/WEB-INF/views/challenge/challenge_write.jsp").forward(req, resp);
}
}