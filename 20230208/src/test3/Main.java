package test3;

public class Main {

	public static void main(String[] args) {
		
		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		card.online();
		System.out.println("온라인 결제시 총 할인율 :" );
		card.offline();
		card.showInfo();
		System.out.println("온라인 결제 금액 :" + card.online()*10000);
		System.out.println("오프라인 결제 금액 :" + card.offline());
		
//		Payment simple = new SimplePayment(0.05);
//		card.showInfo();
//		System.out.println("온라인 결제 금액 :" + simple.online(price));
//		System.out.println("오프라인 결제 금액 :" + simple.offline(price));
	}

}
