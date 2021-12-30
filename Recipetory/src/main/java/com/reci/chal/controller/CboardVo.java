package com.reci.chal.controller;

import java.sql.Timestamp;

public class CboardVo {
	
	private int POST_NO;
	private String POST_NAME;
	private String POST_CONTENT;
	private Timestamp BEG_DATE;
	private Timestamp CHALLENGE_PERIOD;
	private int PARTI_NUM;
	private int HITS;
	private int SCRAP_NUM;
	private int COMM_NUM;
	private int REVIEW_NUM;
	private int REPORT_NUM;
	private String THUMBNAIL;
	private String MOD_YN;
	private Timestamp FMOD_DATE;
	private String DEL_YN;
	private int USER_NO;
	public int getPOST_NO() {
		return POST_NO;
	}
	public void setPOST_NO(int pOST_NO) {
		POST_NO = pOST_NO;
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
	public Timestamp getBEG_DATE() {
		return BEG_DATE;
	}
	public void setBEG_DATE(Timestamp bEG_DATE) {
		BEG_DATE = bEG_DATE;
	}
	public Timestamp getCHALLENGE_PERIOD() {
		return CHALLENGE_PERIOD;
	}
	public void setCHALLENGE_PERIOD(Timestamp cHALLENGE_PERIOD) {
		CHALLENGE_PERIOD = cHALLENGE_PERIOD;
	}
	public int getPARTI_NUM() {
		return PARTI_NUM;
	}
	public void setPARTI_NUM(int pARTI_NUM) {
		PARTI_NUM = pARTI_NUM;
	}
	public int getHITS() {
		return HITS;
	}
	public void setHITS(int hITS) {
		HITS = hITS;
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
	public int getREVIEW_NUM() {
		return REVIEW_NUM;
	}
	public void setREVIEW_NUM(int rEVIEW_NUM) {
		REVIEW_NUM = rEVIEW_NUM;
	}
	public int getREPORT_NUM() {
		return REPORT_NUM;
	}
	public void setREPORT_NUM(int rEPORT_NUM) {
		REPORT_NUM = rEPORT_NUM;
	}
	public String getTHUMBNAIL() {
		return THUMBNAIL;
	}
	public void setTHUMBNAIL(String tHUMBNAIL) {
		THUMBNAIL = tHUMBNAIL;
	}
	public String getMOD_YN() {
		return MOD_YN;
	}
	public void setMOD_YN(String mOD_YN) {
		MOD_YN = mOD_YN;
	}
	public Timestamp getFMOD_DATE() {
		return FMOD_DATE;
	}
	public void setFMOD_DATE(Timestamp fMOD_DATE) {
		FMOD_DATE = fMOD_DATE;
	}
	public String getDEL_YN() {
		return DEL_YN;
	}
	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
	public int getUSER_NO() {
		return USER_NO;
	}
	public void setUSER_NO(int uSER_NO) {
		USER_NO = uSER_NO;
	}
	@Override
	public String toString() {
		return "CboardVo [POST_NO=" + POST_NO + ", POST_NAME=" + POST_NAME + ", POST_CONTENT=" + POST_CONTENT
				+ ", BEG_DATE=" + BEG_DATE + ", CHALLENGE_PERIOD=" + CHALLENGE_PERIOD + ", PARTI_NUM=" + PARTI_NUM
				+ ", HITS=" + HITS + ", SCRAP_NUM=" + SCRAP_NUM + ", COMM_NUM=" + COMM_NUM + ", REVIEW_NUM="
				+ REVIEW_NUM + ", REPORT_NUM=" + REPORT_NUM + ", THUMBNAIL=" + THUMBNAIL + ", MOD_YN=" + MOD_YN
				+ ", FMOD_DATE=" + FMOD_DATE + ", DEL_YN=" + DEL_YN + ", USER_NO=" + USER_NO + "]";
	}
	
}	