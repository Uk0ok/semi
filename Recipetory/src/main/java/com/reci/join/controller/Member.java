package com.reci.join.controller;

import java.security.Timestamp;
import java.util.Date;

public class Member {

	private int no;
	private String id;
	private String password;
	private String nickname;
	private String email;
	private String phone;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", id=" + id + ", password=" + password + ", nickname=" + nickname + ", email="
				+ email + ", phone=" + phone + "]";
	}

}