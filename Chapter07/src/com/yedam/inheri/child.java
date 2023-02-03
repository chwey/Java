package com.yedam.inheri;

public class child extends parent{
	//child class
	//필드
	String lastName;
	String bloodType;
	int age;
	String habby;
	

	
	//생성자
	public child(String firstname, String lastName, String bloodType, int age, String habby) {
		super(firstname);
		this.lastName = lastName;
		this.bloodType = bloodType;
		this.age = age;
		this.habby = habby;
	}
	
	//메소드
	@Override
	public void getInfo() {
		
		super.getInfo();
		System.out.println("내이름 :" + this.lastName);
		System.out.println("혈액형 :" + this.bloodType);
		System.out.println("나이 :" + this.age);
		System.out.println("취미 :" + this.habby);
	}
}
