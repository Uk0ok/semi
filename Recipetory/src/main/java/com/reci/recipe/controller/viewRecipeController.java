package com.reci.recipe.controller;

import java.io.IOException;
//import java.util.List;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.recipe.dao.RBoardDao;
import com.reci.recipe.service.RBoardService;
import com.reci.recipe.vo.recipeImgVo;
import com.reci.recipe.vo.registerRecipeVo;
import com.reci.sup.service.NotiService;
import com.reci.sup.vo.NotiVo;

@WebServlet("/recipe/viewRecipe")
public class viewRecipeController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no = req.getParameter("no");
		int postNo = Integer.parseInt(no);
		System.out.println("postNo : " + postNo);
		req.setAttribute("no", no);
		
		String pageNo = req.getParameter("pageNo");
		req.setAttribute("pageNo", pageNo);
		
		registerRecipeVo viewRecipe = RBoardService.viewRecipe(postNo);
		System.out.println("viewRecipe : " + viewRecipe);
		req.setAttribute("viewRecipe", viewRecipe);
		
		List<recipeImgVo> fnList = RBoardService.viewImg(postNo);
		
		req.setAttribute("imgdata", fnList);
		for(recipeImgVo x : fnList) {
			System.out.println("==================");
			System.out.println("test ::: " + x);
		}
		
		req.getRequestDispatcher("/WEB-INF/views/recipe/viewRecipe.jsp").forward(req, resp);
	}
}
