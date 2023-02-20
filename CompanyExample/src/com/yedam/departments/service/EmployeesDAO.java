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
			String sql = "select * from emp where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeKey);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				employ = new Employees();
				employ.setEmployeeId(rs.getInt("employee_id"));
				employ.setEmployeeName(rs.getString("employee_name"));
				employ.setEmployeeJobId(rs.getString("job_id"));
				employ.setEmployeePhoneNumber(rs.getInt("phone_number"));
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return employ;
	}
	
	//사원 삭제
	public int deleteEmp(Employees p) {
		int result = 0;
		
		try {
			conn();
			String sql = "DELETE FROM emp WHERE employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p.getEmployeeId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//수정
	public int modifyEmp(Employees emp) {
		int result = 0;
		
		try {
			conn();
			String sql = "update set job_id = ? where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getEmployeeJobId());
			pstmt.setInt(2, emp.getEmployeeId());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
			
		}
		return result;
	}
	
	//등록
	public int insertEmp(Employees emp) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into emp values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getEmployeeName());
			pstmt.setString(3, emp.getEmployeeJobId());
			pstmt.setInt(4, emp.getEmployeePhoneNumber());
			
			result = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			disconn();
			
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}