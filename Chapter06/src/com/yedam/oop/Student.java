package com.yedam.oop;

public class Student {

	//정보 - 학생이름, 학번, 국어, 영어, 수학 점수
	//기본 생성자, 모든 데이터를 초기화 생성자
	//학생의 정보를 출력해주는 getInfo()
	//sum()
	/*
	 * 이름: 김또치
	 * 학번: 20230201
	 * 총점: 200
	 * 평균: 68.xx
	 */
	
	String name;
	int studentnum;
	int ko;
	int en;
	int math;
	
	public Student() {
		
	}
	
	public Student(String name, int studentnum, int ko, int en, int math ) {
		this.name = name;
		this.studentnum = studentnum;
		this.ko = ko;
		this.en = en;
		this.math = math;
	}
	
	int sum() {
		return ko + en + math;
	}
	
	
	void getInfo() {
		System.out.println("이름 :" + name);
		System.out.println("학번 :" + studentnum);
		System.out.println("총점 :" + sum());
		System.out.println("평균 :" + (double)sum()/3);
		
	}
	
	

	
	
}
