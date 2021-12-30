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

	public List<CboardVo> selectchalList(Connection conn){
		//쿼리 날릴 준비
				PreparedStatement pstmt = null; //변수 생성
				ResultSet rs = null;
				String sql = "SELECT * FROM TB_BOARD_CHALLENGE";
				List<CboardVo> chalList = new ArrayList<CboardVo>(); //ChallengeVo로 제한. 제한이 없다면 다 들어와버린다.
				
				//이제 쿼리 날리자
				try {
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery(); //result 셋에 결과가 나오니까 executeQuery를 쓴다.
					
					while(rs.next()) { //계속 반복해서 모든 게시글들을 조회하기위해 while을 넣어준다
						//rs에서 현재 커서가 가리키는 행의 데이터를 가져오기
						int POST_NO = rs.getInt("POST_NO");
						String POST_NAME = rs.getString("POST_NAME");
						String POST_CONTENT = rs.getString("POST_CONTENT");
						Timestamp BEG_DATE = rs.getTimestamp("BEG_DATE");
						Timestamp CHALLENGE_PERIOD = rs.getTimestamp("CHALLENGE_PERIOD");
						int PARTI_NUM = rs.getInt("PARTI_NUM");
						int HITS = rs.getInt("HITS");
						int SCRAP_NUM = rs.getInt("SCRAP_NUM");
						int COMM_NUM = rs.getInt("COMM_NUM");
						int REVIEW_NUM = rs.getInt("REVIEW_NUM");
						int REPORT_NUM = rs.getInt("REPORT_NUM");
						String THUMBNAIL = rs.getString("THUMBNAIL");
						String MOD_YN = rs.getString("MOD_YN");
						Timestamp FMOD_DATE = rs.getTimestamp("FMOD_DATE");
						String DEL_YN = rs.getString("DEL_YN");
						int USER_NO = rs.getInt("USER_NO");
						
						//관리하기 힘드니 하나로 뭉친다.
						CboardVo chal = new CboardVo();
						chal.setPOST_NO(POST_NO);
						chal.setPOST_NAME(POST_NAME);
						chal.setPOST_CONTENT(POST_CONTENT);
						chal.setBEG_DATE(BEG_DATE);
						chal.setCHALLENGE_PERIOD(CHALLENGE_PERIOD);
						chal.setPARTI_NUM(PARTI_NUM);
						chal.setHITS(HITS);
						chal.setSCRAP_NUM(SCRAP_NUM);
						chal.setCOMM_NUM(COMM_NUM);
						chal.setREVIEW_NUM(REVIEW_NUM);
						chal.setREPORT_NUM(REPORT_NUM);
						chal.setMOD_YN(MOD_YN);
						chal.setFMOD_DATE(FMOD_DATE);
						chal.setDEL_YN(DEL_YN);
						chal.setUSER_NO(USER_NO);
						
						chalList.add(chal);
						//chal 라는 데이터를 화면에 넘겨주면 된다.
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCTemplate.close(pstmt);
					JDBCTemplate.close(rs); //connection은 클로즈 하지 않는다. service에서 만들었기때문. go service
				}
				
				return chalList;
			}

	}

