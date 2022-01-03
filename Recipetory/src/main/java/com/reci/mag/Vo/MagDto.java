package com.reci.mag.Vo;

import java.sql.Timestamp;

public class MagDto {

	private int POST_NO, ADMIN_NO = 1;
	private String POST_NAME;
	private String POST_CONTENT;
	private int HITS = 0;
	private Timestamp BEG_DATE, FMOD_DATE;
	private int RECOM_NUM, SCRAP_NUM, COMM_NUM;
	private String MOD_YN;
	private String DEL_YN;
	public int getPOST_NO() {
		return POST_NO;
	}
	public void setPOST_NO(int pOST_NO) {
		POST_NO = pOST_NO;
	}
	public int getADMIN_NO() {
		return ADMIN_NO;
	}
	public void setADMIN_NO(int aDMIN_NO) {
		ADMIN_NO = aDMIN_NO;
	}
	public String getPOST_NAME() {
		return POST_NAME;
	}
	public void setPOST_NAME(String pOST_NAME) {
		POST_NAME = pOST_NAME;
	}
	public String getPOST_CONTENT() {
		return POST_CONTENT;
	}
	public void setPOST_CONTENT(String pOST_CONTENT) {
		POST_CONTENT = pOST_CONTENT;
	}
	public int getHITS() {
		return HITS;
	}
	public void setHITS(int hITS) {
		HITS = hITS;
	}
	public Timestamp getBEG_DATE() {
		return BEG_DATE;
	}
	public void setBEG_DATE(Timestamp bEG_DATE) {
		BEG_DATE = bEG_DATE;
	}
	public Timestamp getFMOD_DATE() {
		return FMOD_DATE;
	}
	public void setFMOD_DATE(Timestamp fMOD_DATE) {
		FMOD_DATE = fMOD_DATE;
	}
	public int getRECOM_NUM() {
		return RECOM_NUM;
	}
	public void setRECOM_NUM(int rECOM_NUM) {
		RECOM_NUM = rECOM_NUM;
	}
	public int getSCRAP_NUM() {
		return SCRAP_NUM;
	}
	public void setSCRAP_NUM(int sCRAP_NUM) {
		SCRAP_NUM = sCRAP_NUM;
	}
	public int getCOMM_NUM() {
		return COMM_NUM;
	}
	public void setCOMM_NUM(int cOMM_NUM) {
		COMM_NUM = cOMM_NUM;
	}
	public String getMOD_YN() {
		return MOD_YN;
	}
	public void setMOD_YN(String mOD_YN) {
		MOD_YN = mOD_YN;
	}
	public String getDEL_YN() {
		return DEL_YN;
	}
	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MagDto [POST_NO=").append(POST_NO).append(", ADMIN_NO=").append(ADMIN_NO).append(", POST_NAME=")
				.append(POST_NAME).append(", POST_CONTENT=").append(POST_CONTENT).append(", HITS=").append(HITS)
				.append(", BEG_DATE=").append(BEG_DATE).append(", FMOD_DATE=").append(FMOD_DATE).append(", RECOM_NUM=")
				.append(RECOM_NUM).append(", SCRAP_NUM=").append(SCRAP_NUM).append(", COMM_NUM=").append(COMM_NUM)
				.append(", MOD_YN=").append(MOD_YN).append(", DEL_YN=").append(DEL_YN).append("]");
		return builder.toString();
	}
	
}
