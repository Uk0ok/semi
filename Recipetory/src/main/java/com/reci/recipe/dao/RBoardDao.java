package com.reci.recipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.vo.RBoardVo;

public class RBoardDao {

	public List<RBoardVo> selectRBoardList(Connection conn) {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		RBoardVo rb = null;
		List<RBoardVo> RboardList = new ArrayList<RBoardVo>();
		String sql = "SELECT * FROM TB_BOARD_RECIPE";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int rpostNo = rs.getInt("POST_NO");
				int userNo = rs.getInt("USER_NO");
				String rpostName = rs.getString("POST_NAME");
				String rpostContent = rs.getString("POST_CONTENT");
				Timestamp rbegDate = rs.getTimestamp("BEG_DATE");
				System.out.println("test :::" + rbegDate);//swy
				int rhits = rs.getInt("HITS");
				int rrcomNum = rs.getInt("RECOM_NUM");
				int rscrapNum = rs.getInt("SCRAP_NUM");
				int rcommNum = rs.getInt("COMM_NUM");
				int rreviewNum = rs.getInt("REVIEW_NUM");
				String difficulty = rs.getString("DIFFICULTY");
				String reqTime = rs.getString("REQ_TIME");
				String category = rs.getString("CATEGORY");
				String tag = rs.getString("TAG");
				String rthumbnail = rs.getString("THUMBNAIL");
				String rmodYn = rs.getString("MOD_YN");
				String rdelYn = rs.getString("DEL_YN");
				Timestamp rmodDate = rs.getTimestamp("FMOD_DATE");

				RBoardVo rb = new RBoardVo();
				rb = new RBoardVo();
				rb.setRpostNo(rpostNo);
				rb.setUserNo(userNo);
				rb.setRpostName(rpostName);
				rb.setRpostContent(rpostContent);
				rb.setRbegDate(rbegDate);
				rb.setRhits(rhits);
				rb.setRrcomNum(rrcomNum);
				rb.setRscrapNum(rscrapNum);
				rb.setRcommNum(rcommNum);
				rb.setRreviewNum(rreviewNum);
				rb.setDifficulty(difficulty);
				rb.setReqTime(reqTime);
				rb.setCategory(category);
				rb.setTag(tag);
				rb.setRthumbnail(rthumbnail);
				rb.setRmodYn(rmodYn);
				rb.setRdelYn(rdelYn);
				rb.setRmodDate(rmodDate);

				RboardList.add(rb);
				System.out.println( "add 한 객체 ~~~ ::: " + (rb.getRbegDate()));//swy

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs);	
		}
		
		return RboardList;
	}
}
