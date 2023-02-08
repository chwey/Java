package hw0201;

import java.util.Scanner;

public class product {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		Scanner sc = new Scanner(System.in);
		
		int merch = 0; // 상품 수 입력받는 변수
		
		pro[] merAry = null; 
		boolean run = true;
		
		while(run) {
			System.out.println("1. 상품 수 | 2. 상품 및 가격입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료");
			System.out.println("입력>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			if(selectNo == 1) {
				
				System.out.println("상품 수 입력>");
				merch = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo == 2){
				
				merAry = new pro[merch];
				for(int i=0; i<merAry.length; i++) {
					merAry[i] = new pro();
					
					System.out.println("상품이름>");
					String name = sc.nextLine();
					merAry[i].name = name;
					
					System.out.println("가격>");
					int price = Integer.parseInt(sc.nextLine());
					merAry[i].price = price;
				}
					
			}else if (selectNo == 3) {

				for(int i = 0; i<merAry.length; i++) {
					System.out.println(merAry[i].name + ":" + merAry[i].price);				
					
				}
			}else if(selectNo == 4) {
				int max = merAry[0].price;
				int maxin = 0; 
				for(int i=1; i<merAry.length; i++) {
					if(merAry[i].price > max) {
						max = merAry[i].price;
						maxin = i;
					}
				
					int sum = 0;
					for(pro product : merAry) {
						if(product.price != max) {
							continue;
						}
						sum +=  product.price;
					}
					System.out.println("최고 가격 제품명 :" + merAry[maxin].name);
					System.out.println("최고 가격을 제외한 제품가격의 합 :" + sum);
			}
				
			}else if(selectNo == 5) {
				
				System.out.println("end of prog");
				run = false;
				
			}
		
		}
	}
			
}
