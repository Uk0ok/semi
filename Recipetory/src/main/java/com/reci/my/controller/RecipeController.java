package com.reci.my.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reci.common.JDBCTemplate;
import com.reci.recipe.controller.RBoardVo;

@WebServlet("/recipe")
public class RecipeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 쿼리 날릴 준비
		Connection conn = JDBCTemplate.getConnection();

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		RBoardVo rb = null;
		String sql = "SELECT * FROM TB_BOARD_RECIPE";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int rpost_no = rs.getInt("POST_NO");
				int user_no = rs.getInt("USER_NO");
				String rpost_name = rs.getString("POST_NAME");
				String rpost_content = rs.getString("POST_CONTENT");
				Timestamp rbeg_date = rs.getTimestamp("BEG_DATE");
				int rhits = rs.getInt("HITS");
				int rrcom_num = rs.getInt("RECOM_NUM");
				int rscrap_num = rs.getInt("SCRAP_NUM");
				int rcomm_num = rs.getInt("COMM_NUM");
				int rreview_num = rs.getInt("REVIEW_NUM");
				String difficulty = rs.getString("DIFFICULTY");
				String req_time = rs.getString("REQ_TIME");
				String category = rs.getString("CATEGORY");
				String tag = rs.getString("TAG");
				String rthumbnail = rs.getString("THUMBNAIL");
				String rmod_yn = rs.getString("MOD_YN");
				String rdel_yn = rs.getString("DEL_YN");
				Timestamp rmod_date = rs.getTimestamp("FMOD_DATE");

				rb = new RBoardVo();
				rb.setRpost_no(rpost_no);
				rb.setUser_no(user_no);
				rb.setRpost_name(rpost_name);
				rb.setRpost_content(rpost_content);
				rb.setRbeg_date(rbeg_date);
				rb.setRhits(rhits);
				rb.setRrcom_num(rrcom_num);
				rb.setRscrap_num(rscrap_num);
				rb.setRcomm_num(rcomm_num);
				rb.setRreview_num(rreview_num);
				rb.setDifficulty(difficulty);
				rb.setReq_time(req_time);
				rb.setCategory(category);
				rb.setTag(tag);
				rb.setRthumbnail(rthumbnail);
				rb.setRmod_yn(rmod_yn);
				rb.setRdel_yn(rdel_yn);
				rb.setRmod_date(rmod_date);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		req.setAttribute("data", rb);
		req.getRequestDispatcher("/WEB-INF/views/recipe/recipeBoard.jsp").forward(req, resp);
	}
}
