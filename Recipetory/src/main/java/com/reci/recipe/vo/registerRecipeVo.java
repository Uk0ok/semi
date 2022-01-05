package com.reci.recipe.vo;

import java.sql.Timestamp;

public class registerRecipeVo {
	private int rpostNo;
	private int userNo;
	private String rpostName;
	private Timestamp rbegDate;
	private String ingredient1;
	private String ingredient2;
	private String ingredient3;
	private String ingredient4;
	private String ingredient5;
	private String rpostContent1;
	private String rpostContent2;
	private String rpostContent3;
	private String rpostContent4;
	private String rpostContent5;
	private String rthumbnail;
	private String rmodYn;
	private String rdelYn;
	private Timestamp rmodDate;

	public int getRpostNo() {
		return rpostNo;
	}

	public void setRpostNo(int rpostNo) {
		this.rpostNo = rpostNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getRpostName() {
		return rpostName;
	}

	public void setRpostName(String rpostName) {
		this.rpostName = rpostName;
	}

	public Timestamp getRbegDate() {
		return rbegDate;
	}

	public void setRbegDate(Timestamp rbegDate) {
		this.rbegDate = rbegDate;
	}

	public String getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
	}

	public String getIngredient2() {
		return ingredient2;
	}

	public void setIngredient2(String ingredient2) {
		this.ingredient2 = ingredient2;
	}

	public String getIngredient3() {
		return ingredient3;
	}

	public void setIngredient3(String ingredient3) {
		this.ingredient3 = ingredient3;
	}

	public String getIngredient4() {
		return ingredient4;
	}

	public void setIngredient4(String ingredient4) {
		this.ingredient4 = ingredient4;
	}

	public String getIngredient5() {
		return ingredient5;
	}

	public void setIngredient5(String ingredient5) {
		this.ingredient5 = ingredient5;
	}

	public String getRpostContent1() {
		return rpostContent1;
	}

	public void setRpostContent1(String rpostContent1) {
		this.rpostContent1 = rpostContent1;
	}

	public String getRpostContent2() {
		return rpostContent2;
	}

	public void setRpostContent2(String rpostContent2) {
		this.rpostContent2 = rpostContent2;
	}

	public String getRpostContent3() {
		return rpostContent3;
	}

	public void setRpostContent3(String rpostContent3) {
		this.rpostContent3 = rpostContent3;
	}

	public String getRpostContent4() {
		return rpostContent4;
	}

	public void setRpostContent4(String rpostContent4) {
		this.rpostContent4 = rpostContent4;
	}

	public String getRpostContent5() {
		return rpostContent5;
	}

	public void setRpostContent5(String rpostContent5) {
		this.rpostContent5 = rpostContent5;
	}

	public String getRthumbnail() {
		return rthumbnail;
	}

	public void setRthumbnail(String rthumbnail) {
		this.rthumbnail = rthumbnail;
	}

	public String getRmodYn() {
		return rmodYn;
	}

	public void setRmodYn(String rmodYn) {
		this.rmodYn = rmodYn;
	}

	public String getRdelYn() {
		return rdelYn;
	}

	public void setRdelYn(String rdelYn) {
		this.rdelYn = rdelYn;
	}

	public Timestamp getRmodDate() {
		return rmodDate;
	}

	public void setRmodDate(Timestamp rmodDate) {
		this.rmodDate = rmodDate;
	}

	@Override
	public String toString() {
		return "registerRecipeVo [rpostNo=" + rpostNo + ", userNo=" + userNo + ", rpostName=" + rpostName
				+ ", rbegDate=" + rbegDate + ", ingredient1=" + ingredient1 + ", ingredient2=" + ingredient2
				+ ", ingredient3=" + ingredient3 + ", ingredient4=" + ingredient4 + ", ingredient5=" + ingredient5
				+ ", rpostContent1=" + rpostContent1 + ", rpostContent2=" + rpostContent2 + ", rpostContent3="
				+ rpostContent3 + ", rpostContent4=" + rpostContent4 + ", rpostContent5=" + rpostContent5
				+ ", rthumbnail=" + rthumbnail + ", rmodYn=" + rmodYn + ", rdelYn=" + rdelYn + ", rmodDate=" + rmodDate
				+ "]";
	}

}
