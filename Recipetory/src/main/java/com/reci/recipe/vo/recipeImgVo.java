package com.reci.recipe.vo;

public class recipeImgVo {
	private int fileNo;
	private int postNo;
	private int userNo;
	private String fileName;
	private String mfileName;

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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMfileName() {
		return mfileName;
	}

	public void setMfileName(String mfileName) {
		this.mfileName = mfileName;
	}

	@Override
	public String toString() {
		return "recipeImgVo [fileNo=" + fileNo + ", postNo=" + postNo + ", userNo=" + userNo + ", fileName=" + fileName
				+ ", mfileName=" + mfileName + ", getFileNo()=" + getFileNo() + ", getPostNo()=" + getPostNo()
				+ ", getUserNo()=" + getUserNo() + ", getFileName()=" + getFileName() + ", getMfileName()="
				+ getMfileName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public void setRecipeImgName(String string) {
		
	}

}
