package test2;

public class Card {
	private String cardNo;
	private int validDate;
	private int CVC;
	
	
	
	public Card(String cardNo, int validDate, int cVC) {
		
		this.cardNo = cardNo;
		this.validDate = validDate;
		CVC = cVC;
	}



	public String getCardNo() {
		return cardNo;
	}



	public int getValidDate() {
		return validDate;
	}



	public int getCVC() {
		return CVC;
	}
	
	
	public void showCardInfo() {
		System.out.println("카드 정보 ( Card NO : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + CVC + ")");
	}
	
}
