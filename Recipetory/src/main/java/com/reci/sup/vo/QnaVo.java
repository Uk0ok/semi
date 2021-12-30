package com.reci.sup.vo;

import java.sql.Timestamp;

public class QnaVo {
	
	private int qnaNo;
	private String qnaTitle;
	private String qnaContent;
	private int userNo;
	private int adminNo;
	private Timestamp create_Date;
	private int hits;
	private String answer;
	private String modYn;
	private String modDate;
	private String statusYn;
	private String deleteYn;
	
	public QnaVo(int qnaNo, String qnaTitle, String qnaContent, int userNo, int adminNo, Timestamp create_Date,
			int hits, String answer, String modYn, String modDate, String statusYn, String deleteYn) {
		super();
		this.qnaNo = qnaNo;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.userNo = userNo;
		this.adminNo = adminNo;
		this.create_Date = create_Date;
		this.hits = hits;
		this.answer = answer;
		this.modYn = modYn;
		this.modDate = modDate;
		this.statusYn = statusYn;
		this.deleteYn = deleteYn;
	}

	public int getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}

	public Timestamp getCreate_Date() {
		return create_Date;
	}

	public void setCreate_Date(Timestamp create_Date) {
		this.create_Date = create_Date;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
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

	public String getStatusYn() {
		return statusYn;
	}

	public void setStatusYn(String statusYn) {
		this.statusYn = statusYn;
	}

	public String getDeleteYn() {
		return deleteYn;
	}

	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	
}
