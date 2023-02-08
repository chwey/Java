package test3;

public class CardPayment implements Payment{
	//필드
	public double cardRatio;
	//생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	//메소드
	@Override
	public int online(int price) {
		int money = (int)(price*(1-(ONLINE_PAYMENT_RATIO + cardRatio)));
		
		return money;
	}

	@Override
	public int offline(int price) {
		
		int money = (int)(price*(1-(OFFLINE_PAYMENT_RATIO + cardRatio)));
		return money;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 카드결제시 할인정보");
		System.out.println("온라인 결제 총 할인율 : " + (ONLINE_PAYMENT_RATIO + cardRatio));
		System.out.println("오프라인 결제 총 할인율 : " + (OFFLINE_PAYMENT_RATIO + cardRatio));
		
		
	}
	
	
	
	

}
