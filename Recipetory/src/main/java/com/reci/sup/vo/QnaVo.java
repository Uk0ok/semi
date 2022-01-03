package com.reci.sup.vo;

import java.sql.Timestamp;

public class QnaVo {
	

	private int qnaNo;
	private String qnaTitle;
	private String qnaContent;
	private int userNo;
	private int adminNo;
	private Timestamp createDate;
	private int hits;
	private String answer;
	private String modYn;
	private Timestamp modDate;
	private String statusYn;
	private String deleteYn;
	
	public QnaVo(int qnaNo, String qnaTitle, String qnaContent, int userNo, int adminNo, Timestamp createDate,
			int hits, String answer, String modYn, Timestamp modDate, String statusYn, String deleteYn) {
		this.qnaNo = qnaNo;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.userNo = userNo;
		this.adminNo = adminNo;
		this.createDate = createDate;
		this.hits = hits;
		this.answer = answer;
		this.modYn = modYn;
		this.modDate = modDate;
		this.statusYn = statusYn;
		this.deleteYn = deleteYn;
	}
	public QnaVo() {
		// TODO Auto-generated constructor stub
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
	public Timestamp getModDate() {
		return modDate;
	}
	public void setModDate(Timestamp modDate) {
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
	
	@Override
	public String toString() {
		return "QnaVo [qnaNo=" + qnaNo + ", qnaTitle=" + qnaTitle + ", qnaContent=" + qnaContent + ", userNo=" + userNo
				+ ", adminNo=" + adminNo + ", createDate=" + createDate + ", hits=" + hits + ", answer=" + answer
				+ ", modYn=" + modYn + ", modDate=" + modDate + ", statusYn=" + statusYn + ", deleteYn=" + deleteYn
				+ "]";
	}
	
	
	
}