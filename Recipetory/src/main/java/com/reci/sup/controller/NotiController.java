package com.reci.sup.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;
import com.reci.sup.vo.NotiVo;

@WebServlet("/support")
public class NotiController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//디비에서 데이터조회
		
		//커넥션 가져옴
		Connection conn = JDBCTemplate.getConnection();
		
		//쿼리 날릴 준비
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM TB_NOTICE";
		List<NotiVo> notiList = new ArrayList<NotiVo>(); //리스트안에 제네릭이용해서 notivo만 들어오게
		
		//쿼리 날리기
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //실행결과가 resultset에 나오기 때문에
			
			//모든게시글 가져오기위해, 다음줄마다 모두 실행되려면 while
			while(rs.next()) {
				//rs에서 현재 커서가 가리키는 행의 데이터를 가져오기
				String noticeNo = rs.getString("NOTICE_NO");
				String adminNo = rs.getString("ADMIN_NO");
				String noticeTitle = rs.getString("NOTICE_TITLE");
				String noticeContent = rs.getString("NOTICE_CONTENT");
				String createDate = rs.getString("CREATE_DATE");
				String hits = rs.getString("HITS");
				String modYn = rs.getString("MOD_YN");
				String modDate = rs.getString("MOD_DATE");
				String deleteYn = rs.getString("DELETE_YN");
				
				//여러 변수에 흩어져있는 데이터를 하나로 뭉침
				NotiVo n = new NotiVo(noticeNo, adminNo, noticeContent, noticeTitle, createDate, hits, modYn, modDate, deleteYn);
				n.setNoticeNo(noticeNo);
				n.setAdminNo(adminNo);
				n.setNoticeTitle(noticeTitle);
				n.setNoticeContent(noticeContent);
				n.setCreateDate(createDate);;
				n.setHits(hits);
				n.setModYn(modYn);
				n.setModDate(modDate);
				n.setDeleteYn(deleteYn);
				
				notiList.add(n);
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			
		//조회한 데이터를 jsp에 넘겨줌
			
		req.setAttribute("data", notiList);
		req.getRequestDispatcher("/WEB-INF/views/support/notice.jsp").forward(req, resp);

	}
}

