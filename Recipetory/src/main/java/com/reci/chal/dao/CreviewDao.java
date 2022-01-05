package com.reci.chal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.reci.common.JDBCTemplate.*;

import com.reci.chal.vo.CreviewVo;
import com.reci.chal.vo.CwriteVo;

public class CreviewDao {

		
		//글쓰기 메소드
		public int reviewwrite(Connection conn, CreviewVo crv) throws SQLException{
			String sql = "insert into tb_review_c values(SEQ_CHA_RVO.NEXTVAL, '1', ?, ?, ?, SYSDATE, ?, 'N', SYSDATE, 'N')";		
			PreparedStatement pstmt = null;
			int result = 0;
			
			try {
				pstmt = conn.prepareStatement(sql);			
				pstmt.setString(1, crv.getreviewStar());
				pstmt.setString(2, crv.getreviewName());
				pstmt.setString(3, crv.getCthumbnail());
				pstmt.setString(4, crv.getreviewContent());
				
				result = pstmt.executeUpdate();	
						
			}finally {
				close(pstmt);
			}
			return result;
}
}
