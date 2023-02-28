package com.BetteryProject.service;



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
	private String rDate;
	private String rPoiont;
	private String bDate;
	private String bPoint;
	private String over;
	
	
	
	public String getOver() {
		return over;
	}
	public void setOver(String over) {
		this.over = over;
	}
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
	public String getrDate() {
		return rDate;
	}
	public void setrDate(String rDate) {
		this.rDate = rDate;
	}
	public String getrPoiont() {
		return rPoiont;
	}
	public void setrPoiont(String rPoiont) {
		this.rPoiont = rPoiont;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	public String getbPoint() {
		return bPoint;
	}
	public void setbPoint(String bPoint) {
		this.bPoint = bPoint;
	}
	
	
	
	
}
