package com.reci.chal.service;

import static com.reci.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;

import com.reci.chal.dao.CboardwDao;
import com.reci.chal.vo.CboardwVo;
import com.reci.common.JDBCTemplate;

public class CboardwService {

   public int write(CboardwVo cwv) {

      // DB Connection 가져오기
      Connection conn = getConnection();

      // 쿼리 날리기 //insert
      int result = 0;
      try {
         result = insertChallenge(conn, cwv);
         if(result > 0)
            commit(conn);
         else
            rollback(conn);
      } catch (SQLException e) {
         rollback(conn);
         e.printStackTrace();
      } finally {
         close(conn);
      }

      // 결과 반환해주기
      return result;
   }

   public int insertChallenge(Connection conn, CboardwVo cwv) throws SQLException {
      // dao 불러서 쿼리 실행
      // dao한테 쿼리 실행 결과 받기
      return new CboardwDao().insertRecipe(conn, cwv);
   }

}