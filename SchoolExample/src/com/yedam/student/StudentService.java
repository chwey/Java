package com.yedam.student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	
	//전체 학생 정보 조회
	public void getStudentList() {
		List<Student>list = StudentDAO.getInstance().getStudentList();
		System.out.println("========전체정보========");
		for(int i=0; i<list.size(); i++) {
			System.out.println("학번 : " + list.get(i).getStdId());
			System.out.println("학생 이름 : "+list.get(i).getStdName());
			System.out.println("전공 : "+ list.get(i).getStdMajor());
			System.out.println("성적 : "+ list.get(i).getStdPoint());
		}
		System.out.println("=================================");
	}
	
	//학번 조회
	public void getStudent() {
		System.out.println("학번>");
		int stdNo = Integer.parseInt(sc.nextLine());
		Student std = StudentDAO.getInstance().getStudent(stdNo);
		
		if(std == null) {
			System.out.println("조회결과없음");
		}else {
			System.out.println("학번 :"+std.getStdId());
			System.out.println("학생이름 :"+std.getStdName());
			System.out.println("전공 :"+ std.getStdMajor());
			System.out.println("성적 :"+ std.getStdPoint());
		}
		System.out.println("=====================");
	}
	
	//학생 등록
	public void insertStd() {
		Student std = new Student();
		System.out.println("=======학생등록=========");
		System.out.println("학번입력>");
		std.setStdId(Integer.parseInt(sc.nextLine()));
		System.out.println("학생이름>");
		std.setStdName(sc.nextLine());
		System.out.println("전공>");
		std.setStdMajor(sc.nextLine());
		System.out.println("성적>");
		std.setStdPoint(sc.nextDouble());
		
		int result = StudentDAO.getInstance().insertStd(std);
		
		if(result>0) {
			System.out.println("등록완료");
		}else {
			System.out.println("등록실패");
		}
		
		
	}
	
	//학생 제적
	public void deleteStd() {
		System.out.println("삭제할 학번>");
		int stdNo = Integer.parseInt(sc.nextLine());
				
		int result = StudentDAO.getInstance().deleteStd(stdNo);
		
		if(result>0) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제실패");
		}
			
		
	}
	
	//학생 전공 변경
	public void updateStd() {
		System.out.println("수정학번>");
		int stdNo = Integer.parseInt(sc.nextLine());
		System.out.println("수정 전공>");
		String stdmajor = sc.nextLine();
		
		Student std = new Student();
		std.setStdId(stdNo);
		std.setStdMajor(stdmajor);
		
		int result = StudentDAO.getInstance().updateStd(std);
		
		if(result>0) {
			System.out.println("수정완료");
		}else {
			System.out.println("수정실패");
		}

	}
	
	//전공별 성적 합계, 성적 평균
	public void getAnalyze() {
		List<Student> list = StudentDAO.getInstance().getAnalyze();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("전공 : "+ list.get(i).getStdMajor());
			System.out.println("합계 : "+ list.get(i).getStdSum());
			System.out.println("평균 : "+ list.get(i).getStdAvg());
		}
	}
}
