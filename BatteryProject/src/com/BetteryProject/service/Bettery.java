package com.BetteryProject.service;

public class Bettery {
	
//	B_NUM   NOT NULL NUMBER(15)   
//	B_TYPE  NOT NULL VARCHAR2(20) 
//	B_POWER          VARCHAR2(10) 
//	B_POINT          VARCHAR2(30)
//	B_RENT           CHAR(1)    
	private int bNum;
	private String bType;
	private String bPower;
	private String bPoint;
	private String bRent;
	
	
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getbType() {
		return bType;
	}
	public void setbType(String bType) {
		this.bType = bType;
	}
	public String getbPoint() {
		return bPoint;
	}
	public void setbPoint(String bPoint) {
		this.bPoint = bPoint;
	}
	public String getbPower() {
		return bPower;
	}
	public void setbPower(String bPower) {
		this.bPower = bPower;
	}
	public String getbRent() {
		return bRent;
	}
	public void setbRent(String bRent) {
		this.bRent = bRent;
	}
	
	
}
