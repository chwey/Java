package test2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Card info = new Card("5432-4567-9534-3657", 20251203, 253);
		info.showCardInfo();
		
		
		Card toss = new TossCard("5432-4567-9534-3657", 20251203, 253, "신비룡");
		toss.showCardInfo();
		
		Card DGB = new DGBCard("5432-4567-9534-3657", 20251203, 253, "신비룡");
		DGB.showCardInfo();

	}

}
