package test2;

public class DGBCard extends Card{

	private String company;
	private String cardStaff;
	
	public DGBCard(String cardNo, int validDate, int cVC, String cardStaff) {
		super(cardNo, validDate, cVC);
		this.cardStaff = cardStaff;
		this.company = "대구은행";
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println(" 담당직원" + cardStaff + company);
	}
	
		
}
	

