package hw0203_2;

public class Human {
	/*1) Human 클래스를 정의한다.
		- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
		- 메소드는 다음과 같이 정의한다.
		(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
		
	*/
	
	private String name;
	private int height;
	private int weight;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Human(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	void getInformation() {
		System.out.println("이름 : " + name + "키 : " + height + "몸무게 : " + weight);
	}
	

}
