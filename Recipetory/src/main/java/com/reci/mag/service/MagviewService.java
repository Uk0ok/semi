package com.reci.mag.service;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;

import com.reci.mag.Vo.MagVo;
import com.reci.mag.dao.MagVDao;

public class MagviewService {

	public static MagVo magView(int postNo) {
		MagVo magView = null;
		Connection conn = getConnection();
		
		magView = new MagVDao().magView(conn, postNo);
		close(conn);
		
		return magView;
	}
}
