package com.reci.join.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static com.reci.common.JDBCTemplate.*;

import com.reci.join.controller.MemberDao;
import com.reci.join.controller.Member;

public class MemberService {

	private String encrypt(String pwd) {
		// 패스워드 암호화
		StringBuilder sb = new StringBuilder();
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-512");
			md.update(pwd.getBytes());
			byte[] digest = md.digest();
			for (byte b : digest) {
				sb.append(String.format("%02x", b));
			}
		} catch (NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		}
		return sb.toString();
	}

	public int join(Member m) {
		m.setPassword(encrypt(m.getPassword()));

		// DB Connection 가져오기
		Connection conn = getConnection();

		// 쿼리 날리기 //insert
		int result = 0;
		try {
			result = insertMember(conn, m);
			if (result > 0)
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

	public int insertMember(Connection conn, Member m) throws SQLException {
		// dao 불러서 쿼리 실행
		// dao 한테 쿼리 실행 결과 받기
		return new MemberDao().insertMember(conn, m);
	}

	public Member login(Member m) {
		// 커넥션 가져오기
		Connection conn = getConnection();

		// id 가지고 그 아이디의 비번 조회

		Member selectedMember = selectMember(conn, m);

		close(conn);

		if (selectedMember.getPassword().equals(encrypt(m.getPassword()))) {
			return selectedMember;
		} else {
			return null;
		}
	}

	public Member selectMember(Connection conn, Member m) {
		return new MemberDao().selectMember(conn, m);
	}

	public List<Member> selectMemberAll(Connection conn, String currentPage, int startNo, int endNo) {
		return new MemberDao().selectMemberAll(conn, startNo, endNo);
	}

	public List<Member> search(String type, String value, String currentPage) {
		Connection conn = getConnection();
		int totalBoardCount = countMemberAll(conn);// 총 회원 수 //select count(*) ~~~~
		int pageLimit = 5; // 페이징 목록 최대갯수
		int boardLimit = 5; // 한 페이지당 게시글 수
		int maxPage = 0; // 마지막 페이지

		maxPage = totalBoardCount / boardLimit;
		if (totalBoardCount % boardLimit != 0) {
			maxPage++;
		}
		System.out.println("maxPage : " + maxPage);

		// (currentPage * boardLimit) - boardLimit + 1 ~ currentPage * boardLimit
		int p = Integer.parseInt(currentPage);
		int endNo = p * boardLimit;
		int startNo = endNo - boardLimit + 1;

		List<Member> memberList;
		if (type == null || value == null) {
			memberList = selectMemberAll(conn, currentPage, startNo, endNo);
		} else {
			memberList = selectMember(conn, type, value);
		}
		close(conn);

		return memberList;
	}

	private int countMemberAll(Connection conn) {
		return new MemberDao().countMemberAll(conn);
	}

	private List<Member> selectMember(Connection conn, String type, String value) {
		return new MemberDao().selectMemberBySearch(conn, type, value);
	}

	public int dupCheck(String id) {
		Connection conn = getConnection();
		int result = selectMemberById(conn, id);
		close(conn);
		return result;
	}

	private int selectMemberById(Connection conn, String id) {
		return new MemberDao().selectMemberById(conn, id);
	}

	public Member login(String userId, String userPwd) {
		// TODO Auto-generated method stub
		return null;
	}

}