package com.reci.mag.dao;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reci.mag.Vo.MagVo;
import com.reci.sup.vo.NotiVo;

public class MagVDao {

	public MagVo magView(Connection conn, int postNo) {
		
		String sql = "SELECT * FROM TB_BOARD_MAGAZINE WHERE POST_NO = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MagVo magView = null;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, postNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				magView= new MagVo();
				magView.setPostNo(rs.getInt("postNo"));
				magView.setPostName(rs.getString("postName"));
				magView.setPostContent(rs.getString("postContent"));
				magView.setBegDate(rs.getTimestamp("begDate"));
				magView.setHits(rs.getInt("hits"));
				magView.setRecomNum(rs.getInt("recomNum"));
				magView.setScrapNum(rs.getInt("scrapNum"));
				magView.setCommNum(rs.getInt("commNum"));
				magView.setModYn(rs.getString("modYn"));
				magView.setFmodDate(rs.getTimestamp("fmodDate"));
				magView.setDelYn(rs.getString("delYn"));
				magView.setAdminNo(rs.getInt("adminNo"));
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return magView;
	}
}
