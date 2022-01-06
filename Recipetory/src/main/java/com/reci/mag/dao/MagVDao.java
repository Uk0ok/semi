package com.reci.mag.dao;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

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
				magView.setPostNo(postNo);
				magView.setPostName(rs.getString("POST_NAME"));
				magView.setPostContent(rs.getString("POST_CONTENT"));
				magView.setBegDate(rs.getTimestamp("BEG_DATE"));
				magView.setHits(rs.getInt("HITS"));
				magView.setRecomNum(rs.getInt("RECOM_NUM"));
				magView.setScrapNum(rs.getInt("SCRAP_NUM"));
				magView.setCommNum(rs.getInt("COMM_NUM"));
				magView.setModYn(rs.getString("MOD_YN"));
				magView.setFmodDate(rs.getTimestamp("FMOD_DATE"));
				magView.setDelYn(rs.getString("DEL_YN"));
				magView.setAdminNo(rs.getInt("ADMIN_NO"));
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
