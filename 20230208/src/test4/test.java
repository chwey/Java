package test4;

public class test {

	public static void main(String[] args) {
		String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3"};
		int male = 0;
		int female = 0;
		
		for(int i = 0; i<arr.length; i++) {
			char gender = arr[i].charAt(7);
			switch(gender) {
			case '1':
				male ++;
				break;
			case '3':
				male ++;
				break;
			case '2':
				
				female ++;
				break;
			case '4':
				female ++;
				break;
			}
		}
		System.out.println("남자: " + male + ", 여자 : " + female);
	}

}
