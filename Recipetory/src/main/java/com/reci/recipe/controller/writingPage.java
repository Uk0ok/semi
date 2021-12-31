package com.reci.recipe.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;

@WebServlet("/writing")
public class writingPage extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection conn = JDBCTemplate.getConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO TABLE TB_BOARD_RECIPE VALUES(SEQ_REC_RNO.NEXTVAL, ?, ?, ?, SYSDATE, )";
		
		
		req.getRequestDispatcher("/WEB-INF/views/recipe/writingPage.jsp").forward(req, resp);
	}
}
