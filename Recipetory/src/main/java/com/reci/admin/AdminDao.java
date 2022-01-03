package com.reci.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;

public class AdminDao {

	
	public int insertAdmin(Connection conn, AdminVo ad) throws SQLException {
		//쿼리 날리기
		
		String sql="INSERT INTO TB_ADMIN ( ADMIN_NO, ADMIN_ID,  ADMIN_PWD, ADMIN_NAME, ADMIN_LV, JOIN_DATE) "
				+ "VALUES ( SEQ_ADMIN.NEXTVAL, ?, ?, ?, ?, SYSDATE)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ad.getAdminId());
			pstmt.setString(2, ad.getAdminPwd());
			pstmt.setString(3, ad.getAdminName());
			pstmt.setString(4, ad.getAdminLv());
			
			result = pstmt.executeUpdate();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public AdminVo selectAdmin(Connection conn, AdminVo ad) {
		
		String query = "SELECT * FROM TB_ADMIN WHERE ADMIN_ID = ? AND DELETE_DATE IS NULL";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AdminVo selectedAdmin = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ad.getAdminId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int adminNo = rs.getInt("ADMIN_NO");
				String adminId = rs.getString("ADMIN_ID");
				String adminPwd = rs.getString("ADMIN_PWD");
				String adminName = rs.getString("ADMIN_NAME");
				String adminLv = rs.getString("ADMIN_LV");
				Timestamp joinDate = rs.getTimestamp("JOIN_DATE");
			//	Timestamp deleteDate = rs.getTimestamp("DELETE_DATE");
				
				selectedAdmin = new AdminVo();
				selectedAdmin.setAdminNo(adminNo);
				selectedAdmin.setAdminId(adminId);
				selectedAdmin.setAdminPwd(adminPwd);
				selectedAdmin.setAdminName(adminName);
				selectedAdmin.setAdminLv(adminLv);
				selectedAdmin.setJoinDate(joinDate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return selectedAdmin;
	}

	public List<AdminVo> selectAdminAll(Connection conn) {
		
		String sql = "SELECT * FROM TB_ADMIN";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<AdminVo> list = new ArrayList<AdminVo>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			AdminVo selectedAdmin = null;
			
			while(rs.next()) {
				int adminNo = rs.getInt("ADMIN_NO");
				String adminId = rs.getString("ADMIN_ID");
				String adminPwd = rs.getString("ADMIN_PWD");
				String adminName = rs.getString("ADMIN_NAME");
				String adminLv = rs.getString("ADMIN_LV");
				Timestamp joinDate = rs.getTimestamp("JOIN_DATE");
				Timestamp deleteDate = rs.getTimestamp("DELETE_DATE");
				
				selectedAdmin = new AdminVo();
				selectedAdmin.setAdminNo(adminNo);
				selectedAdmin.setAdminId(adminId);
				selectedAdmin.setAdminPwd(adminPwd);
				selectedAdmin.setAdminName(adminName);
				selectedAdmin.setAdminLv(adminLv);
				selectedAdmin.setJoinDate(joinDate);
				selectedAdmin.setDeleteDate(deleteDate);
				
				list.add(selectedAdmin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
	public int delete(Connection conn, AdminVo ad) {
		String sql = "UPDATE TB_ADMIN SET DELETE_DATE = SYSDATE WHERE ADMIN_NO = ?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ad.getAdminNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return -1;
	}
	
}
