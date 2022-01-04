package com.reci.mag.dao;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.reci.mag.Vo.MagVo;

public class MagSDao {

	public static MagVo selectById(Connection conn, MagVo vm) throws SQLException {
		MagVo magVo = new MagVo();
		conn = getConnection();
		String sql = "SELECT * FROM TB_BOARD_MAGAZINE WHERE POST_NO = ?";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			int postNo;
			pstmt.setInt(1, postNo);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				magVo.setPostNo(rs.getInt("postNo"));
				magVo.setPostName(rs.getString("postName"));
				magVo.setPostContent(rs.getString("postContent"));
				magVo.setBegDate(rs.getTimestamp("begDate"));
				magVo.setHits(rs.getInt("hits"));
				magVo.setRecomNum(rs.getInt("recomNum"));
				magVo.setScrapNum(rs.getInt("scrapNum"));
				magVo.setCommNum(rs.getInt("commNum"));
				magVo.setModYn(rs.getString("modYn"));
				magVo.setFmodDate(rs.getTimestamp("fmodDate"));
				magVo.setDelYn(rs.getString("delYn"));
				magVo.setAdminNo(rs.getInt("adminNo"));
			
			}
			System.out.println("select");
			} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return magVo;
	}
	
}
