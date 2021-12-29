package com.reci.mag.controller;

public class MagVo {

	private String POST_NO;
	private String POST_NAME;
	private String POST_CONTENT;
	private String BEG_DATE;
	private String HITS;
	private String RECOM_NUM;
	private String SCRAP_NUM;
	private String COMM_NUM;
	private String REPORT_NUM;
	private String MOD_YN;
	private String FMOD_DATE;
	private String DEL_YN;
	private String USER_NO;
	
	//GET SET 만들기.
	public String getPOST_NO() {
		return POST_NO;
	}
	public void setPOST_NO(String pOST_NO) {
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
	public String getBEG_DATE() {
		return BEG_DATE;
	}
	public void setBEG_DATE(String bEG_DATE) {
		BEG_DATE = bEG_DATE;
	}
	public String getHITS() {
		return HITS;
	}
	public void setHITS(String hITS) {
		HITS = hITS;
	}
	public String getRECOM_NUM() {
		return RECOM_NUM;
	}
	public void setRECOM_NUM(String rECOM_NUM) {
		RECOM_NUM = rECOM_NUM;
	}
	public String getSCRAP_NUM() {
		return SCRAP_NUM;
	}
	public void setSCRAP_NUM(String sCRAP_NUM) {
		SCRAP_NUM = sCRAP_NUM;
	}
	public String getCOMM_NUM() {
		return COMM_NUM;
	}
	public void setCOMM_NUM(String cOMM_NUM) {
		COMM_NUM = cOMM_NUM;
	}
	public String getREPORT_NUM() {
		return REPORT_NUM;
	}
	public void setREPORT_NUM(String rEPORT_NUM) {
		REPORT_NUM = rEPORT_NUM;
	}
	public String getMOD_YN() {
		return MOD_YN;
	}
	public void setMOD_YN(String mOD_YN) {
		MOD_YN = mOD_YN;
	}
	public String getFMOD_DATE() {
		return FMOD_DATE;
	}
	public void setFMOD_DATE(String fMOD_DATE) {
		FMOD_DATE = fMOD_DATE;
	}
	public String getDEL_YN() {
		return DEL_YN;
	}
	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
	public String getUSER_NO() {
		return USER_NO;
	}
	public void setUSER_NO(String uSER_NO) {
		USER_NO = uSER_NO;
	}
	
	@Override
	public String toString() {
		return "MagVo [POST_NO=" + POST_NO + ", POST_NAME=" + POST_NAME + ", POST_CONTENT=" + POST_CONTENT
				+ ", BEG_DATE=" + BEG_DATE + ", HITS=" + HITS + ", RECOM_NUM=" + RECOM_NUM + ", SCRAP_NUM=" + SCRAP_NUM
				+ ", COMM_NUM=" + COMM_NUM + ", REPORT_NUM=" + REPORT_NUM + ", MOD_YN=" + MOD_YN + ", FMOD_DATE="
				+ FMOD_DATE + ", DEL_YN=" + DEL_YN + ", USER_NO=" + USER_NO + "]";
	}
	
	
	
}
