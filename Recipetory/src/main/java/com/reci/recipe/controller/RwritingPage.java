package com.reci.recipe.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.service.RwritingService;
import com.reci.recipe.vo.registerRecipeVo;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

@WebServlet("/registerRecipe")
public class RwritingPage extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 레시피 등록
		req.setCharacterEncoding("UTF-8");
		String postName = req.getParameter("recipeName");
		String ingredient1 = req.getParameter("ingredient1");
		String ingredient2 = req.getParameter("ingredient2");
		String ingredient3 = req.getParameter("ingredient3");
		String ingredient4 = req.getParameter("ingredient4");
		String ingredient5 = req.getParameter("ingredient5");
		String postContent1 = req.getParameter("recipeProcess1");
		String postContent2 = req.getParameter("recipeProcess2");
		String postContent3 = req.getParameter("recipeProcess3");
		String postContent4 = req.getParameter("recipeProcess4");
		String postContent5 = req.getParameter("recipeProcess5");
		String rthumbnail = req.getParameter("thumbnailName");
		
		registerRecipeVo rrv = new registerRecipeVo();
		rrv.setRpostName(postName);
		rrv.setIngredient1(ingredient1);
		rrv.setIngredient2(ingredient2);
		rrv.setIngredient3(ingredient3);
		rrv.setIngredient4(ingredient4);
		rrv.setIngredient5(ingredient5);
		rrv.setRpostContent1(postContent1);
		rrv.setRpostContent2(postContent2);
		rrv.setRpostContent3(postContent3);
		rrv.setRpostContent4(postContent4);
		rrv.setRpostContent5(postContent5);
		rrv.setRthumbnail(rthumbnail);
		
		int result = new RwritingService().regist(rrv);
		
		if (result > 0) {
			//success
			req.setAttribute("msg", "글이 정상적으로 작성되었습니다.");
			req.getRequestDispatcher("WEB-INF/views/recipe/successPage.jsp").forward(req, resp);
		} else {
			//error
			req.setAttribute("msg", "글 작성에 오류가 발생하였습니다.");
			req.getRequestDispatcher("WEB-INF/views/recipe/errorPage.jsp").forward(req, resp);
		}
			
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/recipe/writingPage.jsp").forward(req, resp);
	}
}
