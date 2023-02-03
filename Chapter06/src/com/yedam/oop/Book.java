package com.yedam.oop;

public class Book {
	//book이라는 클래스는 아래의 정보를 가져야합니다.
	//책이름, 책종류, 가격, 도서번호, 출판사
	
	//생성자는 3개정도 생성
	//1) 기본 생성자
	
	//데이터(매개변수) -> 필드를 초기화 할 수 있게끔 생성자
	//2) 모든 데이터를 초기화 할 수 있는 생성자
	//3) 책 이름, 책 가격, 도서번호를 받아오는 생성자
	
	
	//생성자는 아무런 행동을 하지 않습니다.
	//메소드는 getInfo() 메소드를 클래스 외부에서 실행 하였을 때
	//다음과 같은 출력물이 나오도록 구현
	//객체 생성할때, 생성자를 통한 필드 초기화
	//객체.getInfo()
	/*System.out.println()
	 * 책 이름 : 혼자 공부하는 자바
	 * #내용
	 * 1) 종류 : 학습서
	 * 2)가격 :24000원
	 * 3)출판사: 한빛 미디어
	 * 4)도서번호 : 0001
	 */
	
	//필드
	String bookname;
	String kind;
	int price;
	int isbn;
	String company;
	
	//생성자
	public Book() {
		
	}
	
	public Book(String bookname, String kind, int price, int isbn, String company) {
		this.bookname = bookname;
		this.kind = kind;
		this.price = price;
		this.isbn = isbn;
		this.company = company;
	}
	
	public Book(String bookname, int price, int isbn) {
		this.bookname = bookname;
		this.price = price;
		this.isbn = isbn;
	}
	
	
	//메소드
	void getInfo() {
		System.out.println("책이름 :" + bookname);
		System.out.println("# 내용");
		System.out.println("종류 :" + kind);
		System.out.println("가격 :" + price);
		System.out.println("출판사 :" + company);
		System.out.println("도서번호 :" + isbn);
	}
	
	
	void setKind(String kind) {
		this.kind = kind;
	}
	
	
}
