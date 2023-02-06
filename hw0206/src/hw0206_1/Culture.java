package hw0206_1;

public abstract class Culture {
	/*1) Culture 클래스를 정의한다.
	- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
	- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
	- 메소드는 다음과 같이 정의한다.
	(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
	(2) public String getGrade() : 평점을 구하는 기능
	(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	*/
	
	//필드
	String title;
	int dir;
	int act;
	int aud;
	int score;
	
	
	
	
	//생성자
	public Culture(String title, int dir, int act, int aud, int score) {
		
		this.title = title;
		this.dir = dir;
		this.act = act;
		this.aud = aud;
		this.score = score;
	}
	
	
	//메소드
	
	public void setTotalScore(int score) {
		
	}
	
	public String getGrade() {
		switch(grade) {
		int grade = 0;
		case 1: 
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
		return "☆";
	}
	
	public abstract void getInformation();
		
	
	
}
	


