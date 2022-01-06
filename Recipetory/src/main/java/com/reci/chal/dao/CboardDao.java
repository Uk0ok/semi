package com.reci.chal.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.chal.vo.CboardVo;


public class CboardDao {

	public List<CboardVo> selectCboardList(Connection conn, int startNo, int endNo){
// 쿼리 날릴 준비
System.out.println("DAO 호출됨...");//swy
		
		String sql = "SELECT * "
				+ "FROM "
				+ "("
				+ "SELECT ROWNUM AS RNUM, m.* FROM TB_POST_C m WHERE DEL_YN = 'N'"
				+ ")"
				+ "WHERE ROWNUM BETWEEN ? AND ?";
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				List<CboardVo> CboardList = new ArrayList<CboardVo>(); 
// 쿼리 날리기
		try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, startNo);
				pstmt.setInt(2, endNo);
				rs = pstmt.executeQuery(); //실행결과가 resultset에 나오기 때문에
			
				//모든 게시글 가져오기 위해, 다음줄마다 모두 실행되려면 while
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
				
				CboardVo c = new CboardVo();
				c.setCpostNo(cpostNo);
				c.setUserNo(userNo);
				c.setCpostName(cpostName);
				c.setCpostContent(cpostContent);
				c.setCbegDate(cbegDate);
				c.setChallengePeriod(challengePeriod);
				c.setCreviewNum(reviewNum);
				c.setPartiNum(partiNum);
				c.setCthumbnail(cthumbnail);
				c.setCmodYn(cmodYn);
				c.setCdelYn(cdelYn);
				c.setCfmodDate(cfmodDate);
				
				CboardList.add(c);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs); 
		}
		
//		System.out.println("dao end......");
		
		return CboardList;
}

public CboardVo viewChallenge(Connection conn, int postNo) {
		String sql ="SELECT * FROM TB_POST_C WHERE POST_NO = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CboardVo viewChallenge = null;
		
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, postNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				viewChallenge = new CboardVo();
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

public int countCboardAll(Connection conn) {
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "SELECT COUNT(POST_NO) FROM TB_POST_C WHERE DEL_YN = 'N'";
	int result = 0;
	
	try {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			result = rs.getInt(1);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close(pstmt);
		close(rs);
	}
	
	return result;
}



public int insertchallenge(Connection conn, CboardVo c) {
	String sql = "INSERT INTO TB_POST_C ( POST_NO, POST_TITLE, CHALLENGE_PERIOD, POST_CONTENT)"
			+ "VALUES ( SEQ_CHA_PTO.NEXTVAL, ?, ?, ?)";
	
	PreparedStatement pstmt = null;
	int result = 0;
	
	try {
		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setInt(1, c.getCpostNo());
		pstmt.setString(2, c.getCpostName());
		pstmt.setString(3, c.getCpostContent());

		result = pstmt.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		close(pstmt);
	}
	return result;
}




}
