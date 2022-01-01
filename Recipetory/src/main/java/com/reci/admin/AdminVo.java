package com.reci.admin;

import java.sql.Timestamp;

public class AdminVo {
	
	private int adminNo;
	private String adminId;
	private String adminPwd;
	private String adminName;
	private String adminLv;
	private Timestamp joinDate;
	private Timestamp deleteDate;
	
	public AdminVo(int adminNo, String adminId, String adminPwd, String adminName, String adminLv, Timestamp joinDate,
			Timestamp deleteDate) {
		super();
		this.adminNo = adminNo;
		this.adminId = adminId;
		this.adminPwd = adminPwd;
		this.adminName = adminName;
		this.adminLv = adminLv;
		this.joinDate = joinDate;
		this.deleteDate = deleteDate;
	}
	public AdminVo() {
	}
	public int getAdminNo() {
		return adminNo;
	}
	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminLv() {
		return adminLv;
	}
	public void setAdminLv(String adminLv) {
		this.adminLv = adminLv;
	}
	public Timestamp getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}
	public Timestamp getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}
	@Override
	public String toString() {
		return "AdminVo [adminNo=" + adminNo + ", adminId=" + adminId + ", adminPwd=" + adminPwd + ", adminName="
				+ adminName + ", adminLv=" + adminLv + ", joinDate=" + joinDate + ", deleteDate=" + deleteDate + "]";
	}
	
	
	
}