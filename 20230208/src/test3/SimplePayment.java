package test3;

public class SimplePayment implements Payment {
	private double simplePaymentRatio;

	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	
	@Override
	public int online() {
		simplePaymentRatio = Payment.ONLINE_PAYMENT_RATIO;
		return 0;
	}

	@Override
	public int offline() {
		simplePaymentRatio = Payment.OFFLINE_PAYMENT_RATIO;
		return 0;
	}

	@Override
	public void showInfo() {
		
		
	}
	
	
	
	
}
