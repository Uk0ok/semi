package com.reci.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.sup.service.NotiService;
import com.reci.sup.vo.NotiVo;

@WebServlet("/mNoti")
public class MNotiController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<NotiVo> notiListAll = new NotiService().notiListAll();
	
		req.setAttribute("notiListAll", notiListAll);
		req.getRequestDispatcher("/WEB-INF/views/admin/mNoti.jsp").forward(req, resp);
		
	}
}
