package yedam.com.poly;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(new Bus());
		driver.drive(texi);

	}

}
