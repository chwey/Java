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
	int totalScore;
	
	
	
	//생성자
	public Culture(String title, int dir, int act) {
		
		this.title = title;
		this.dir = dir;
		this.act = act;
		
	}
	
	
	//메소드
	
	public void setTotalScore(int score) {
		//관객수 1씩 증가
		aud++;
		//점수를 누적(총점)
		totalScore += score;
	}
	
	
	public String getGrade() {
		
		//첫번째 방법
		int avg = (totalScore/aud);
		String grade = "";
		
		switch(avg) {
		case 1:
			System.out.println("☆");
			break;
		case 2:	
			System.out.println("☆☆");
			break;
		case 3:
			System.out.println("☆☆☆");
			break;
		case 4:
			System.out.println("☆☆☆☆");
			break;
		case 5:
			System.out.println("☆☆☆☆☆");
			break;
		}
		return grade;
	}
	
	//두번째방법
//	for (int i = 0; i < avg; i++) {
//		grade+= "☆";
//	}
//	return grade;
	
	
	public abstract void getInformation();
	

	
}
	


