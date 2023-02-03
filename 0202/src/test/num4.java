package test;


public class num4 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			System.out.println("***"+i+"단***");
			for(int j=1; j<10; j++)
				if(i>=j) {					
					System.out.println(i + "x" + j + "=" + (i*j));
				}
		}
		
		

	}

}
