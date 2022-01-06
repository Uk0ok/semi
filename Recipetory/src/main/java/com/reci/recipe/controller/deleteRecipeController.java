package com.reci.recipe.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.recipe.service.deleteRecipeService;
import com.reci.recipe.vo.recipeVo;

@WebServlet("/deleteRecipe")
public class deleteRecipeController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int postNo = Integer.parseInt(req.getParameter("rpostNo")) ;
		
		recipeVo rv = new recipeVo();
		rv.setRpostNo(postNo);
	
		int result = new deleteRecipeService().delete(rv);
		
		System.out.println(postNo);
		System.out.println(result);
		
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('선택한 게시글이 삭제되었습니다.');"
					+ "location.href='./recipe';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('선택한 게시글 삭제를 실패하였습니다. 다시 시도해주세요.');"
					+ "location.href='./recipe';</script>"
					); 
			writer.close();
			
		}
	}
	
	
}
