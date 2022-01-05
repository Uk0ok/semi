package com.reci.recipe.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.reci.recipe.service.registerRecipeService;
import com.reci.recipe.vo.recipeImgVo;
import com.reci.recipe.vo.registerRecipeVo;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

@WebServlet("/registerRecipe")
public class registerRecipeController extends HttpServlet {
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

		int result = new registerRecipeService().regist(rrv);

		if (result > 0) {
			// success
			req.setAttribute("msg", "글이 정상적으로 작성되었습니다.");
			req.getRequestDispatcher("WEB-INF/views/recipe/successPage.jsp").forward(req, resp);
		} else {
			// error
			req.setAttribute("msg", "글 작성에 오류가 발생하였습니다.");
			req.getRequestDispatcher("WEB-INF/views/recipe/errorPage.jsp").forward(req, resp);
		}

		// 다중 파일 업로드
		List<recipeImgVo> rImgList = new ArrayList<recipeImgVo>();

		Collection<Part> parts = req.getParts(); // 모든 part들을 가져옴
		recipeImgVo rImg = null;

		for (Part file : parts) {
			if (!file.getName().equals("file"))
				continue; // name이 file인 경우에 실행

			// 사용자가 업로드한 파일 이름 알아오기
			String originName = file.getSubmittedFileName();

			// 사용자가 업로드한 파일에 inputStream 연결
			InputStream fis = file.getInputStream();

			// 파일 이름 변경
			String changeName = "Z" + UUID.randomUUID();
			String ext = originName.substring(originName.lastIndexOf("."), originName.length());

			// 저장할 경로
			String realPath = req.getServletContext().getRealPath("/img/recipeBoard");

			// 파일 경로
			String filePath = realPath + File.separator + changeName + ext;

			// 파일 저장
			FileOutputStream fos = new FileOutputStream(filePath);

			System.out.println("origin : " + originName);
			System.out.println("change : " + changeName);

			// 파일 기록 업로드파일 read > write
			byte[] buf = new byte[1024];
			int size = 0;
			while ((size = fis.read(buf)) != -1) {
				fos.write(buf, 0, size);
			}
			fis.close();
			fos.close();

			rImg = new recipeImgVo();
			rImg.setMfileName(changeName + ext);

			rImgList.add(rImg);

		}

		int resultImg = new registerRecipeService().registerRecipeImg(rImgList);

		System.out.println("resultImg : " + resultImg);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/recipe/writingPage.jsp").forward(req, resp);
	}
}
