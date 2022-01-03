package com.reci.sup.vo;

import java.sql.Timestamp;

public class NotiVo {
	private int rownum;
	private int noticeNo;
	private int adminNo;
	private String noticeContent;
	private String noticeTitle;
	private Timestamp createDate;
	private int hits;
	private String modYn;
	private Timestamp modDate;
	private String deleteYn;
	public NotiVo(int rownum, int noticeNo, int adminNo, String noticeContent, String noticeTitle, Timestamp createDate,
			int hits, String modYn, Timestamp modDate, String deleteYn) {
		super();
		this.rownum = rownum;
		this.noticeNo = noticeNo;
		this.adminNo = adminNo;
		this.noticeContent = noticeContent;
		this.noticeTitle = noticeTitle;
		this.createDate = createDate;
		this.hits = hits;
		this.modYn = modYn;
		this.modDate = modDate;
		this.deleteYn = deleteYn;
	}
	public NotiVo() {
	}
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	public int getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}
	public int getAdminNo() {
		return adminNo;
	}
	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getModYn() {
		return modYn;
	}
	public void setModYn(String modYn) {
		this.modYn = modYn;
	}
	public Timestamp getModDate() {
		return modDate;
	}
	public void setModDate(Timestamp modDate) {
		this.modDate = modDate;
	}
	public String getDeleteYn() {
		return deleteYn;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	@Override
	public String toString() {
		return "NotiVo [rownum=" + rownum + ", noticeNo=" + noticeNo + ", adminNo=" + adminNo + ", noticeContent="
				+ noticeContent + ", noticeTitle=" + noticeTitle + ", createDate=" + createDate + ", hits=" + hits
				+ ", modYn=" + modYn + ", modDate=" + modDate + ", deleteYn=" + deleteYn + "]";
	}
	
	
	
}
