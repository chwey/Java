package hw0203_2;

public class StandardWeightInfo extends Human {
	/*	2) StandardWeightInfo 클래스를 정의한다.
			- Human 클래스를 상속한다.
			- 메소드는 다음과 같이 정의한다.
			(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
			(2) public double getStandardWeight() : 표준체중을 구하는 기능
			( * 표준 체중 : (Height - 100) * 0.9 )
			*/
	
	public StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.print("표준체중 %.1f 입니다.\n " + getStandardWeight());
	}

	public double getStandardWeight() {
		double result = (double)((super.height - 100) * 0.9);
		return result;
		
	}
	
	
}
