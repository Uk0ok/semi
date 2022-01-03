package com.reci.chal.vo;

import java.sql.Timestamp;

public class CboardwVo {

	
	private int cpostNo;
	private int userNo;
	private String cpostName;
	private String cpostContent;
	private Timestamp cbegDate;
	private Timestamp challengePeriod;
	private String cthumbnail;
	private String cmodYn;
	private Timestamp cmodDate;
	private String cdelYn;
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
	public String getCpostContent() {
		return cpostContent;
	}
	public void setCpostContent(String cpostContent) {
		this.cpostContent = cpostContent;
	}
	public Timestamp getCbegDate() {
		return cbegDate;
	}
	public void setCbegDate(Timestamp cbegDate) {
		this.cbegDate = cbegDate;
	}
	public Timestamp getChallengePeriod() {
		return challengePeriod;
	}
	public void setChallengePeriod(Timestamp challengePeriod) {
		this.challengePeriod = challengePeriod;
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
	@Override
	public String toString() {
		return "CboardwVo [cpostNo=" + cpostNo + ", userNo=" + userNo + ", cpostName=" + cpostName + ", cpostContent="
				+ cpostContent + ", cbegDate=" + cbegDate + ", challengePeriod=" + challengePeriod + ", cthumbnail="
				+ cthumbnail + ", cmodYn=" + cmodYn + ", cdelYn=" + cdelYn + "]";
	}
	
}