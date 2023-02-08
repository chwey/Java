package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적입력>");
		//입력한 문자열 변수에 저장
		String point = sc.nextLine();
		//문자열을 int형으로 형 변환하는 과정
		int scores = Integer.parseInt(point);
		
		String pass = "";
		//1단계
		//90이상은 A
		//89~80 B
		//79~70 C
		//69~60 D
		
		//2단계
		//100점도 A학점 받을 수 있게 추가
		
		//switch문 부등호 사용 못함
		
		// /(나누기 연산자)
		//99~90 / 10=9
		//89~80 / 10=8
		
		int ten = scores/10;
		switch(ten) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		}
	}
}
