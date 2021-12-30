package com.reci.mag.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.mag.Vo.MagC_Vo;

public class MagC_Dao {

	public List<MagC_Vo> selectMagCList(Connection conn){
		
		//쿼리 날릴 준비
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT COMM_CONTENT FROM TB_COMMENT_M";
		List<MagC_Vo> magCList = new ArrayList<MagC_Vo>();
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			int COMM_NO= rs.getInt("COMM_NO");
			int POST_NO= rs.getInt("POST_NO");
			int USER_NO= rs.getInt("USER_NO");
			String COMM_CONTENT= rs.getString("COMM_CONTENT");
			int COMM_ORDER= rs.getInt("COMM_ORDER");
			String RECOM_NUM= rs.getString("RECOM_NUM");
			String BEG_DATE= rs.getString("BEG_DATE");
			String MOD_DATE= rs.getString("MOD_DATE");
			String MOD_YN= rs.getString("MOD_YN");
			String DEL_YN= rs.getString("DEL_YN");
			
			MagC_Vo MagC = new MagC_Vo(); 
			MagC.setCOMM_NO(COMM_NO);
			MagC.setPOST_NO(POST_NO);
			MagC.setUSER_NO(USER_NO);
			MagC.setCOMM_CONTENT(COMM_CONTENT);
			MagC.setCOMM_ORDER(COMM_ORDER);
			MagC.setRECOM_NUM(RECOM_NUM);
			MagC.setBEG_DATE(BEG_DATE);
			MagC.setMOD_DATE(MOD_DATE);
			MagC.setMOD_YN(MOD_YN);
			MagC.setDEL_YN(DEL_YN);
			
			magCList.add(MagC);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs);
		}
		
		return magCList;
	}
	
}
