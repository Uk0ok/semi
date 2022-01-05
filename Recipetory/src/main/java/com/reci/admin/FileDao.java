package com.reci.admin;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reci.sup.vo.NotiVo;

public class FileDao {
	
	public int insertAttachmentNoti(Connection conn, FileVo f, NotiVo n) {
		String sql = "INSERT INTO TB_ATTACHED_FILE_N VALUES "
				+ "(SEQ_NOTICE_ATTACHMENT.NEXTVAL, SEQ_NOTICE.CURRVAL, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		int fileResult = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, n.getAdminNo());
			pstmt.setString(2, f.getFileName());
			pstmt.setString(3, f.getmFileName());
	
			fileResult = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("이미지이름 1: " + f.getFileName());
		
		return fileResult;
	}

	public FileVo nFileView(Connection conn, int noticeNo) {

		String sql = "SELECT * FROM TB_NOTICE_ATTACHMENT WHERE NOTICE_NO = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileVo nfileView = null;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, noticeNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				nfileView = new FileVo();
				nfileView.
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return nFileView;
		
	}
}

	