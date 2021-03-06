package com.reci.chal.vo;

import java.sql.Date;
import java.sql.Timestamp;

public class CwriteVo {

	private int cpostNo;
	private int userNo;
	private String cpostName;
	private String cpostContent;
	private Timestamp cbegDate;
	private Date challengePeriod;
	private int partiNum;
	private int creviewNum;
	private String cthumbnail;
	private String cmodYn;
	private String cdelYn;
	private Timestamp cfmodDate;
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
	public Date getChallengePeriod() {
		return challengePeriod;
	}
	public void setChallengePeriod(Date challengePeriod) {
		this.challengePeriod = challengePeriod;
	}
	public int getPartiNum() {
		return partiNum;
	}
	public void setPartiNum(int partiNum) {
		this.partiNum = partiNum;
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
	public String getCdelYn() {
		return cdelYn;
	}
	public void setCdelYn(String cdelYn) {
		this.cdelYn = cdelYn;
	}
	public Timestamp getCfmodDate() {
		return cfmodDate;
	}
	public void setCfmodDate(Timestamp cfmodDate) {
		this.cfmodDate = cfmodDate;
	}
	@Override
	public String toString() {
		return "CwriteVo [cpostNo=" + cpostNo + ", userNo=" + userNo + ", cpostName=" + cpostName + ", cpostContent="
				+ cpostContent + ", cbegDate=" + cbegDate + ", challengePeriod=" + challengePeriod + ", partiNum="
				+ partiNum + ", creviewNum=" + creviewNum + ", cthumbnail=" + cthumbnail + ", cmodYn=" + cmodYn
				+ ", cdelYn=" + cdelYn + ", cfmodDate=" + cfmodDate + "]";
	}
	
}