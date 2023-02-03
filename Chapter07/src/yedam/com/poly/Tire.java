package yedam.com.poly;

public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRoatation;
	public String location;
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메소드
	public boolean roll() {
		++accumulatedRoatation;
		if(accumulatedRoatation<maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRoatation) + "회");
			 return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
