package com.reci.admin;

public class FileVo {
	
	private int fileNo;
	private int postNo;
	private int userNo;
	private int adminNo;
	private String fileName;
	private String mFileName;
	
	public FileVo(int fileNo, int postNo, int userNo, int adminNo, String fileName, String mFileName) {
		super();
		this.fileNo = fileNo;
		this.postNo = postNo;
		this.userNo = userNo;
		this.adminNo = adminNo;
		this.fileName = fileName;
		this.mFileName = mFileName;
	}

	public FileVo() {
	}

	public int getFileNo() {
		return fileNo;
	}

	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getmFileName() {
		return mFileName;
	}

	public void setmFileName(String mFileName) {
		this.mFileName = mFileName;
	}

	@Override
	public String toString() {
		return "FileVo [fileNo=" + fileNo + ", postNo=" + postNo + ", userNo=" + userNo + ", adminNo=" + adminNo
				+ ", fileName=" + fileName + ", mFileName=" + mFileName + "]";
	}

}
