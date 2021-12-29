package com.reci.chal.controller;

import java.sql.Timestamp;

public class ChallengeVo {
	
	private int postNO;
	private String postName;
	private Timestamp begDate;
	private int partiNum;
	private int cummNum;
	private int reviewNum;
	private int reportNum;
	private String modYN;
	private Timestamp fmodDate;
	private String delYN;
	private int userNo;
	public int getPostNO() {
		return postNO;
	}
	public void setPostNO(int postNO) {
		this.postNO = postNO;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public Timestamp getBegDate() {
		return begDate;
	}
	public void setBegDate(Timestamp begDate) {
		this.begDate = begDate;
	}
	public int getPartiNum() {
		return partiNum;
	}
	public void setPartiNum(int partiNum) {
		this.partiNum = partiNum;
	}
	public int getCummNum() {
		return cummNum;
	}
	public void setCummNum(int cummNum) {
		this.cummNum = cummNum;
	}
	public int getReviewNum() {
		return reviewNum;
	}
	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}
	public int getReportNum() {
		return reportNum;
	}
	public void setReportNum(int reportNum) {
		this.reportNum = reportNum;
	}
	public String getModYN() {
		return modYN;
	}
	public void setModYN(String modYN) {
		this.modYN = modYN;
	}
	public Timestamp getFmodDate() {
		return fmodDate;
	}
	public void setFmodDate(Timestamp fmodDate) {
		this.fmodDate = fmodDate;
	}
	public String getDelYN() {
		return delYN;
	}
	public void setDelYN(String delYN) {
		this.delYN = delYN;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
}
