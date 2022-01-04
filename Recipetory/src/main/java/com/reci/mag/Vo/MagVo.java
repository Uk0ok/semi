package com.reci.mag.Vo;

import java.sql.Timestamp;

public class MagVo {

	private int postNo;
	private String postName;
	private String postContent;
	private int hits;
	private Timestamp begDate;
	private Timestamp fmodDate;
	private int recomNum;
	private int scrapNum;
	private int commNum;
	private String modYn;
	private String delYn;
	private int adminNo;
	
	
	
	public MagVo(int postNo, int adminNo, String postName, String postContent, int hits, Timestamp begDate,
			Timestamp fmodDate, int recomNum, int scrapNum, int commNum, String modYn, String delYn) {
		this.postNo = postNo;
		this.postName = postName;
		this.postContent = postContent;
		this.hits = hits;
		this.begDate = begDate;
		this.fmodDate = fmodDate;
		this.recomNum = recomNum;
		this.scrapNum = scrapNum;
		this.commNum = commNum;
		this.modYn = modYn;
		this.delYn = delYn;
		this.adminNo = adminNo;
	}
	public MagVo() {
		// TODO Auto-generated constructor stub
	}
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	public int getAdminNo() {
		return adminNo;
	}
	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
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
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Timestamp getBegDate() {
		return begDate;
	}
	public void setBegDate(Timestamp begDate) {
		this.begDate = begDate;
	}
	public Timestamp getFmodDate() {
		return fmodDate;
	}
	public void setFmodDate(Timestamp fmodDate) {
		this.fmodDate = fmodDate;
	}
	public int getRecomNum() {
		return recomNum;
	}
	public void setRecomNum(int recomNum) {
		this.recomNum = recomNum;
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
	public String getModYn() {
		return modYn;
	}
	public void setModYn(String modYn) {
		this.modYn = modYn;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "MagVo [postNo=" + postNo + ", adminNo=" + adminNo + ", postName=" + postName + ", postContent="
				+ postContent + ", hits=" + hits + ", begDate=" + begDate + ", fmodDate=" + fmodDate + ", recomNum="
				+ recomNum + ", scrapNum=" + scrapNum + ", commNum=" + commNum + ", modYn=" + modYn + ", delYn=" + delYn
				+ "]";
	}
	public Object selectById(String postNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
}
