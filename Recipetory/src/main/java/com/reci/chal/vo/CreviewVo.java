package com.reci.chal.vo;

import java.sql.Timestamp;

public class CreviewVo {
	
	private int reviewNo;
	private int userNo;
	private String reviewName;
	private String reviewContent;
	private String reviewStar;
	private Timestamp cbegDate;
	private String cthumbnail;
	private String cmodYn;
	private Timestamp cfmodDate;
	private String cdelYn;
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getReviewName() {
		return reviewName;
	}
	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public String getReviewStar() {
		return reviewStar;
	}
	public void setReviewStar(String reviewStar) {
		this.reviewStar = reviewStar;
	}
	public Timestamp getCbegDate() {
		return cbegDate;
	}
	public void setCbegDate(Timestamp cbegDate) {
		this.cbegDate = cbegDate;
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
		return "CreviewVo [reviewNo=" + reviewNo + ", userNo=" + userNo + ", reviewName=" + reviewName
				+ ", reviewContent=" + reviewContent + ", reviewStar=" + reviewStar + ", cbegDate=" + cbegDate
				+ ", cthumbnail=" + cthumbnail + ", cmodYn=" + cmodYn + ", cfmodDate=" + cfmodDate + ", cdelYn="
				+ cdelYn + "]";
	}
	
}
