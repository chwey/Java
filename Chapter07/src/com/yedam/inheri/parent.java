package com.yedam.inheri;

public class parent {
	//parent class
	//필드
	public String firstname;
	
	//메소드
	public parent(String firstname) {
		this.firstname = firstname;
	}
	//생성자
	public void getInfo(){
		System.out.println("우리가족의 성씨는 '" + firstname + "'씨 입니다.");
	}
}
