package test3;

public class SimplePayment implements Payment {
	private double simplePaymentRatio;

	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	
	@Override
	public int online(int price) {
		int money =(int)( price*(1-(ONLINE_PAYMENT_RATIO + simplePaymentRatio)));
		return money;
	}

	@Override
	public int offline(int price) {
		int money =(int) (price*(1-(OFFLINE_PAYMENT_RATIO + simplePaymentRatio)));
		return money;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제시 할인정보");
		System.out.println("온라인 결제 총 할인율 : " + (ONLINE_PAYMENT_RATIO + simplePaymentRatio));
		System.out.println("오프라인 결제 총 할인율 : "+ (OFFLINE_PAYMENT_RATIO + simplePaymentRatio));
	}
	
	
	
	
}
