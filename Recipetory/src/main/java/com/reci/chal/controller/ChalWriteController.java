package com.reci.chal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/challengewrite")
public class ChalWriteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/challenge/challenge_write.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String postName = req.getParameter("postName");
		String postContent = req.getParameter("postContent");
		
		String url ="jdbc:oracle:thin:@127.0.0.1:1521/xe";
		String id = "WEB";
		String pwd ="WEB";
		
		String sql = "INSERT INTO TB_BOARD_CHALLENGE(POST_NO, USER_NO, POST_NAME, POST_CONTENT, BEG_DATE,CHALLENGE_PERIOD, PARTI_NUM, HITS, COMM_NUM, REVIEW_NUM, THUMBNAIL, MOD_YN, FMOD_DATE,DEL_YN)"
		+"VALUES(SEQ_CHA_PNO.NEXTVAL,?,?,?,SYSDATE,?,?,SYSDATE)";
	}
}
