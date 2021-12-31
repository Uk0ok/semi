package com.reci.sup.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reci.sup.vo.NotiVo;

public class NotiDao {
	
	public List<NotiVo> selectNotiList(Connection conn) {
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
		} finally {
			close(pstmt);
			close(rs);
		}
		return notiList;
	}
	
	
	public int insertNotice(Connection conn, NotiVo n) {
		String sql = "INSERT INTO TB_NOTICE ( NOTICE_NO, ADMIN_NO, NOTICE_TITLE,"
				+ "NOTICE_CONTENT, CREATE_DATE, HITS, MOD_YN, MOD_DATE, DELETE_YN )"
				+ "VALUES ( SEQ_NOTICE.NEXTVAL, SEQ_ADMIN.NEXTVAL, ?, ?, SYSDATE, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getNoticeTitle());
			pstmt.setString(2, n.getNoticeContent());
			pstmt.setString(3, n.getHits());
			pstmt.setString(4, n.getModYn());
			pstmt.setString(5, n.getModDate());
			pstmt.setString(6, n.getDeleteYn());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}
	
	
}
