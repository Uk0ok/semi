package com.reci.chal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;

import com.reci.chal.vo.CboardVo;
import com.reci.chal.vo.CwriteVo;

public class CwriteDao {
	
	public int insertChallenge(Connection conn, CboardVo c) throws SQLException{
		//쿼리 날리기
		String sql = "INSERT INTO TB_POST_C VALUES(SEQ_CHA_PTO.NEXTVAL,'1',?,?,SYSDATE,?,'0','0',?,'N','N',SYSDATE)";		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getCpostName());
			pstmt.setDate(2, c.getChallengePeriod());
			pstmt.setString(3, c.getCthumbnail());
			pstmt.setString(4, c.getCpostContent());
			
			result = pstmt.executeUpdate();	
		}finally {
			close(pstmt);
		}

		return result;
	}

}	