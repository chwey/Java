package com.yedam.departments.service;

import java.sql.Date;

public class Employees {
	
	private int employeeId;
	private String lastName;
	private String email;
	//java.sql.date: 연월일
	//java.util.date: 연월일시분초
	//사용하는 방식 다름
	private Date hireDate;
	private String jobId;
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	
	
	
	
	
}
