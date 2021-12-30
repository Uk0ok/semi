package com.reci.sup.vo;

public class NotiVo {
	private String noticeNo;
	private String adminNo;
	private String noticeContent;
	private String noticeTitle;
	private String createDate;
	private String hits;
	private String modYn;
	private String modDate;
	private String deleteYn;
	
	public NotiVo(String noticeNo, String adminNo, String noticeContent, String noticeTitle, String createDate,
			String hits, String modYn, String modDate, String deleteYn) {
		super();
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

	public String getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(String noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(String adminNo) {
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

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getHits() {
		return hits;
	}

	public void setHits(String hits) {
		this.hits = hits;
	}

	public String getModYn() {
		return modYn;
	}

	public void setModYn(String modYn) {
		this.modYn = modYn;
	}

	public String getModDate() {
		return modDate;
	}

	public void setModDate(String modDate) {
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
		return "NotiVo [noticeNo=" + noticeNo + ", adminNo=" + adminNo + ", noticeContent=" + noticeContent
				+ ", noticeTitle=" + noticeTitle + ", createDate=" + createDate + ", hits=" + hits + ", modYn=" + modYn
				+ ", modDate=" + modDate + ", deleteYn=" + deleteYn + "]";
	}
	
	
	
}