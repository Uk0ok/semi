package com.reci.recipe.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.recipe.service.RBoardService;
import com.reci.recipe.vo.registerRecipeVo;

@WebServlet("/recipe")
public class RecipeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<registerRecipeVo> RboardList = new RBoardService().selectRBoardList();
		
		req.setAttribute("data", RboardList);
		req.getRequestDispatcher("/WEB-INF/views/recipe/recipeBoard.jsp").forward(req, resp);
	}
	
	
}
