package com.reci.sup.vo;

import java.sql.Timestamp;

public class RepoVo {
	
	private int reportNo;
	private String reportTitle;
	private String reportContent;
	private Timestamp createDate;
	private int hits;
	private String answer;
	private String modYn;
	private String modDate;
	private String statusYn;
	private String deleteYn;
	private int adminNo;
	
	public RepoVo(int reportNo, String reportTitle, String reportContent, Timestamp createDate, int hits, String answer,
			String modYn, String modDate, String statusYn, String deleteYn, int adminNo) {
		super();
		this.reportNo = reportNo;
		this.reportTitle = reportTitle;
		this.reportContent = reportContent;
		this.createDate = createDate;
		this.hits = hits;
		this.answer = answer;
		this.modYn = modYn;
		this.modDate = modDate;
		this.statusYn = statusYn;
		this.deleteYn = deleteYn;
		this.adminNo = adminNo;
	}

	public RepoVo() {
		// TODO Auto-generated constructor stub
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public String getReportContent() {
		return reportContent;
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
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

	public int getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}

	@Override
	public String toString() {
		return "RepoVo [reportNo=" + reportNo + ", reportTitle=" + reportTitle + ", reportContent=" + reportContent
				+ ", createDate=" + createDate + ", hits=" + hits + ", answer=" + answer + ", modYn=" + modYn
				+ ", modDate=" + modDate + ", statusYn=" + statusYn + ", deleteYn=" + deleteYn + ", adminNo=" + adminNo
				+ "]";
	}
	
	
	
	
}
