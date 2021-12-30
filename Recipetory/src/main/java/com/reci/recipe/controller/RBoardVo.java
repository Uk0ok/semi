package com.reci.recipe.controller;

import java.sql.Timestamp;

public class RBoardVo {

	private int rpost_no;
	private int user_no;
	private String rpost_name;
	private String rpost_content;
	private Timestamp rbeg_date;
	private int rhits;
	private int rrcom_num;
	private int rscrap_num;
	private int rcomm_num;
	private int rreview_num;
	private String difficulty;
	private String req_time;
	private String category;
	private String tag;
	private String rthumbnail;
	private String rmod_yn;
	private String rdel_yn;
	private Timestamp rmod_date;

	public int getRpost_no() {
		return rpost_no;
	}

	public void setRpost_no(int rpost_no) {
		this.rpost_no = rpost_no;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getRpost_name() {
		return rpost_name;
	}

	public void setRpost_name(String rpost_name) {
		this.rpost_name = rpost_name;
	}

	public String getRpost_content() {
		return rpost_content;
	}

	public void setRpost_content(String rpost_content) {
		this.rpost_content = rpost_content;
	}

	public Timestamp getRbeg_date() {
		return rbeg_date;
	}

	public void setRbeg_date(Timestamp rbeg_date) {
		this.rbeg_date = rbeg_date;
	}

	public int getRhits() {
		return rhits;
	}

	public void setRhits(int rhits) {
		this.rhits = rhits;
	}

	public int getRrcom_num() {
		return rrcom_num;
	}

	public void setRrcom_num(int rrcom_num) {
		this.rrcom_num = rrcom_num;
	}

	public int getRscrap_num() {
		return rscrap_num;
	}

	public void setRscrap_num(int rscrap_num) {
		this.rscrap_num = rscrap_num;
	}

	public int getRcomm_num() {
		return rcomm_num;
	}

	public void setRcomm_num(int rcomm_num) {
		this.rcomm_num = rcomm_num;
	}

	public int getRreview_num() {
		return rreview_num;
	}

	public void setRreview_num(int rreview_num) {
		this.rreview_num = rreview_num;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getReq_time() {
		return req_time;
	}

	public void setReq_time(String req_time) {
		this.req_time = req_time;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getRthumbnail() {
		return rthumbnail;
	}

	public void setRthumbnail(String rthumbnail) {
		this.rthumbnail = rthumbnail;
	}

	public String getRmod_yn() {
		return rmod_yn;
	}

	public void setRmod_yn(String rmod_yn) {
		this.rmod_yn = rmod_yn;
	}

	public String getRdel_yn() {
		return rdel_yn;
	}

	public void setRdel_yn(String rdel_yn) {
		this.rdel_yn = rdel_yn;
	}

	public Timestamp getRmod_date() {
		return rmod_date;
	}

	public void setRmod_date(Timestamp rmod_date) {
		this.rmod_date = rmod_date;
	}

	@Override
	public String toString() {
		return "RBoardVo [rpost_no=" + rpost_no + ", user_no=" + user_no + ", rpost_name=" + rpost_name
				+ ", rpost_content=" + rpost_content + ", rbeg_date=" + rbeg_date + ", rhits=" + rhits + ", rrcom_num="
				+ rrcom_num + ", rscrap_num=" + rscrap_num + ", rcomm_num=" + rcomm_num + ", rreview_num=" + rreview_num
				+ ", difficulty=" + difficulty + ", req_time=" + req_time + ", category=" + category + ", tag=" + tag
				+ ", rthumbnail=" + rthumbnail + ", rmod_yn=" + rmod_yn + ", rdel_yn=" + rdel_yn + ", rmod_date="
				+ rmod_date + "]";
	}

	
}
