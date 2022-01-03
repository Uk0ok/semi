package com.reci.chal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import static com.reci.common.JDBCTemplate.*;
import com.reci.chal.vo.CboardwVo;

public class CboardwDao {

   public int insertRecipe(Connection conn, CboardwVo cwv) throws SQLException {
      // 쿼리 날리기
      String sql = "INSERT INTO TB_BOARD_CHALLENGE2 VALUES(SEQ_CHA_PNO.NEXTVAL,?,?,?,SYSDATE,?,'N','N')";
      PreparedStatement pstmt = null;
      int result = 0;
      
      
      try {
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, cwv.getCpostNo());
         pstmt.setString(2, cwv.getCpostName());
         pstmt.setString(3, cwv.getCpostContent());
         pstmt.setString(4, cwv.getCbegDate());
         pstmt.setString(5, cwv.getChallengePeriod());
         pstmt.setString(6, cwv.getCthumbnail());
         pstmt.setString(7, cwv.getCmodYn());
         pstmt.setString(8, cwv.getCdelYn());

         result = pstmt.executeUpdate();
      } finally {
         close(pstmt);
      }

      return result;
   }

}