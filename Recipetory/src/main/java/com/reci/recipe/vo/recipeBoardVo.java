package com.reci.recipe.vo;

import java.sql.Timestamp;

public class recipeBoardVo {

	private int rpostNo;
	private int userNo;
	private String rpostName;
	private String rpostContent;
	private Timestamp rbegDate;
	private int rhits;
	private int rrcomNum;
	private int rscrapNum;
	private int rcommNum;
	private int rreviewNum;
	private String difficulty;
	private String reqTime;
	private String category;
	private String tag;
	private String rthumbnail;
	private String rmodYn;
	private String rdelYn;
	private Timestamp rmodDate;
	
	public int getRpostNo() {
		return rpostNo;
	}
	public void setRpostNo(int rpostNo) {
		this.rpostNo = rpostNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getRpostName() {
		return rpostName;
	}
	public void setRpostName(String rpostName) {
		this.rpostName = rpostName;
	}
	public String getRpostContent() {
		return rpostContent;
	}
	public void setRpostContent(String rpostContent) {
		this.rpostContent = rpostContent;
	}
	public Timestamp getRbegDate() {
		return rbegDate;
	}
	public void setRbegDate(Timestamp rbegDate) {
		System.out.println("setter ::: " + rbegDate);//swy
		this.rbegDate = rbegDate;
	}
	public int getRhits() {
		return rhits;
	}
	public void setRhits(int rhits) {
		this.rhits = rhits;
	}
	public int getRrcomNum() {
		return rrcomNum;
	}
	public void setRrcomNum(int rrcomNum) {
		this.rrcomNum = rrcomNum;
	}
	public int getRscrapNum() {
		return rscrapNum;
	}
	public void setRscrapNum(int rscrapNum) {
		this.rscrapNum = rscrapNum;
	}
	public int getRcommNum() {
		return rcommNum;
	}
	public void setRcommNum(int rcommNum) {
		this.rcommNum = rcommNum;
	}
	public int getRreviewNum() {
		return rreviewNum;
	}
	public void setRreviewNum(int rreviewNum) {
		this.rreviewNum = rreviewNum;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getReqTime() {
		return reqTime;
	}
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getRthumbnail() {
		return rthumbnail;
	}
	public void setRthumbnail(String rthumbnail) {
		this.rthumbnail = rthumbnail;
	}
	public String getRmodYn() {
		return rmodYn;
	}
	public void setRmodYn(String rmodYn) {
		this.rmodYn = rmodYn;
	}
	public String getRdelYn() {
		return rdelYn;
	}
	public void setRdelYn(String rdelYn) {
		this.rdelYn = rdelYn;
	}
	public Timestamp getRmodDate() {
		return rmodDate;
	}
	public void setRmodDate(Timestamp rmodDate) {
		this.rmodDate = rmodDate;
	}
	
	@Override
	public String toString() {
		return "RBoardVo [rpostNo=" + rpostNo + ", userNo=" + userNo + ", rpostName=" + rpostName + ", rpostContent="
				+ rpostContent + ", rbegDate=" + rbegDate + ", rhits=" + rhits + ", rrcomNum=" + rrcomNum
				+ ", rscrapNum=" + rscrapNum + ", rcommNum=" + rcommNum + ", rreviewNum=" + rreviewNum + ", difficulty="
				+ difficulty + ", reqTime=" + reqTime + ", category=" + category + ", tag=" + tag + ", rthumbnail="
				+ rthumbnail + ", rmodYn=" + rmodYn + ", rdelYn=" + rdelYn + ", rmodDate=" + rmodDate
				+ ", getRpostNo()=" + getRpostNo() + ", getUserNo()=" + getUserNo() + ", getRpostName()="
				+ getRpostName() + ", getRpostContent()=" + getRpostContent() + ", getRbegDate()=" + getRbegDate()
				+ ", getRhits()=" + getRhits() + ", getRrcomNum()=" + getRrcomNum() + ", getRscrapNum()="
				+ getRscrapNum() + ", getRcommNum()=" + getRcommNum() + ", getRreviewNum()=" + getRreviewNum()
				+ ", getDifficulty()=" + getDifficulty() + ", getReqTime()=" + getReqTime() + ", getCategory()="
				+ getCategory() + ", getTag()=" + getTag() + ", getRthumbnail()=" + getRthumbnail() + ", getRmodYn()="
				+ getRmodYn() + ", getRdelYn()=" + getRdelYn() + ", getRmodDate()=" + getRmodDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
