package com.BetteryProject.service;

import java.sql.Date;

public class UserRent {
//	B_NUM   NOT NULL NUMBER(10)   
//	B_RENT           CHAR(1)      
//	U_ID    NOT NULL VARCHAR2(15) 
//	R_DATE           DATE         
//	R_POINT          VARCHAR2(30) 
//	B_DATE           DATE         
//	B_POINT          VARCHAR2(30) 
	private int bNum;
	private boolean bRent;
	private String uId;
	private Date rDate;
	private String rPoiont;
	private Date bDate;
	private String bPoint;
	
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public boolean isbRent() {
		return bRent;
	}
	public void setbRent(boolean bRent) {
		this.bRent = bRent;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public Date getrDate() {
		return rDate;
	}
	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}
	public String getrPoiont() {
		return rPoiont;
	}
	public void setrPoiont(String rPoiont) {
		this.rPoiont = rPoiont;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public String getbPoint() {
		return bPoint;
	}
	public void setbPoint(String bPoint) {
		this.bPoint = bPoint;
	}
	
	
	
}
