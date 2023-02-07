package com.yedam.API;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);

		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj);
		System.out.println(obj.toString());
		
		SmartPhone sp = new SmartPhone("apple", 100, "iphone");
		System.out.println(sp.toString());
	}
	
}
