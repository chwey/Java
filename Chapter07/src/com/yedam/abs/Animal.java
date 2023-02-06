package com.yedam.abs;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉬다");
	}
	
	//추상메소드
	public abstract void sound(); //동물들마다 내는 소리 다름
	
}
