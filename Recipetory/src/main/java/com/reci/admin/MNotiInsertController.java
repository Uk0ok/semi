package com.reci.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.reci.sup.service.NotiService;
import com.reci.sup.vo.NotiVo;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 5,
		maxRequestSize = 1024 * 1024 * 5 *5
)
@WebServlet("/mNotiInsert")
public class MNotiInsertController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("insert called..");
		
		req.setCharacterEncoding("UTF-8");
		
		String noticeTitle = req.getParameter("noticeTitle");
		int adminNo = Integer.parseInt(req.getParameter("adminNo"));
		String noticeContent = req.getParameter("noticeContent");
		
		NotiVo n = new NotiVo();
		n.setNoticeTitle(noticeTitle);
		n.setAdminNo(adminNo);
		n.setNoticeContent(noticeContent);
		
		//파일 읽을 준비
		Part part = req.getPart("file");
		String mfileName = null;
		String fileName = null;
		String filePath = null;
		
		if(part != null) {
			fileName = part.getSubmittedFileName();
			InputStream fis = part.getInputStream();
			
			//파일 저장 준비
			mfileName = "" + UUID.randomUUID();
			String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			String realPath = req.getServletContext().getRealPath("/img/supBoard");
			filePath = realPath + File.separator + mfileName + ext;
			FileOutputStream fos = new FileOutputStream(filePath); 
			
			//파일기록(업로드파일 read -> write)
			byte[] buf = new byte[1024]	;
			int size = 0;
			while((size = fis.read(buf)) != -1) {
				fos.write(buf, 0, size);
			}
			fis.close();
			fos.close();
		}
		req.setAttribute("f", filePath);
		System.out.println(filePath);
		
		FileVo f = new FileVo();
		f.setFileName(fileName);
		f.setmFileName(mfileName);
		
		System.out.println(fileName);
		System.out.println(mfileName);
		
		int uploadData = new NotiService().uploadNoti(n, f);
		System.out.println(uploadData);
		
		if(uploadData > 0){
			//success
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('공지사항이 정상적으로 등록되었습니다.');"
					+ "location.href='./mNoti';</script>"
					); 
			writer.close();
		}else {
			//error
			resp.setContentType("text/html; charset=UTF-8"); 
			PrintWriter writer = resp.getWriter();
			writer.println
					(
					"<script>alert('공지사항 등록에 실패하였습니다.');"
					+ "location.href='./mNoti';</script>"
					); 
			writer.close();
			
		}
	}
}
