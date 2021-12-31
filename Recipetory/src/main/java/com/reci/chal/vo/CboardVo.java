package com.reci.chal.vo;

import java.sql.Timestamp;

public class CboardVo {
	
	private int cpostNo;
	private String cpostName;
	private String cpostContent;
	private Timestamp cbegDate;
	private Timestamp challengePeriod;
	private int partiNum;
	private int chits;
	private int cscrapNum;
	private int ccommNum;
	private int creviewNum;
	private int creportNum;
	private String cthumbnail;
	private String cmodYn;
	private Timestamp cfmodDate;
	private String cdelYn;
	private int userNo;
	public int getCpostNo() {
		return cpostNo;
	}
	public void setCpostNo(int cpostNo) {
		this.cpostNo = cpostNo;
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
	public int getChits() {
		return chits;
	}
	public void setChits(int chits) {
		this.chits = chits;
	}
	public int getCscrapNum() {
		return cscrapNum;
	}
	public void setCscrapNum(int cscrapNum) {
		this.cscrapNum = cscrapNum;
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
	public int getCreportNum() {
		return creportNum;
	}
	public void setCreportNum(int creportNum) {
		this.creportNum = creportNum;
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
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	@Override
	public String toString() {
		return "CboardVo [cpostNo=" + cpostNo + ", cpostName=" + cpostName + ", cpostContent=" + cpostContent
				+ ", cbegDate=" + cbegDate + ", challengePeriod=" + challengePeriod + ", partiNum=" + partiNum
				+ ", chits=" + chits + ", cscrapNum=" + cscrapNum + ", ccommNum=" + ccommNum + ", creviewNum="
				+ creviewNum + ", creportNum=" + creportNum + ", cthumbnail=" + cthumbnail + ", cmodYn=" + cmodYn
				+ ", cfmodDate=" + cfmodDate + ", cdelYn=" + cdelYn + ", userNo=" + userNo + ", getCpostNo()="
				+ getCpostNo() + ", getCpostName()=" + getCpostName() + ", getCpostContent()=" + getCpostContent()
				+ ", getCbegDate()=" + getCbegDate() + ", getChallengePeriod()=" + getChallengePeriod()
				+ ", getPartiNum()=" + getPartiNum() + ", getChits()=" + getChits() + ", getCscrapNum()="
				+ getCscrapNum() + ", getCcommNum()=" + getCcommNum() + ", getCreviewNum()=" + getCreviewNum()
				+ ", getCreportNum()=" + getCreportNum() + ", getCthumbnail()=" + getCthumbnail() + ", getCmodYn()="
				+ getCmodYn() + ", getCfmodDate()=" + getCfmodDate() + ", getCdelYn()=" + getCdelYn() + ", getUserNo()="
				+ getUserNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}