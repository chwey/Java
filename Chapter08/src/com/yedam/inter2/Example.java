package com.yedam.inter2;

public class Example {

	public static void main(String[] args) {
		impelementsC impl = new impelementsC();
		
		//interfaceA ~ C까지 impl을 활용해서 메소드 호출
		
		//1) interfaceA -> A가 가지고 있는 메소드 method01만 실행
		InterfaceA ia = impl;
		ia.method01();
		//2) interfaceB -> ㅠ가 가지고 있는 메소드 method02만 실행
		InterfaceB ib = impl;
		ib.method02();
		//3) interfaceC
		InterfaceC ic = impl;
		ic.method01();
		ic.method02();
		ic.method03();

	}

}
