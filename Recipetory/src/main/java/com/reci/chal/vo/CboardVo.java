package com.reci.chal.vo;

import java.sql.Timestamp;

public class CboardVo {
	
	private int cpostNo;
	private int userNo;
	private String cpostName;
	private String cpostContent;
	private Timestamp cbegDate;
	private Timestamp challengePeriod;
	private int partiNum;
	private int cscrapNum;
	private int chits;
	private int ccommNum;
	private int creviewNum;
	private String cthumbnail;
	private String cmodYn;
	private Timestamp cfmodDate;
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
	public int getPartiNum() {
		return partiNum;
	}
	public void setPartiNum(int partiNum) {
		this.partiNum = partiNum;
	}
	public int getCscrapNum() {
		return cscrapNum;
	}
	public void setCscrapNum(int cscrapNum) {
		this.cscrapNum = cscrapNum;
	}
	public int getChits() {
		return chits;
	}
	public void setChits(int chits) {
		this.chits = chits;
	}
	public int getCcommNum() {
		return ccommNum;
	}
	public void setCcommNum(int ccommNum) {
		this.ccommNum = ccommNum;
	}
	public int getCreviewNum() {
		return creviewNum;
	}
	public void setCreviewNum(int creviewNum) {
		this.creviewNum = creviewNum;
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
	public Timestamp getCfmodDate() {
		return cfmodDate;
	}
	public void setCfmodDate(Timestamp cfmodDate) {
		this.cfmodDate = cfmodDate;
	}
	public String getCdelYn() {
		return cdelYn;
	}
	public void setCdelYn(String cdelYn) {
		this.cdelYn = cdelYn;
	}
	@Override
	public String toString() {
		return "CboardVo [cpostNo=" + cpostNo + ", userNo=" + userNo + ", cpostName=" + cpostName + ", cpostContent="
				+ cpostContent + ", cbegDate=" + cbegDate + ", challengePeriod=" + challengePeriod + ", partiNum="
				+ partiNum + ", cscrapNum=" + cscrapNum + ", chits=" + chits + ", ccommNum=" + ccommNum
				+ ", creviewNum=" + creviewNum + ", cthumbnail=" + cthumbnail + ", cmodYn=" + cmodYn + ", cfmodDate="
				+ cfmodDate + ", cdelYn=" + cdelYn + "]";
	}

	
	
	
}