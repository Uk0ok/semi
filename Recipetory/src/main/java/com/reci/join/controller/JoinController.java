package com.reci.join.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.reci.join.controller.MemberService;
import com.reci.join.controller.Member;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 5, 
		maxRequestSize = 1024 * 1024 * 5 * 5
)
@WebServlet("/join")
public class JoinController extends HttpServlet {

	//회원가입 화면 보여줌
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/join/join.jsp").forward(req, resp);
	}
	
	//회원가입 진행
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String userId = req.getParameter("userId");
		String userPwd1 = req.getParameter("userPwd1");
		String userNickname = req.getParameter("userNickname");
		String userEmail = req.getParameter("userEmail");
		String userPhone = req.getParameter("userPhone");

		System.out.println("ID : " + userId);
		System.out.println("PASSWORD : " + userPwd1);
		System.out.println("NICKNAME : " + userNickname);
		System.out.println("EMAIL : " + userEmail);
		System.out.println("PHONE : " + userPhone);
//		//파일 읽을 준비
//		Part part = req.getPart("profile");
//		if(part != null) {
//			String originName = part.getSubmittedFileName();
//			InputStream fis = part.getInputStream();
//			
//			//파일 저장 준비
//			String changeName = "" + UUID.randomUUID();
//			String ext = originName.substring(originName.lastIndexOf("."), originName.length());
//			String realPath = req.getServletContext().getRealPath("/upload");
//			String filePath = realPath + File.separator + changeName + ext;
//			FileOutputStream fos = new FileOutputStream(filePath);
//	
//			//파일 기록 (업로드파일 read -> write)
//			byte[] buf = new byte[1024];
//			int size = 0;
//			while((size = fis.read(buf)) != -1) {
//				fos.write(buf, 0, size);
//			}
//			
//			fis.close();
//			fos.close();
//		}
//
//		Member m = new Member();
//		m.setId(userId);
//		m.setPassword(userPwd1);
//		m.setNickname(userNickname);
//		
//		int result = new MemberService().join(m);

	}
	
}
