package com.yedam.inheri;

public class Calculator {
	double areaCircle(double r) {
		//부모클래스에서 원 넓이를 구하는 메소드
		System.out.println("Calculator 객체 메소드 실행");
		return 3.14*r*r;
	}
}
