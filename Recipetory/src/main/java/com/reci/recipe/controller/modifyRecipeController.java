package com.reci.recipe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.recipe.service.modifyRecipeService;
import com.reci.recipe.vo.recipeVo;

@WebServlet("/recipe/modifyRecipe")
public class modifyRecipeController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.setCharacterEncoding("UTF-8");
		String no = req.getParameter("no");
		int postNo = Integer.parseInt(no);
		System.out.println("postNo : " + postNo);
//		int postNo = Integer.parseInt(req.getParameter("rpostNo")); 
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
		
		recipeVo mrv = new recipeVo();
		mrv.setRpostNo(postNo);
		mrv.setRpostName(postName);
		mrv.setIngredient1(ingredient1);
		mrv.setIngredient2(ingredient2);
		mrv.setIngredient3(ingredient3);
		mrv.setIngredient4(ingredient4);
		mrv.setIngredient5(ingredient5);
		mrv.setRpostContent1(postContent1);
		mrv.setRpostContent2(postContent2);
		mrv.setRpostContent3(postContent3);
		mrv.setRpostContent4(postContent4);
		mrv.setRpostContent5(postContent5);
		mrv.setRthumbnail(rthumbnail);
		
		int result = new modifyRecipeService().modify(mrv);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('글이 수정되었습니다..');"
					+ "location.href='./viewRecipe';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('글 수정을 실패하였습니다.');"
					+ "location.href='./viewRecipe';</script>"
					); 
			writer.close();
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("test");
		req.getRequestDispatcher("/WEB-INF/views/recipe/modifyPage.jsp").forward(req, resp);
	}
}
