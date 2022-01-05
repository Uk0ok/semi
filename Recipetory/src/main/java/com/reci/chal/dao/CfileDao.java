package com.reci.chal.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reci.admin.FileVo;
import com.reci.chal.vo.CboardVo;
import com.reci.chal.vo.CfileVo;

public class CfileDao {
	
	public int insertAttachmentchallenge(Connection conn, CfileVo f, CboardVo c) {
		String sql = "INSERT INTO TB_ATTACHED_FILE_C VALUES "
				+ "(SEQ_CHA_FNO.NEXTVAL, SEQ_CHA_FNO.CURRVAL, ?, ?)";
		
		PreparedStatement pstmt = null;
		int fileResult = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getcpostNo());
			pstmt.setString(2, f.getcfileName());
			pstmt.setString(3, f.getcmfileName());
	
			fileResult = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("이미지이름 1: " + f.getcfileName());
		
		return fileResult;
	}
	
	public CfileVo cFileView(Connection conn, int CboardNo) {
		String sql ="SELECT * FROM TB_ATTACHED_FILE_C WHERE POST_NO = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CfileVo cfileView = null;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, CboardNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				cfileView = new CfileVo();
				cfileView
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close(rs);
		close(pstmt);
	}
	return cFileView;
	}


	}
}



