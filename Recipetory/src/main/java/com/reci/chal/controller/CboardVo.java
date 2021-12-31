package com.reci.chal.controller;

import java.sql.Timestamp;

public class CboardVo {
	
	private int postNo;
	private String postName;
	private String postContent;
	private Timestamp begDate;
	private Timestamp challengePeriod;
	private int partiNum;
	private int hits;
	private int scrapNum;
	private int commNum;
	private int reviewNum;
	private int reportNum;
	private String thumbnail;
	private String modYn;
	private Timestamp fmodDate;
	private String delYn;
	private int userNo;
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public Timestamp getBegDate() {
		return begDate;
	}
	public void setBegDate(Timestamp begDate) {
		this.begDate = begDate;
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
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getScrapNum() {
		return scrapNum;
	}
	public void setScrapNum(int scrapNum) {
		this.scrapNum = scrapNum;
	}
	public int getCommNum() {
		return commNum;
	}
	public void setCommNum(int commNum) {
		this.commNum = commNum;
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
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getModYn() {
		return modYn;
	}
	public void setModYn(String modYn) {
		this.modYn = modYn;
	}
	public Timestamp getFmodDate() {
		return fmodDate;
	}
	public void setFmodDate(Timestamp fmodDate) {
		this.fmodDate = fmodDate;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	@Override
	public String toString() {
		return "CboardVo [postNo=" + postNo + ", postName=" + postName + ", postContent=" + postContent + ", begDate="
				+ begDate + ", challengePeriod=" + challengePeriod + ", partiNum=" + partiNum + ", hits=" + hits
				+ ", scrapNum=" + scrapNum + ", commNum=" + commNum + ", reviewNum=" + reviewNum + ", reportNum="
				+ reportNum + ", thumbnail=" + thumbnail + ", modYn=" + modYn + ", fmodDate=" + fmodDate + ", delYn="
				+ delYn + ", userNo=" + userNo + "]";
	}
	
}