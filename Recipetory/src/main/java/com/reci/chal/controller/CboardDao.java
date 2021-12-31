package com.reci.chal.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;

public class CboardDao {

	public List<CboardVo> selectchList(Connection conn){
		//쿼리 날릴 준비
				PreparedStatement pstmt = null; //변수 생성
				ResultSet rs = null;
				String sql = "SELECT * FROM TB_BOARD_CHALLENGE";
				List<CboardVo> chList = new ArrayList<CboardVo>(); //ChallengeVo로 제한. 제한이 없다면 다 들어와버린다.
				
				//이제 쿼리 날리자
				try {
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery(); //result 셋에 결과가 나오니까 executeQuery를 쓴다.
					
					while(rs.next()) { //계속 반복해서 모든 게시글들을 조회하기위해 while을 넣어준다
						//rs에서 현재 커서가 가리키는 행의 데이터를 가져오기
						int postNo = rs.getInt("postNo");
						String postName = rs.getString("postName");
						String postContent = rs.getString("postContent");
						Timestamp begDate = rs.getTimestamp("begDate");
						Timestamp challengePeriod = rs.getTimestamp("challengePeriod");
						int partiNum = rs.getInt("partinum");
						int hits = rs.getInt("hits");
						int scrapNum = rs.getInt("scrapNum");
						int commNum = rs.getInt("commNum");
						int reviewNum = rs.getInt("reviewNum");
						int reportNum = rs.getInt("reportNum");
						String thumbnail = rs.getString("thumbnail");
						String modYn = rs.getString("modYn");
						Timestamp fmodDate = rs.getTimestamp("fmodDate"); 
						String delYn = rs.getString("delYn");
						int userNo = rs.getInt("userNo");
						
						//관리하기 힘드니 하나로 뭉친다.
						CboardVo ch = new CboardVo();
						ch.setPostNo(postNo);
						ch.setPostName(postName);
						ch.setPostContent(postContent);
						ch.setBegDate(begDate);
						ch.setChallengePeriod(challengePeriod);
						ch.setPartiNum(partiNum);
						ch.setHits(hits);
						ch.setScrapNum(scrapNum);
						ch.setCommNum(commNum);
						ch.setReviewNum(reviewNum);
						ch.setReportNum(reportNum);
						ch.setModYn(modYn);
						ch.setFmodDate(fmodDate);
						ch.setDelYn(delYn);
						ch.setUserNo(userNo);
						
						chList.add(ch);
						//chal 라는 데이터를 화면에 넘겨주면 된다.
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCTemplate.close(pstmt);
					JDBCTemplate.close(rs); //connection은 클로즈 하지 않는다. service에서 만들었기때문. go service
				}
				
				return chList;
			}

	}

