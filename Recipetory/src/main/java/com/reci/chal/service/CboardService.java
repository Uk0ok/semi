package com.reci.chal.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.reci.common.JDBCTemplate.* ;


import com.reci.chal.dao.CboardDao;
import com.reci.chal.dao.CfileDao;
import com.reci.chal.vo.CboardVo;
import com.reci.chal.vo.CfileVo;

public class CboardService {

	public List<CboardVo> selectCboardList(String currentPage){
	//	System.out.println("SEVICE 호출됨...");//swy
		Connection conn = getConnection();
		int totalBoardCount = countchallengeAll(conn);//총 게시글 수
		int pageLimit = 3; //페이징 목록 최대갯수
		int boardLimit = 50; //한 페이지당 게시글 수
		
		int p = Integer.parseInt(currentPage);
		int endNo = p * boardLimit;
		int startNo = endNo - boardLimit + 1;
		
		//DB에서 데이터 조회
		//커넥션 가져옴 -> 가져온 쪽에서 close 해야함
		
		List<CboardVo> CboardList = new CboardDao().selectCboardList(conn, startNo, endNo);
		close(conn);

		return CboardList;
		
	}
	
	private int countchallengeAll(Connection conn) {
		return new CboardDao().countCboardAll(conn);
	}
	
	// 게시물 보이기
	public static CboardVo CboardView(int postNo) { 
		CboardVo CboardView = null;
		Connection conn = getConnection();
		
		CboardView = new CboardDao().viewChallenge(conn, postNo);
		close(conn);
				
		return CboardView; 
	}

	public int uploadCboard(CboardVo c, CfileVo f) {
		Connection conn = getConnection();
		int uploadData = 0;
		int result = 0;
		int fileResult = 0;
		
		result = insertchallenge(conn, c);
		fileResult = insertAttachmentchallenge(conn, f, c);
		
		if(result > 0) {
			if(fileResult > 0) {
				commit(conn);
				uploadData = 1;
			}else {
				commit(conn);
				uploadData = 1;
			}
		}else {
			rollback(conn);
		}
		return uploadData;
		
	}
	
	private int insertAttachmentchallenge(Connection conn, CfileVo f, CboardVo c) {
		return new CfileDao().insertAttachmentchallenge(conn, f, c);
	}

	private int insertchallenge(Connection conn, CboardVo c) {
		return new CboardDao().insertchallenge(conn,c);
	}

	public static CfileVo nFileView(int postNo) {
		CfileVo cFileView = null;
		Connection conn = getConnection();
		
		cFileView = new CfileDao().cFileView(conn, postNo);
		close(conn);
				
		return cFileView; 
	}

}
