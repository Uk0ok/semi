package com.reci.sup.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.sup.vo.NotiVo;
import com.reci.sup.vo.QnaVo;

public class QnaDao {
	
	public List<QnaVo> selectQnaList(Connection conn) {
		
		String sql = "SELECT * FROM TB_QNA WHERE DELETE_YN = 'N'";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<QnaVo> qnaList = new ArrayList<QnaVo>(); 
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			QnaVo q = null;
			
			while(rs.next()) {
				int qnaNo = rs.getInt("QNA_NO");
				String qnaTitle = rs.getString("QNA_TITLE");
				String qnaContent = rs.getString("QNA_CONTENT");
				int userNo = rs.getInt("USER_NO");
				int adminNo = rs.getInt("ADMIN_NO");
				Timestamp createDate = rs.getTimestamp("CREATE_DATE");
				int hits = rs.getInt("HITS");
				String answer =rs.getString("ANSWER");
				String modYn = rs.getString("MOD_YN");
				Timestamp modDate = rs.getTimestamp("MOD_DATE");
				String statusYn = rs.getString("STATUS_YN");
				String deleteYn = rs.getString("DELETE_YN");
				
				q = new QnaVo();
				q.setQnaNo(qnaNo);
				q.setQnaTitle(qnaTitle);
				q.setQnaContent(qnaContent);
				q.setUserNo(userNo);
				q.setAdminNo(adminNo);
				q.setCreateDate(createDate);;
				q.setHits(hits);
				q.setAnswer(answer);
				q.setModYn(modYn);
				q.setModDate(modDate);
				q.setStatusYn(statusYn);
				q.setDeleteYn(deleteYn);
				
				qnaList.add(q);
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return qnaList;
	}

	public List<QnaVo> qnaListAll(Connection conn) {
		
		String sql = "SELECT * FROM TB_QNA";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<QnaVo> qnaListAll = new ArrayList<QnaVo>(); 
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			QnaVo q = null;
			
			while(rs.next()) {
				int qnaNo = rs.getInt("QNA_NO");
				String qnaTitle = rs.getString("QNA_TITLE");
				String qnaContent = rs.getString("QNA_CONTENT");
				int userNo = rs.getInt("USER_NO");
				int adminNo = rs.getInt("ADMIN_NO");
				Timestamp createDate = rs.getTimestamp("CREATE_DATE");
				int hits = rs.getInt("HITS");
				String answer =rs.getString("ANSWER");
				String modYn = rs.getString("MOD_YN");
				Timestamp modDate = rs.getTimestamp("MOD_DATE");
				String statusYn = rs.getString("STATUS_YN");
				String deleteYn = rs.getString("DELETE_YN");
				
				q = new QnaVo();
				q.setQnaNo(qnaNo);
				q.setQnaTitle(qnaTitle);
				q.setQnaContent(qnaContent);
				q.setUserNo(userNo);
				q.setAdminNo(adminNo);
				q.setCreateDate(createDate);;
				q.setHits(hits);
				q.setAnswer(answer);
				q.setModYn(modYn);
				q.setModDate(modDate);
				q.setStatusYn(statusYn);
				q.setDeleteYn(deleteYn);
				
				qnaListAll.add(q);
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return qnaListAll;
	}
}
