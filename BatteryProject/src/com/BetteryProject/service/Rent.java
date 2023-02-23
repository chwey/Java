package com.BetteryProject.service;

import java.sql.Date;

public class Rent {
//	B_NUM        NOT NULL NUMBER(15)   
//	U_ID         NOT NULL VARCHAR2(15) 
//	R_DATE                DATE         
//	R_POINT               VARCHAR2(30) 
//	RETURN_DATE           DATE         
//	RETURN_POINT          VARCHAR2(30) 
	private int bnum;
	private String uid;
	private Date rdate;
	private String rpoint;
	private Date returndate;
	private String returnpoint;
	
	
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public String getRpoint() {
		return rpoint;
	}
	public void setRpoint(String rpoint) {
		this.rpoint = rpoint;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public String getReturnpoint() {
		return returnpoint;
	}
	public void setReturnpoint(String returnpoint) {
		this.returnpoint = returnpoint;
	}
	
	
	
	
}
