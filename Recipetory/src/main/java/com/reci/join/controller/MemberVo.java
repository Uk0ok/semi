package com.reci.join.controller;

import java.sql.Timestamp;
import java.util.Date;

import oracle.sql.TIMESTAMP;

public class MemberVo {

	private int userNo;
	private String userId;
	private String userPwd;
	private String userNickname;
	private String userEmail;
	private String userPhone;
	private Timestamp userJoinDate;
	private String userType;
	private String userDeleteYn;
	private Timestamp LastLoginDate;

	public MemberVo(int userNo, String userId, String userPwd, String userNickname, String userEmail, String userPhone,
			Timestamp userJoinDate, String userType, String userDeleteYn, Timestamp lastLoginDate) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userNickname = userNickname;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userJoinDate = userJoinDate;
		this.userType = userType;
		this.userDeleteYn = userDeleteYn;
		LastLoginDate = lastLoginDate;
	}

	public MemberVo() {
		// TODO Auto-generated constructor stub
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Timestamp getUserJoinDate() {
		return userJoinDate;
	}

	public void setUserJoinDate(Timestamp userJoinDate) {
		this.userJoinDate = userJoinDate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserDeleteYn() {
		return userDeleteYn;
	}

	public void setUserDeleteYn(String userDeleteYn) {
		this.userDeleteYn = userDeleteYn;
	}

	public Timestamp getLastLoginDate() {
		return LastLoginDate;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		LastLoginDate = lastLoginDate;
	}

	@Override
	public String toString() {
		return "MemberVo [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userNickname="
				+ userNickname + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userJoinDate="
				+ userJoinDate + ", userType=" + userType + ", userDeleteYn=" + userDeleteYn + ", LastLoginDate="
				+ LastLoginDate + "]";
	}

}