package com.reci.join.controller;

import oracle.sql.TIMESTAMP;

public class UserVo {

	private int userNo;
	private String userId;
	private String userPwd;
	private String userNickname;
	private String userEmail;
	private String userPhone;
	private TIMESTAMP userJoinDate;
	private String userType;
	private String userDeleteYn;
	private TIMESTAMP LastLoginDate;

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

	public TIMESTAMP getUserJoinDate() {
		return userJoinDate;
	}

	public void setUserJoinDate(TIMESTAMP userJoinDate) {
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

	public TIMESTAMP getLastLoginDate() {
		return LastLoginDate;
	}

	public void setLastLoginDate(TIMESTAMP lastLoginDate) {
		LastLoginDate = lastLoginDate;
	}

	@Override
	public String toString() {
		return "UserVo [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userNickname="
				+ userNickname + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userJoinDate="
				+ userJoinDate + ", userType=" + userType + ", userDeleteYn=" + userDeleteYn + ", LastLoginDate="
				+ LastLoginDate + "]";
	}

}
