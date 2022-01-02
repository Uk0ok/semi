package com.reci.sup.service;

import static com.reci.common.JDBCTemplate.close;
import static com.reci.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.reci.sup.dao.QnaDao;
import com.reci.sup.dao.RepoDao;
import com.reci.sup.vo.QnaVo;
import com.reci.sup.vo.RepoVo;

public class RepoService {

	public List<RepoVo> selectRepoList() {
		Connection conn = getConnection();
		List<RepoVo> repoList = new RepoDao().selectRepoList(conn);
		close(conn); 
		
		return repoList;
	}

	//관리자페이지에서 공지 보이기
	public List<RepoVo> repoListAll() {
		Connection conn = getConnection();
		List<RepoVo> repoListAll = new RepoDao().repoListAll(conn);
		close(conn); 
		
		return repoListAll;
	}
}
