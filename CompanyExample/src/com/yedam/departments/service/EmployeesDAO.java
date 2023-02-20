package com.yedam.departments.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmployeesDAO extends DAO{
	
	private static EmployeesDAO employDao = null;
	
	private EmployeesDAO() {
		
	}
	
	public static EmployeesDAO getInstance() {
		if(employDao == null) {
			employDao = new EmployeesDAO();
					
		}
		return employDao;
	}
	//모든 사원 조회, 한 사원 조회, 사원 삭제, 수정, 등록
	
	//모든 사원 조회
	public List<Employees> getEmployeesList(){
		List<Employees>list = new ArrayList<>();
		Employees employ = null;
		try {
			conn();
			String sql = "select * from emp";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				employ = new Employees();
				employ.setEmployeeId(rs.getInt("employee_id"));
				employ.setEmployeeName(rs.getString("employee_name"));
				employ.setEmployeeJobId(rs.getString("job_id"));
				employ.setEmployeePhoneNumber(rs.getInt("phone_number"));
				
				list.add(employ);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}
	
	//단건 조회
	public Employees getEmployee(int employeeKey) {
		Employees employ = null;
		
		try {
			conn();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return employ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}