package com.reci.chal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.reci.common.JDBCTemplate.*;
import com.reci.chal.vo.CwriteVo;

public class CwriteDao {
	
	public int insertChallenge(Connection conn, CwriteVo cwv) throws SQLException{
		//쿼리 날리기
		String sql = "INSERT INTO TB_BOARD_CHALLENGE VALUES(SEQ_CHA_PNO.NEXTVAL,'1',?,?,SYSDATE,?,'0','0',?,'N', SYSDATE, 'N')";
		
		System.out.println("DAO 호출됨...");
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cwv.getCpostName());
			pstmt.setString(3, cwv.getChallengePeriod());
			pstmt.setString(3, cwv.getCthumbnail());
			pstmt.setString(4, cwv.getCpostContent());
			
			result = pstmt.executeUpdate();	
		}finally {
			close(pstmt);
		}
		
		System.out.println("dao end......");
		return result;
	}
}	