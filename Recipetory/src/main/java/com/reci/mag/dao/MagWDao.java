package com.reci.mag.dao;

import java.sql.*;

import com.reci.mag.Vo.MagVo;

import static com.reci.common.JDBCTemplate.*;

public class MagWDao {

	public int insertMag(Connection conn, MagVo mw) throws SQLException {
		
		//쿼리 날리기
		
		String sql= "INSERT INTO TB_BOARD_MAGAZINE( POST_NO,POST_NAME,POST_CONTENT,BEG_DATE, "
				+ "HITS,RECOM_NUM,SCRAP_NUM,COMM_NUM,MOD_YN,FMOD_DATE,DEL_YN,ADMIN_NO )"
				+ "VALUES( SEQ_MAG_PNO.NEXTVAL,?,?,default,default,default,default, default,default"
				+ ",default,DEFAULT,? )";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, mw.getPostName());
			pstmt.setString(2, mw.getPostContent());
			pstmt.setInt(3, mw.getAdminNo());
			
			result = pstmt.executeUpdate();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
}