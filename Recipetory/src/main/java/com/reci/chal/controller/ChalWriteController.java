package com.reci.chal.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.reci.chal.service.CboardService;
import com.reci.common.JDBCTemplate;
import com.reci.chal.vo.CboardVo;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
@WebServlet("/challengewrite")
public class ChalWriteController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/challenge/challenge_write.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String cpostName = req.getParameter("cpostName");
		String challengePeriod = req.getParameter("challengePeriod");
		String cthumbnail = req.getParameter("cthumbnail");
		String cpostContent = req.getParameter("cpostContent");
		
		System.out.println("postName : " + cpostName);
		System.out.println("challengePeriod : " + challengePeriod);
		System.out.println("thumbnail : " + cthumbnail);
		System.out.println("postContent :" + cpostContent);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "INSERT INTO TB_BOARD_CHALLENGE "
				+ "(POST_NO, USER_NO, POST_NAME, POST_CONTENT, BEG_DATE, CHALLENGE_PERIOD, PARTI_NUM, HITS, COMM_NUM, REVIEW_NUM, THUBNAIL, MOD_YN, FMOD_DATE, DEL_YN) "
				+ "VALUES(SEQ_CHA_PNO.NEXTVAL,?,?,?,SYSDATE,?,DEFAULT,DEFAULT,DEFAULT,DEFAULT,?,'N',NULL,'N')";
		
		conn = JDBCTemplate.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cpostName);
			pstmt.setString(2, challengePeriod);
			pstmt.setString(3, cthumbnail);
			pstmt.setString(4, cpostContent);
			result = pstmt.executeUpdate();
			
			JDBCTemplate.commit(conn);
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			
			JDBCTemplate.rollback(conn);
			
		}finally {
			
			JDBCTemplate.close(conn);
		}
		
		if(result>0) {
			resp.sendRedirect("./challengeview");
		}else {
			resp.sendRedirect("./challengewrite");
		}
	}
	
}
