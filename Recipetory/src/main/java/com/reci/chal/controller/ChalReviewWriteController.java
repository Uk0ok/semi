package com.reci.chal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.reci.common.JDBCTemplate;
import com.reci.chal.service.CreviewService;
import com.reci.chal.vo.CreviewVo;

@WebServlet("/reviewwrite")
public class ChalReviewWriteController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reviewStar = req.getParameter("reviewStar");
		String reviewName = req.getParameter("reviewName");
		String cthumbnail = req.getParameter("thumbnail");
		String reviewContent = req.getParameter("reviewContent");
		
		CreviewVo crv = new CreviewVo();
		crv.setReviewStar(reviewStar);
		crv.setReviewName(reviewName);
		crv.setCthumbnail(cthumbnail);
		crv.setReviewContent(reviewContent);
		
		int result = new CreviewService().review(crv);
		if(result > 0) {
			//success
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = resp.getWriter();
			writer.println("<script>alert('글이 정상적으로 작성되었습니다.');"
			+ "location.href='./challengeview';</script>"); 
			writer.close();
			}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println ("<script>alert('글 등록에 실패하였습니다. 다시 시도해주십시오.');"
			+ "location.href='./challengewrite';</script>"); 
			writer.close();
	}
}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.getRequestDispatcher("/WEB-INF/views/challenge/challenge_review_write.jsp").forward(req, resp);
}
}