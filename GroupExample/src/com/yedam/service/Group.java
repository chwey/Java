package com.yedam.service;

import java.sql.Date;

public class Group {
	
//	GRP_ID    NOT NULL NUMBER       
//	GRP_NAME  NOT NULL VARCHAR2(15) 
//	GRP_DATE           DATE         
//	GRP_EMAIL NOT NULL VARCHAR2(30) 
//	GRP_AGE   NOT NULL NUMBER(3)
	
	private String grpId;
	private String grpName;
	private Date grpDate;
	private String grpemail;
	private int grpage;
	
	
	public String getGrpId() {
		return grpId;
	}
	public void setGrpId(String grpId) {
		this.grpId = grpId;
	}
	public String getGrpName() {
		return grpName;
	}
	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}
	public Date getGrpDate() {
		return grpDate;
	}
	public void setGrpDate(Date grpDate) {
		this.grpDate = grpDate;
	}
	public String getGrpemail() {
		return grpemail;
	}
	public void setGrpemail(String grpemail) {
		this.grpemail = grpemail;
	}
	public int getGrpage() {
		return grpage;
	}
	public void setGrpage(int grpage) {
		this.grpage = grpage;
	}
	
	
	
}
