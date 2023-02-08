package yedam.array;

public class Exam05 {

	public static void main(String[] args) {
		//최댓값 또는 최소값이 위치하는 인덱스 구하기
		int[] array = {20,50,70,100,30,10,90,80};
		
		//로직을 통한 최댓값, 최소값의 인덱스 구하기
		
		int max = 0;
		//array[0] -> 첫번째 데이터 출력(인덱스 활용)
		int max1 = 0;
		int min = array[0];
		int min1 = 0;
		for(int i = 0; i<array.length; i++) {
			if(max < array[i]){
				max = array[i];
				max1 = i;
				}
			
				if(min>array[i]) {
					min = array[i];
					min1 = i;
			
		}
		
			}
		System.out.println("최댓값은?"+ max1);
		System.out.println("최소값은?"+ min1);
		
		
		
		//명령라인입력 
		for(int i=0; i<args.length; i++) {
			System.out.println("명령 라인 출력:" + args[i]);
		}
	}
}


