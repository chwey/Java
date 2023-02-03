package com.yedam.oop;

import java.util.Scanner;

public class Application04 {
	
	public static void main(String[] args) {
		
		//int[]scre : int형 데이터를 담을 수 있는 배열
		//class[] clazz : 객체를 담을 수 있는 배열
		
		//정보 입력받는 용도
		Scanner sc = new Scanner (System.in);
		
		//학생 수 입력 받는 변수
		int stdCount = 0;
		
		//학생의 정보를 보관하는 배열 생성
		Student[] stdAry = null;
		
		
		while(true) {
			System.out.println("1. 학생수 | 2. 학생정보입력 | 3. 총점, 평균 | 4. 종료");
			System.out.println("입력>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				
				System.out.println("학생 수 입력>");
				stdCount = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo == 2) {
				//배열의 크기(학생의 데이터를 넣을 수 있는 크기 설정)
				stdAry = new Student[stdCount];
				for(int i = 0; i<stdAry.length; i++) {
					//각 방(각 배열)에 있는 객체를 초기화 해줌		
					stdAry[i] = new Student();
//					Student std = new Student();
					
					System.out.println("이름>");
					String name = sc.nextLine();
					stdAry[i].name = name;
					
					System.out.println("학번>");
					int studentnum = Integer.parseInt(sc.nextLine());
					stdAry[i].studentnum = studentnum;
					
					System.out.println("국어>");
					int ko = Integer.parseInt(sc.nextLine());
					stdAry[i].ko =ko;
					
					System.out.println("수학>");
					int math = Integer.parseInt(sc.nextLine());
					stdAry[i].math =math;
					
					System.out.println("영어>");
					int en = Integer.parseInt(sc.nextLine());
					stdAry[i].en =en;
					//임의의 객체(데이터를 모두 입력한)를 배열에 저장
					//5개의 데이터를 넣은 객체 = std
//					stdAry[i] = std;
				}
				
			}else if(selectNo == 3) {
				//학생의 수를 입력하고 배열이 만들어진 상황
				//학생의 데이터가 다 입력이 되어있다
				
				for(int i = 0; i<stdAry.length; i++) {
					System.out.println(stdAry[i].name +" 학생 성적");
					System.out.println("총점 :" + stdAry[i].sum());
					System.out.println("평균 :" + stdAry[i].sum()/3.0);
				}
				
			}else if(selectNo == 4) {
				
				System.out.println("end of prog");
				break;
				
			}
		}
		

	}
}
