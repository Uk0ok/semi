package com.reci.chal.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;
import com.reci.chal.service.CboardwService;
import com.reci.chal.vo.CboardwVo;

@MultipartConfig(maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)

@WebServlet("/challengewrite")
public class ChalWriteController extends HttpServlet{
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // 레시피 등록
      req.setCharacterEncoding("UTF-8");
      String postName = req.getParameter("challengeName");
      String ingredient1 = req.getParameter("ingredient1");
      String ingredient2 = req.getParameter("ingredient2");
      String ingredient3 = req.getParameter("ingredient3");
      String ingredient4 = req.getParameter("ingredient4");
      String ingredient5 = req.getParameter("ingredient5");
      String postContent1 = req.getParameter("rpostContent1");
      String postContent2 = req.getParameter("rpostContent2");
      String postContent3 = req.getParameter("rpostContent3");
      String postContent4 = req.getParameter("rpostContent4");
      String postContent5 = req.getParameter("rpostContent5");
      
      CboardwVo cwv = new CboardwVo();
      cwv.setRpostName(postName);
      cwv.setIngredient1(ingredient1);
      cwv.setIngredient2(ingredient2);
      cwv.setIngredient3(ingredient3);
      cwv.setIngredient4(ingredient4);
      cwv.setIngredient5(ingredient5);
      cwv.setRpostContent1(postContent1);
      cwv.setRpostContent2(postContent2);
      cwv.setRpostContent3(postContent3);
      cwv.setRpostContent4(postContent4);
      cwv.setRpostContent5(postContent5);
      
      int result = new CboardwService().write(cwv);
      
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
      req.getRequestDispatcher("/WEB-INF/views/challenge/challenge_write.jsp").forward(req, resp);
   }
}