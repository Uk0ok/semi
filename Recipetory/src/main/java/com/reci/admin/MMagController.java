package com.reci.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.reci.mag.Vo.MagVo;
import com.reci.mag.service.MagService;

@WebServlet("/mMag")
public class MMagController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<MagVo> magListAll = new MagService().magListAll();
		
		req.setAttribute("magListAll", magListAll);
		req.getRequestDispatcher("/WEB-INF/views/admin/mMag.jsp").forward(req, resp);
	}
	
}
