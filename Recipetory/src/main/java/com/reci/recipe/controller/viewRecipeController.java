package com.reci.recipe.controller;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.recipe.dao.recipeBoradDao;
import com.reci.recipe.service.recipeBoardService;
import com.reci.recipe.vo.recipeImgVo;
import com.reci.recipe.vo.registerRecipeVo;

@WebServlet("/recipe/viewRecipe")
public class viewRecipeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String no = req.getParameter("no");
		int postNo = Integer.parseInt(no);
		System.out.println("postNo : " + postNo);
		req.setAttribute("no", no);

		String pageNo = req.getParameter("pageNo");
		req.setAttribute("pageNo", pageNo);

		registerRecipeVo viewRecipe = recipeBoardService.viewRecipe(postNo);
		System.out.println("viewRecipe : " + viewRecipe);
		req.setAttribute("viewRecipe", viewRecipe);

		// rpostContent들을 담는 List작성하여 setAttribute로 보낸다
		List<String> rpostContentlist = new ArrayList<String>();
		String temp;
		temp = viewRecipe.getRpostContent1();
		rpostContentlist.add(temp);
		temp = viewRecipe.getRpostContent2();
		rpostContentlist.add(temp);
		temp = viewRecipe.getRpostContent3();
		rpostContentlist.add(temp);
		temp = viewRecipe.getRpostContent4();
		rpostContentlist.add(temp);
		temp = viewRecipe.getRpostContent5();
		rpostContentlist.add(temp);
		req.setAttribute("rpostContentlist", rpostContentlist);

		List<recipeImgVo> fnList = recipeBoardService.viewImg(postNo);
		req.setAttribute("imgdata", fnList);
		for (recipeImgVo x : fnList) {
			System.out.println("==================");
			System.out.println("test2 ::: " + x);
		}

		req.getRequestDispatcher("/WEB-INF/views/recipe/viewRecipe.jsp").forward(req, resp);
	}
}
