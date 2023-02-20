package com.yedam.departments.service;

import java.util.List;
import java.util.Scanner;

public class EmployeesService {
	
	Scanner sc = new Scanner(System.in);
	
	//모든 사원 조회
	public void getEmployeesList() {
		List<Employees>list = EmployeesDAO.getInstance().getEmployeesList();
		System.out.println("================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println("사원 ID :"+ list.get(i).getEmployeeId());
			System.out.println("사원 이름 :"+ list.get(i).getEmployeeName());
			System.out.println("직종 ID : "+ list.get(i).getEmployeeJobId());
			System.out.println("전화번호 :"+ list.get(i).getEmployeePhoneNumber());
			System.out.println("================================");
		}
	}
	//단건 조회
	public void getEmployees() {
		System.out.println("사원 ID>");
		int empNo = Integer.parseInt(sc.nextLine());
		Employees emp = EmployeesDAO.getInstance().getEmployee(empNo);
		
		if(emp == null) {
			System.out.println("조회된결과없음");
		}else {
			System.out.println("사원 ID :"+ emp.getEmployeeId());
			System.out.println("사원 이름 :"+ emp.getEmployeeName());
			System.out.println("직종 ID :"+ emp.getEmployeeJobId());
			System.out.println("전화번호 :"+ emp.getEmployeePhoneNumber());
			
		}
		System.out.println("================================");
	}
	//사원 등록
	public void insertEmp() {
		System.out.println("====사원등록====");
		System.out.println("사원 ID>");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("사원 이름>");
		String empName = sc.nextLine();
		System.out.println("직종 ID>");
		String jobid = sc.nextLine();
		System.out.println("전화번호>");
		int pn = Integer.parseInt(sc.nextLine());
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		emp.setEmployeeName(empName);
		emp.setEmployeeJobId(jobid);
		emp.setEmployeePhoneNumber(pn);
		
		int result = EmployeesDAO.getInstance().insertEmp(emp);
		
		if(result>0) {
			System.out.println("사원등록완료");
		}else {
			System.out.println("사원등록실패");
		}

	}
	//사원 수정
	public void modifyEmp() {
		System.out.println("사원 수정 Id>");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 직종Id>");
		String jobid = sc.nextLine();
		
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		emp.setEmployeeJobId(jobid);
		
		int result = EmployeesDAO.getInstance().modifyEmp(emp);
		
		if(result>0) {
			System.out.println("수정완료");
		}else {
			System.out.println("수정실패");
		}
		
	}
	//사원 삭제
	public void deleteEmp() {
		System.out.println("삭제 사원 Id");
		int empNo = Integer.parseInt(sc.nextLine());
		
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		
		int result = EmployeesDAO.getInstance().deleteEmp(emp);
		
		if(result>0) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제실패");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
