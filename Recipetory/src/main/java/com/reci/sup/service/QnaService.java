package com.reci.sup.service;

import static com.reci.common.JDBCTemplate.close;
import static com.reci.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.reci.sup.dao.NotiDao;
import com.reci.sup.dao.QnaDao;
import com.reci.sup.vo.NotiVo;
import com.reci.sup.vo.QnaVo;

public class QnaService {

	public List<QnaVo> selectQnaList() {
		Connection conn = getConnection();
		List<QnaVo> qnaList = new QnaDao().selectQnaList(conn);
		close(conn); 
		
		return qnaList;
	}

	//관리자페이지에서 공지 보이기
	public List<QnaVo> qnaListAll() {
		Connection conn = getConnection();
		List<QnaVo> qnaListAll = new QnaDao().qnaListAll(conn);
		close(conn); 
		
		return qnaListAll;
	}
}
