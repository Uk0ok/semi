package com.reci.recipe.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.service.RBoardService;
import com.reci.recipe.vo.RBoardVo;

@WebServlet("/recipe")
public class RecipeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<RBoardVo> RboardList = new RBoardService().selectRBoardList();
		
		req.setAttribute("data", RboardList);
		System.out.println( "컨트롤러 ~~~ ::: " + ((RBoardVo)RboardList.get(0)).getRbegDate());
		req.getRequestDispatcher("/WEB-INF/views/recipe/recipeBoard.jsp").forward(req, resp);
	}
	
	
}
