package com.reci.chal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.chal.vo.CwriteVo;
import com.reci.common.JDBCTemplate;

public class CboardDao {

	public List<CwriteVo> selectCboardList(Connection conn){

//			System.out.println("DAO 호출됨...");//swy
		
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				List<CwriteVo> CboardList = new ArrayList<CwriteVo>(); 
				String sql = "SELECT * FROM TB_BOARD_CHALLENGE ";
				
				try {
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					
					while(rs.next()) { 
						int cpostNo = rs.getInt("POST_NO");
						int userNo = rs.getInt("USER_NO");
						String cpostName = rs.getString("POST_NAME");
						String cpostContent = rs.getString("POST_CONTENT");
						Timestamp cbegDate = rs.getTimestamp("BEG_DATE");
						String challengePeriod = rs.getString("CHALLENGE_PERIOD");
						int partiNum =rs.getInt("PARTI_NUM");
						int reviewNum =rs.getInt("REVIEW_NUM");
						String cthumbnail = rs.getString("THUMBNAIL");
						String cmodYn = rs.getString("MOD_YN");
						String cdelYn = rs.getString("DEL_YN");
						Timestamp cfmodDate = rs.getTimestamp("FMOD_DATE"); 
						
						
						//관리하기 힘드니 하나로 뭉친다.
						CwriteVo cwv = new CwriteVo();
						cwv.setCpostNo(cpostNo);
						cwv.setUserNo(userNo);
						cwv.setCpostName(cpostName);
						cwv.setCpostContent(cpostContent);
						cwv.setCbegDate(cbegDate);
						cwv.setChallengePeriod(challengePeriod);
						cwv.setCreviewNum(reviewNum);
						cwv.setPartiNum(partiNum);
						cwv.setCthumbnail(cthumbnail);
						cwv.setCmodYn(cmodYn);
						cwv.setCdelYn(cdelYn);
						cwv.setCfmodDate(cfmodDate);
						
						CboardList.add(cwv);
						
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCTemplate.close(pstmt);
					JDBCTemplate.close(rs); 
				}
				
//				System.out.println("dao end......");
				
				return CboardList;
			}
}
