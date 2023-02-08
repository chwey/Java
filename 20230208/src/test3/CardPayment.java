package test3;

public class CardPayment implements Payment{
	
	private double cardRatio;

	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}

	
	@Override
	public int online() {
		cardRatio = Payment.ONLINE_PAYMENT_RATIO;
		
		return 0;
	}

	@Override
	public int offline() {
		cardRatio = Payment.OFFLINE_PAYMENT_RATIO;
		
		return 0;
	}

	@Override
	public void showInfo() {
		
		
	}
	
	
	
	

}
