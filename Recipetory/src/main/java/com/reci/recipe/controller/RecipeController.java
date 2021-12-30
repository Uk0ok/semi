package com.reci.recipe.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;

@WebServlet("/recipe")
public class RecipeController extends HttpServlet{
	// 쿼리 날릴 준비
	Connection conn = JDBCTemplate.getConnection();
	
	
	
	// 쿼리 날리기
	
	//
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/recipe/recipeBoard.jsp").forward(req, resp);
	}
}
