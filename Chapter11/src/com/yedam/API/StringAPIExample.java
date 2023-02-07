package com.yedam.API;

public class StringAPIExample {

	public static void main(String[] args) {
		// 1) 문자열 뒤집기 -> 반복문 조건만 잘 주면 됨
		//String str = "abcdefg" -> "gfedcba"
		
		String str = "abcdefg";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		

	}

}
