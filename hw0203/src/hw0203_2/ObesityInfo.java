package hw0203_2;

public class ObesityInfo extends StandardWeightInfo {

	/*3) ObesityInfo 클래스를 정의한다.
		- StandardWeightInfo 클래스를 상속한다.
		- 메소드는 다음과 같이 정의한다.
		(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
		(2) public double getObesity() : 비만도를 구하는 기능
		( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
		*/
	
	
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}

	@Override
	public void getInformation() {
		double bmi =getObesity();
		//bmi에 따른 비만도 알려줘야함
		String objestiy = null;
		if(bmi <= 18.5) {
			objestiy = "저체중";
		}else if(bmi <= 22.9) {
			objestiy = "정상";
		}else if(bmi <= 24.9) {
			objestiy = "과체중";
		}else {
			objestiy = "비만";
		}
		System.out.println(name + "님의 신장" + height + ", 몸무게 : " +weight + " ," + objestiy+ "입니다.");
		
	}
	
	public double getObesity() {
	double bmi = (weight - super.getStandardWeight())/super.getStandardWeight() * 100;	
	return bmi;
	}
	
}
	

	

