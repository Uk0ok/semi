package com.reci.sup.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.reci.common.JDBCTemplate.* ;

import com.reci.admin.AdminVo;
import com.reci.admin.FileDao;
import com.reci.admin.FileVo;
import com.reci.join.controller.MemberDao;
import com.reci.sup.dao.NotiDao;
import com.reci.sup.vo.NotiVo;

public class NotiService {
	
	//유저페이지에서 공지 보이기
	public List<NotiVo> selectNotiList(String currentPage) {
		Connection conn = getConnection();
		int totalBoardCount = countNotiAll(conn); //총 게시글 수
		int pageLimit = 3; 		 //페이징 목록 최대갯수
		int boardLimit = 50; 	 //한 페이지당 게시글 수

		int p = Integer.parseInt(currentPage);
		int endNo = p * boardLimit;
		int startNo = endNo - boardLimit + 1;
		
		//디비에서 데이터조회
		//커넥션 가져옴 -> 가져온 쪽에서 클로즈 해야함
		List<NotiVo> notiList = new NotiDao().selectNotiList(conn, startNo, endNo);
		close(conn); 
		
		return notiList;
	}

	private int countNotiAll(Connection conn) {
		return new NotiDao().countNotiAll(conn);
	}

	//관리자페이지에서 공지 보이기
	public List<NotiVo> notiListAll() {
		Connection conn = getConnection();
		List<NotiVo> notiListAll = new NotiDao().notiListAll(conn);
		close(conn); 
		
		return notiListAll;
	}
	
	public static NotiVo notiView(int noticeNo) { 
		NotiVo notiView = null;
		Connection conn = getConnection();
		
		notiView = new NotiDao().notiView(conn, noticeNo);
		close(conn);
				
		return notiView; 
	}

	public static int updateHits(int noticeNo) {
		Connection conn = getConnection();
		int updateHits = new NotiDao().updateHits(conn, noticeNo);
		close(conn);
		
		return updateHits; 
	}

	public int uploadNoti(NotiVo n, FileVo f) {
		Connection conn = getConnection();
		int uploadData = 0;
		int result = 0;
		int fileResult = 0;
		
		result = insertNotice(conn, n);
		fileResult = insertAttachmentNoti(conn, f, n);
		
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
	
	private int insertAttachmentNoti(Connection conn, FileVo f, NotiVo n) {
		return new FileDao().insertAttachmentNoti(conn, f, n);
	}

	private int insertNotice(Connection conn, NotiVo n) {
		return new NotiDao().insertNotice(conn,n);
	}

	public static FileVo nFileView(int noticeNo) {
		FileVo nFileView = null;
		Connection conn = getConnection();
		
		nFileView = new FileDao().nFileView(conn, noticeNo);
		close(conn);
				
		return nFileView; 
	}

	public int delete(NotiVo n){
		
		Connection conn = getConnection();
		
		int result = 0;
		try {
			result = deleteNoti(conn, n);
			if(result > 0)
				commit(conn);
			else
				rollback(conn);
		} finally {
			close(conn);
		}
		return result;
	}

	private int deleteNoti(Connection conn, NotiVo n) {
		return new NotiDao().delete(conn, n);
	}

	public int modifyNoti(NotiVo n, FileVo f) {
		Connection conn = getConnection();
		int uploadData = 0;
		int result = 0;
		int fileResult = 0;
		
		result = insertNotice(conn, n);
		fileResult = insertAttachmentNoti(conn, f, n);
		
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
	
	private int modifyAttachmentNoti(Connection conn, FileVo f, NotiVo n) {
		return new FileDao().insertAttachmentNoti(conn, f, n);
	}

	private int modifyNotice(Connection conn, NotiVo n) {
		return new NotiDao().insertNotice(conn,n);
	}





}
