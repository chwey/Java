package test;

public class num3 {

	public static void main(String[] args) {
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money=" + money);
		for(int i = 0; i<coinUnit.length; i++) {			
			//제일 큰 금액부터 차감
			//2680 -> 500원 몇개 있는지 -> 남은 금액에 대해서
			//100원이 몇개 있는지 - > 남은 금액에 대해서
			if(money > 500) {
				//몫이면서 500원짜리의 갯수
				coinUnit[i] = money/500;
				money = money - (coinUnit[i] * 500);
				System.out.println("500원 : " + coinUnit[i] + "개");
				//money = 180
			}else if(money > 100) {
				//몫이 100원짜리의 갯수
				coinUnit[i] = money/100;
				money = money - (coinUnit[i] * 100);
				System.out.println("100원 : " + coinUnit[i] + "개");
			}else if(money > 50) {
				coinUnit[i] = money/50;
				money = money - (coinUnit[i] * 50);
				System.out.println("50원 : " + coinUnit[i] + "개");
			}else if(money > 10) {
				coinUnit[i] = money/10;
				money = money - (coinUnit[i] * 10);
				System.out.println("10원 : " + coinUnit[i] + "개");
			}
			
		}

	}

}
