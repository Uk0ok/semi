package com.reci.mag.dao;

import static com.reci.common.JDBCTemplate.close;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.reci.mag.Vo.MagVo;

public class MagDao {
	
		public List<MagVo> magListAll(Connection conn){
			String sql = "SELECT * FROM TB_BOARD_MAGAZINE";
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<MagVo> magListAll = new ArrayList<MagVo>(); 
			
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				MagVo m = null;
				
				while(rs.next()) {
					
					int postNo = rs.getInt("POST_NO");
					String postName = rs.getString("POST_NAME");
					String postContent = rs.getString("POST_CONTENT");
					Timestamp begDate = rs.getTimestamp("BEG_DATE");
					int hits = rs.getInt("HITS");
					int recomNum = rs.getInt("RECOM_NUM");
					int scrapNum = rs.getInt("SCRAP_NUM");
					int commNum = rs.getInt("COMM_NUM");
					String modYn = rs.getString("MOD_YN");
					Timestamp fmodDate = rs.getTimestamp("FMOD_DATE");
					String delYn = rs.getString("DEL_YN");
					int adminNo = rs.getInt("ADMIN_NO");
					
					m = new MagVo();
					m.setPostNo(postNo);
					m.setPostName(postName);
					m.setPostContent(postContent);
					m.setBegDate(begDate);
					m.setHits(hits);
					m.setRecomNum(recomNum);;
					m.setHits(scrapNum);
					m.setCommNum(commNum);
					m.setModYn(modYn);
					m.setFmodDate(fmodDate);
					m.setDelYn(delYn);
					m.setAdminNo(adminNo);
					
					magListAll.add(m);
					
				}
					
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(rs);
			}
			return magListAll;
		}
		
		public int countMagAll(Connection conn) {
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "SELECT COUNT(POST_NO) FROM TB_BOARD_MAGAZINE WHERE DEL_YN = 'N'";
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
		
		public List<MagVo> selectMagList(Connection conn, int startNo, int endNo){
			//쿼리 날릴 준비
			String sql = "SELECT * "
					+ "FROM "
					+ "("
					+ "SELECT ROWNUM AS RNUM, m.* FROM TB_BOARD_MAGAZINE m WHERE DEL_YN = 'N'"
					+ ")"
					+ "WHERE ROWNUM BETWEEN ? AND ?"
					+ "ORDER BY RNUM DESC";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<MagVo> magList = new ArrayList<MagVo>(); //리스트안에 제네릭이용해서 MagVo만 들어오게
			
			//쿼리 날리기
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, startNo);
				pstmt.setInt(2,endNo);
				rs = pstmt.executeQuery(); //실행결과가 resultset에 나오기 때문에
				
				while (rs.next()) {
					int postNo = rs.getInt("POST_NO");
					String postName = rs.getString("POST_NAME");
					String postContent = rs.getString("POST_CONTENT");
					Timestamp begDate = rs.getTimestamp("BEG_DATE");
					int hits = rs.getInt("HITS");
					int recomNum = rs.getInt("RECOM_NUM");
					int scrapNum = rs.getInt("SCRAP_NUM");
					int commNum = rs.getInt("COMM_NUM");
					String modYn = rs.getString("MOD_YN");
					Timestamp fmodDate = rs.getTimestamp("FMOD_DATE");
					String delYn = rs.getString("DEL_YN");
					int adminNo = rs.getInt("ADMIN_NO");
					
					MagVo m = new MagVo();
					m.setPostNo(postNo);
					m.setPostName(postName);
					m.setPostContent(postContent);
					m.setBegDate(begDate);
					m.setHits(hits);
					m.setRecomNum(recomNum);;
					m.setHits(scrapNum);
					m.setCommNum(commNum);
					m.setModYn(modYn);
					m.setFmodDate(fmodDate);
					m.setDelYn(delYn);
					m.setAdminNo(adminNo);
					
					magList.add(m);
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(rs);
			}
			return magList;
		}
		
				
	}
	
