package com.yedam.operator;

public class Operater {

	public static void main(String[] args) {
		// 증감연산자
		int a = 0;
		System.out.println(a++);
		System.out.println(++a);

		
		//부호연산자
		int x = 100;
		
		System.out.println("x :" + x);
		System.out.println("-x :" + (-x));
		
		byte b = 100;
		int result = -b;
		
		//논리 부정 연산자(!, not)
		boolean flag = false;
		if(!flag)
			System.out.println("false");
		else
			System.out.println("true");
		
		//이항연산자(사칙연산)
		int v1 = 10;
		int v2 = 4;
		System.out.println(v1 + v2);
		System.out.println(v1 - v2);
		System.out.println(v1 * v2);
		
		//나누기 2개 존재
		// /: 몫, %: 나머지
		System.out.println("/ :" + (v1/v2));
		System.out.println("% :" + (v1%v2));
		
		//비교연산자
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2); // t
		System.out.println(num1 != num2);//f
		System.out.println(num1 >= num2);//t
		
		//기본타입의 값을 비교(==)
		//뮨자열 비교 문자열.equals(비교대상)
		
		String str = "test";
		if(str.equals("test")) {
			System.out.println("test입니다.");
		}
		
		//대문자, 숫자 비교하는 연산자
		//대문자 확인
		
		int charCode = 'A';//65,,, // Z = 90
		if(charCode>=65 && charCode <= 90) {
			System.out.println("대문자.");
		}
		
		//논리부정연산자+비교연산자
		//'0' -> 48, '9' -> 57
		//charCode >=48 && charCode <=57
		
		if(!(charCode<48)&& !(charCode>57)) {
			System.out.println("0~9숫자.");
		}
		
		//대입연산자 =, +=, -= ....
		
		int result1 = 0;
		result1 += 1; //result1 = result1 + 1
		result1 -= 1; //result1 = result1 - 1
		
		//삼항연산자
		
		int score = 85;
		char grade = (score > 90) ? 'A' : 'B';
		
		char grade2;
		if(score > 90) {
			grade2 = 'A';
		}else {
			grade2 = 'B';
		}	
		
		
		
		
	}

}
