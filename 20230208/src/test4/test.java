package test4;

public class test {

	public static void main(String[] args) {
		String[] arr = {"010102-4", "991012-1", "960304-1", "881012-2", "040403-3"};
		char gender = arr.charAt(7);
		System.out.println(gender);
		
		switch(gender) {
		case '1':
			System.out.println("남자입니다");
			break;
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':

			System.out.println("여자입니다");
			break;
		case '4':
			System.out.println("여자입니다");
			break;
		}

	}

}
