package test2;

public class TossCard extends Card{
	
	private String company;
	private String cardStaff;
	
	public TossCard(String cardNo, int validDate, int cVC, String cardStaff) {
		super(cardNo, validDate, cVC);
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println(" 담당직원" + cardStaff + company);
	}
	
	
	
	
}
