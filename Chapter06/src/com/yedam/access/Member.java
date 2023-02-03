package com.yedam.access;

public class Member {
	//다음의 조검에 맞추어 Member 클래스를 작성하세요
	//어떠한 사이트 회원에 대한 정보를 담는 객체 생성 용도
	//아이디, 비밀번호, 이름, 나이
	//생성자는 기본생성자
	//getter, setter 활용하여 정보를 읽고 저장할 수 있는 메소드
	//1) 나이를 입력할 때 데이터의 무결성을 지켜주기 위하여 0보다 작은 수가 입력이 되면 0으로 나이 변경
	//2)나이를 출력할때에는 입력한 값에 +1하여 출력
	
	//필드
	private String Id;
	private String password;
	private String name;
	private int age;
	
	//생성자
	Member(){
		
	}

	//메소드
	
	public void setId(String id) {
		Id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age<0) {
			this.age =0;
		}else {
			this.age = age;
		}
	}

	public String getId() {
		return Id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age +1;
		
	}
	
}	