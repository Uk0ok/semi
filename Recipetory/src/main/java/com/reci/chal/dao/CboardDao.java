package com.reci.chal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.chal.vo.CboardVo;
import com.reci.common.JDBCTemplate;

public class CboardDao {

	public List<CboardVo> selectCboardList(Connection conn){
		
			System.out.println("DAO 호출됨...");//swy
		
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				List<CboardVo> CboardList = new ArrayList<CboardVo>(); 
				String sql = "SELECT * FROM TB_BOARD_CHALLENGE";
				
				try {
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					
					while(rs.next()) { 
						int cpostNo = rs.getInt("POST_NO");
						int userNo = rs.getInt("USER_NO");
						String cpostName = rs.getString("POST_NAME");
						String cpostContent = rs.getString("POST_CONTENT");
						Timestamp cbegDate = rs.getTimestamp("BEG_DATE");
						Timestamp challengePeriod = rs.getTimestamp("CHALLENGE_PERIOD");
						int partiNum = rs.getInt("PARTI_NUM");
						int cscrapNum = rs.getInt("SCRAP_NUM");
						int chits = rs.getInt("HITS");
						int ccommNum = rs.getInt("COMM_NUM");
//						int creviewNum = rs.getInt("REVIEW_NUM");
						int creviewNum = 923;//swy
						String cthumbnail = rs.getString("THUMBNAIL");
						String cmodYn = rs.getString("MOD_YN");
						Timestamp cfmodDate = rs.getTimestamp("FMOD_DATE"); 
						String cdelYn = rs.getString("DEL_YN");
						
						
						//관리하기 힘드니 하나로 뭉친다.
						CboardVo ch = new CboardVo();
						ch.setCpostNo(cpostNo);
						ch.setUserNo(userNo);
						ch.setCpostName(cpostName);
						ch.setCpostContent(cpostContent);
						ch.setCbegDate(cbegDate);
						ch.setChallengePeriod(challengePeriod);
						ch.setPartiNum(partiNum);
						ch.setCscrapNum(cscrapNum);
						ch.setChits(chits);
						ch.setCcommNum(ccommNum);
						ch.setCreviewNum(creviewNum);
						ch.setCthumbnail(cthumbnail);
						ch.setCmodYn(cmodYn);
						ch.setCfmodDate(cfmodDate);
						ch.setCdelYn(cdelYn);
						
						CboardList.add(ch);
						
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCTemplate.close(pstmt);
					JDBCTemplate.close(rs); 
				}
				
				System.out.println("dao end......");//swy
				
				return CboardList;
			}

	}

