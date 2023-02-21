package com.yedam.departments.service;

import java.sql.Date;
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
			System.out.println("사원 이름 :"+ list.get(i).getLastName());
			System.out.println("이메일 : "+ list.get(i).getEmail());
			System.out.println("입사년도 :"+ list.get(i).getHireDate());
			System.out.println("직종 ID :"+ list.get(i).getJobId());
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
			System.out.println("사원 이름 :"+ emp.getLastName());
			System.out.println("이메일 :"+ emp.getEmail());
			System.out.println("입사년도 :"+ emp.getHireDate());
			System.out.println("직종 ID :"+ emp.getJobId());
			
		}
		System.out.println("================================");
	}
	//사원 등록
	public void insertEmp() {
		Employees emp = new Employees();
		System.out.println("====사원등록====");
		System.out.println("사원 ID>");
		emp.setEmployeeId(Integer.parseInt(sc.nextLine()));	
		System.out.println("사원 이름>");
		emp.setLastName(sc.nextLine());
		System.out.println("이메일>");
		emp.setEmail(sc.nextLine());
//		System.out.println("입사년도>");
//		emp.setHireDate(Date.valueOf(sc.nextLine()));
		System.out.println("직종 ID>");
		emp.setJobId(sc.nextLine());
		
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
		emp.setJobId(jobid);
		
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
