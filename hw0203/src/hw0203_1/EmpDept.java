package hw0203_1;

//	2) EmpDept 클래스를 정의한다.
//- Employee 클래스를 상속한다.
//- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 추가된 필드의 getter를 정의한다.
//- Employee 클래스의 메소드를 오버라이딩한다.
//(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
//(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능

public class EmpDept extends Employee{
	//자식클래스
	//필드
	private String department;
	
	//생성자
	public String getDepartment() {
		return department;
	}
	
	
	public EmpDept(String name, int Salary, String department) {
		super(name, Salary);
		this.department = department;
		
	}
	
	//메소드
	public void getInformation() {
		System.out.println("이름:"+ getName() + " 연봉:" + getSalary() + " 부서:" + getDepartment());
	}
	
	
	
}
