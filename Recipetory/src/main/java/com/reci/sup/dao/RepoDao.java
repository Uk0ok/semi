package com.reci.sup.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.sup.vo.QnaVo;
import com.reci.sup.vo.RepoVo;

public class RepoDao {

	public List<RepoVo> selectRepoList(Connection conn) {
		String sql = "SELECT * FROM TB_REPORT WHERE DELETE_YN = 'N'";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<RepoVo> repoList = new ArrayList<RepoVo>(); 
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			RepoVo r = null;
			
			while(rs.next()) {
				int reportNo = rs.getInt("REPORT_NO");
				String reportTitle = rs.getString("REPORT_TITLE");
				String reportContent = rs.getString("REPORT_CONTENT");
				Timestamp createDate = rs.getTimestamp("CREATE_DATE");
				int hits = rs.getInt("HITS");
				String answer = rs.getString("ANSWER");
				String modYn = rs.getString("MOD_YN");
				String modDate = rs.getString("MOD_DATE");
				String statusYn = rs.getString("STATUS_YN");
				String deleteYn = rs.getString("DELETE_YN");
				int adminNo = rs.getInt("ADMIN_NO");
	
				
				r = new RepoVo();
				r.setReportNo(reportNo);
				r.setReportTitle(reportTitle);
				r.setReportContent(reportContent);
				r.setCreateDate(createDate);
				r.setHits(hits);
				r.setAnswer(answer);
				r.setModYn(modYn);
				r.setModDate(modDate);
				r.setStatusYn(statusYn);
				r.setDeleteYn(deleteYn);
				r.setAdminNo(adminNo);
				
				
				repoList.add(r);
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return repoList;
	}

	public List<RepoVo> repoListAll(Connection conn) {
String sql = "SELECT * FROM TB_REPORT";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<RepoVo> repoListAll = new ArrayList<RepoVo>(); 
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			RepoVo r = null;
			
			while(rs.next()) {
				int reportNo = rs.getInt("REPORT_NO");
				String reportTitle = rs.getString("REPORT_TITLE");
				String reportContent = rs.getString("REPORT_CONTENT");
				Timestamp createDate = rs.getTimestamp("CREATE_DATE");
				int hits = rs.getInt("HITS");
				String answer = rs.getString("ANSWER");
				String modYn = rs.getString("MOD_YN");
				String modDate = rs.getString("MOD_DATE");
				String statusYn = rs.getString("STATUS_YN");
				String deleteYn = rs.getString("DELETE_YN");
				int adminNo = rs.getInt("ADMIN_NO");
	
				
				r = new RepoVo();
				r.setReportNo(reportNo);
				r.setReportTitle(reportTitle);
				r.setReportContent(reportContent);
				r.setCreateDate(createDate);
				r.setHits(hits);
				r.setAnswer(answer);
				r.setModYn(modYn);
				r.setModDate(modDate);
				r.setStatusYn(statusYn);
				r.setDeleteYn(deleteYn);
				r.setAdminNo(adminNo);
				
				
				repoListAll.add(r);
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return repoListAll;
	}
}
