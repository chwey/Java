package com.BetteryProject.service;

public class User {

//	U_ID          NOT NULL VARCHAR2(15) 
//	U_PW          NOT NULL VARCHAR2(20) 
//	U_NAME        NOT NULL VARCHAR2(15) 
//	U_PHONENUMBER          NUMBER(13)   
//	U_POINT                VARCHAR2(30) 
//	U_MAIL                 VARCHAR2(30) 
//	U_GRADE                CHAR(1) 
	
	private String uId;
	private String uPw;
	private String uName;
	private String uPhoneNumber;
	private String uPoint;
	private String uMail;
	private String uGrade;
	
	
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuPw() {
		return uPw;
	}
	public void setuPw(String uPw) {
		this.uPw = uPw;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPhoneNumber() {
		return uPhoneNumber;
	}
	public void setuPhoneNumber(String uPhoneNumber) {
		this.uPhoneNumber = uPhoneNumber;
	}
	public String getuPoint() {
		return uPoint;
	}
	public void setuPoint(String uPoint) {
		this.uPoint = uPoint;
	}
	public String getuMail() {
		return uMail;
	}
	public void setuMail(String uMail) {
		this.uMail = uMail;
	}
	public String getuGrade() {
		return uGrade;
	}
	public void setuGrade(String uGrade) {
		this.uGrade = uGrade;
	}
	
	
	
}
