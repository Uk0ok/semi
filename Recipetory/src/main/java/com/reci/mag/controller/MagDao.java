package com.reci.mag.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MagDao {

	public List<MagVo> selectMagList(Connection conn) {
		//쿼리 날릴 준비
		PreparedStatement pstmt = null; //변수 생성
		ResultSet rs = null;
		String sql = "SELECT * FROM TB_BOARD_MAGAZINE";
		List<MagVo> magList = new ArrayList<MagVo>(); //Magvo로 제한. 제한이 없다면 다 들어와버린다.
		
		//이제 쿼리 날리자
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); //result 셋에 결과가 나오니까 executeQuery를 쓴다.
			
			while(rs.next()) { //계속 반복해서 모든 게시글들을 조회하기위해 while을 넣어준다
				//rs에서 현재 커서가 가리키는 행
				//의 데이터를 가져오기
				String POST_NO = rs.getString("POST_NO"); //문자로 가져오기
				String POST_NAME = rs.getString("POST_NAME");
				String POST_CONTENT = rs.getString("POST_CONTENT");
				String BEG_DATE = rs.getString("BEG_DATE");
				String HITS = rs.getString("HITS");
				String RECOM_NUM = rs.getString("RECOM_NUM");
				String SCRAP_NUM = rs.getString("SCRAP_NUM");
				String COMM_NUM = rs.getString("COMM_NUM");
				String REPORT_NUM = rs.getString("REPORT_NUM");
				String MOD_YN = rs.getString("MOD_YN");
				String FMOD_DATE = rs.getString("FMOD_DATE");
				String DEL_YN = rs.getString("DEL_YN");
				String USER_NO = rs.getString("USER_NO");
				
				//관리하기 힘드니 하나로 뭉친다.
				MagVo mag = new MagVo();
				mag.setPOST_NO(POST_NO);
				mag.setPOST_NAME(POST_NAME);
				mag.setPOST_CONTENT(POST_CONTENT);
				mag.setBEG_DATE(BEG_DATE);
				mag.setHITS(HITS);
				mag.setRECOM_NUM(RECOM_NUM);
				mag.setSCRAP_NUM(SCRAP_NUM);
				mag.setCOMM_NUM(COMM_NUM);
				mag.setREPORT_NUM(REPORT_NUM);
				mag.setMOD_YN(MOD_YN);
				mag.setFMOD_DATE(FMOD_DATE);
				mag.setDEL_YN(DEL_YN);
				mag.setUSER_NO(USER_NO);
				
				magList.add(mag);
				//mag 라는 데이터를 화면에 넘겨주면 된다.
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rs); //connection은 클로즈 하지 않는다. service에서 만들었기때문. go service
		}
		
		return magList;
	}
}
