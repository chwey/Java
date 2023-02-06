package hw0203_1;

import java.util.Scanner;

import com.yedam.inheri.child;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		EmpDept person = new EmpDept("이지나", 3000, "교육부");	
		person.getInformation();
		person.print();
		
		
	}
}	




