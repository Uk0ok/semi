package com.reci.join.controller;

import static com.reci.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.reci.common.JDBCTemplate;
import com.reci.join.controller.Member;

public class MemberDao {

	public int insertMember(Connection conn, Member m) throws SQLException {
		//쿼리 날리기
		String sql = "INSERT INTO TB_USER VALUES(SEQ_UNO.NEXTVAL , ?, ?, ?, ?, ?, SYSDATE, 'a', 'N', SYSDATE)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getNickname());
			pstmt.setString(4, m.getEmail());
			pstmt.setString(5, m.getPhone());
			
			result = pstmt.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public Member selectMember(Connection conn, Member m) {
		String query = "SELECT * FROM TB_USER WHERE USER_ID = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Member selectedMember = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getId());
			System.out.println(pstmt);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int no = rs.getInt("USER_NO");
				String id = rs.getString("USER_ID");
				String password = rs.getString("USER_PWD");;
				String nickname = rs.getString("USER_NICKNAME");;
				String email = rs.getString("USER_EMAIL");;
				String phone = rs.getString("USER_PHONE");;
				
				selectedMember = new Member();
				selectedMember.setNo(no);
				selectedMember.setId(id);
				selectedMember.setPassword(password);
				selectedMember.setNickname(nickname);
				selectedMember.setEmail(email);
				selectedMember.setPhone(phone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return selectedMember;
	}

	public List<Member> selectMemberAll(Connection conn, int startNo, int endNo) {
		
		String sql = "SELECT * "
				+ "FROM "
				+ "( "
				+ "SELECT ROWNUM AS RNUM , m.* FROM TB_USER m"
				+ ") "
				+ "WHERE RNUM BETWEEN ? AND ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Member> list = new ArrayList<Member>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startNo);
			pstmt.setInt(2, endNo);
			rs = pstmt.executeQuery();
			Member selectedMember = null;
			
			while(rs.next()) {
				int no = rs.getInt("USER_NO");
				String id = rs.getString("USER_ID");
				String password = rs.getString("USER_PWD");;
				String nickname = rs.getString("USER_NICKNAME");;
				String email = rs.getString("USER_EMAIL");;
				String phone = rs.getString("USER_PHONE");;
				
				selectedMember = new Member();
				selectedMember.setNo(no);
				selectedMember.setId(id);
				selectedMember.setPassword(password);
				selectedMember.setNickname(nickname);
				selectedMember.setEmail(email);
				selectedMember.setPhone(phone);
				
				list.add(selectedMember);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return list;
	}

	public int selectMemberById(Connection conn, String id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		String sql = "SELECT COUNT(*) FROM TB_USER WHERE USER_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			rs.next();
			result = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return result;

	}

	public List<Member> selectMemberBySearch(Connection conn, String type, String value) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM TB_USER WHERE %s LIKE ?";
		sql = String.format(sql, type);
		System.out.println("SQL ::: " + sql);
		
		List<Member> list = new ArrayList<Member>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + value + "%");
			
			Member selectedMember = null;
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("USER_NO");
				String id = rs.getString("USER_ID");
				String password = rs.getString("USER_PWD");;
				String nickname = rs.getString("USER_NICKNAME");;
				String email = rs.getString("USER_EMAIL");;
				String phone = rs.getString("USER_PHONE");;
				
				selectedMember = new Member();
				selectedMember.setNo(no);
				selectedMember.setId(id);
				selectedMember.setPassword(password);
				selectedMember.setNickname(nickname);
				selectedMember.setEmail(email);
				selectedMember.setPhone(phone);
				
				list.add(selectedMember);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public int countMemberAll(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT COUNT(USER_NO) FROM TB_USER ";
//		 WHERE USER_DELETE_YN = 'Y'
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

}
