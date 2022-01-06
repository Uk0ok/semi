package com.reci.chal.vo;

public class CfileVo {
	private int cfileNo;
	private int cpostNo;
	private int userNo;
	private String cfileName;
	private String cmFileName;
	
	public CfileVo(int cfileNo, int cpostNo, int userNo, String cfileName, String cmFileName) {
		super();
		this.cfileNo = cfileNo;
		this.cpostNo = cpostNo;
		this.userNo = userNo;
		this.cfileName = cfileName;
		this.cmFileName = cmFileName;
	}
	public int getCfileNo() {
		return cfileNo;
	}
	public void setCfileNo(int cfileNo) {
		this.cfileNo = cfileNo;
	}
	public int getCpostNo() {
		return cpostNo;
	}
	public void setCpostNo(int cpostNo) {
		this.cpostNo = cpostNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getCfileName() {
		return cfileName;
	}
	public void setCfileName(String cfileName) {
		this.cfileName = cfileName;
	}
	public String getCmFileName() {
		return cmFileName;
	}
	public void setCmFileName(String cmFileName) {
		this.cmFileName = cmFileName;
	}
	@Override
	public String toString() {
		return "CfileVo [cfileNo=" + cfileNo + ", cpostNo=" + cpostNo + ", userNo=" + userNo + ", cfileName="
				+ cfileName + ", cmFileName=" + cmFileName + "]";
	}
	
}
