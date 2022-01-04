package com.reci.chal.vo;

import java.sql.Timestamp;

public class CwriteVo {
	
	private int cpostNo;
	private int userNo;
	private String cpostName;
	private Timestamp cbegDate;
	private String challengePeriod;
	private String cpostContent;
	private String cthumbnail;
	private String cmodYn;
	private String cdelYn;
	private Timestamp cmodDate;
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
	public String getCpostName() {
		return cpostName;
	}
	public void setCpostName(String cpostName) {
		this.cpostName = cpostName;
	}
	public Timestamp getCbegDate() {
		return cbegDate;
	}
	public void setCbegDate(Timestamp cbegDate) {
		this.cbegDate = cbegDate;
	}
	public String getChallengePeriod() {
		return challengePeriod;
	}
	public void setChallengePeriod(String challengePeriod) {
		this.challengePeriod = challengePeriod;
	}
	public String getCpostContent() {
		return cpostContent;
	}
	public void setCpostContent(String cpostContent) {
		this.cpostContent = cpostContent;
	}
	public String getCthumbnail() {
		return cthumbnail;
	}
	public void setCthumbnail(String cthumbnail) {
		this.cthumbnail = cthumbnail;
	}
	public String getCmodYn() {
		return cmodYn;
	}
	public void setCmodYn(String cmodYn) {
		this.cmodYn = cmodYn;
	}
	public String getCdelYn() {
		return cdelYn;
	}
	public void setCdelYn(String cdelYn) {
		this.cdelYn = cdelYn;
	}
	public Timestamp getCmodDate() {
		return cmodDate;
	}
	public void setCmodDate(Timestamp cmodDate) {
		this.cmodDate = cmodDate;
	}
	@Override
	public String toString() {
		return "CwriteVo [cpostNo=" + cpostNo + ", userNo=" + userNo + ", cpostName=" + cpostName + ", cbegDate="
				+ cbegDate + ", challengePeriod=" + challengePeriod + ", cpostContent=" + cpostContent + ", cthumbnail="
				+ cthumbnail + ", cmodYn=" + cmodYn + ", cdelYn=" + cdelYn + ", cmodDate=" + cmodDate + "]";
	}
	
}	