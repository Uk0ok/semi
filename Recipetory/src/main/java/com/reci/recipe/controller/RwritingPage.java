package com.reci.recipe.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

@WebServlet("/registerRecipe")
public class RwritingPage extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 레시피 등록
		String rpostNo = req.getParameter("recipeName");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection conn = JDBCTemplate.getConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO TABLE TB_BOARD_RECIPE VALUES(SEQ_REC_RNO.NEXTVAL, ?, ?, ?, SYSDATE, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, ?, )";
		
		
		req.getRequestDispatcher("/WEB-INF/views/recipe/writingPage.jsp").forward(req, resp);
	}
}
