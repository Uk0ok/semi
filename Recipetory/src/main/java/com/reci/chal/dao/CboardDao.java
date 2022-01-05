package com.reci.chal.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;
import com.reci.chal.vo.CwriteVo;

public class CboardDao {

	public List<CwriteVo> selectCboardList(Connection conn){

//			System.out.println("DAO 호출됨...");//swy
		
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				List<CwriteVo> CboardList = new ArrayList<CwriteVo>(); 
				String sql = "SELECT * FROM TB_POST_C ORDER BY POST_NO DESC ";
				
				try {
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					
					while(rs.next()) { 
						int cpostNo = rs.getInt("POST_NO");
						int userNo = rs.getInt("USER_NO");
						String cpostName = rs.getString("POST_NAME");
						String cpostContent = rs.getString("POST_CONTENT");
						Timestamp cbegDate = rs.getTimestamp("BEG_DATE");
						Date challengePeriod = rs.getDate("CHALLENGE_PERIOD");
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
					close(pstmt);
					close(rs); 
				}
				
//				System.out.println("dao end......");
				
				return CboardList;
			}
	public CwriteVo viewChallenge(Connection conn, int postNo) {
		String sql ="SELECT * FROM TB_POST_C WHERE POST_NO = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CwriteVo viewChallenge = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, postNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				viewChallenge = new CwriteVo();
				viewChallenge.setCpostNo(postNo);
				viewChallenge.setUserNo(rs.getInt("USER_NO"));
				viewChallenge.setCpostName(rs.getString("POST_NAME"));
				viewChallenge.setCpostContent(rs.getString("POST_CONTENT"));
				viewChallenge.setCbegDate(rs.getTimestamp("BEG_DATE"));
				viewChallenge.setChallengePeriod(rs.getDate("CHALLENGE_PERIOD"));
				viewChallenge.setPartiNum(rs.getInt("PARTI_NUM"));
				viewChallenge.setCreviewNum(rs.getInt("REVIEW_NUM"));
				viewChallenge.setCthumbnail(rs.getString("THUMBNAIL"));
				viewChallenge.setCmodYn(rs.getString("MOD_YN"));
				viewChallenge.setCdelYn(rs.getString("DEL_YN"));
				viewChallenge.setCfmodDate(rs.getTimestamp("FMOD_DATE"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return viewChallenge;
	}
}
