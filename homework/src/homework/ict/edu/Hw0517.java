package homework.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Hw0517 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean isStop = false; // 계속 진행 여부
		while (!isStop) {

		int ranNum = rand.nextInt(100) + 1;
		int ans = 0;
		if (ranNum % 2 == 0) {
			ans = 2;
		} else if (ranNum % 2 == 1) {
			ans = 1;
		}
		while (true) {
			System.out.println(ranNum);
			System.out.print("높음(1) 낮음(2) :");
			int me = sc.nextInt();
			if (ans == me) {
				System.out.println("정답입니다!");
				break;
			} else if (ans != me) {
				System.out.println("틀렸습니다");
				continue;
			}
		}

		Scanner scanner = new Scanner(System.in);
		String inputString;

		System.out.println("YES / NO (Y,N)?");
		inputString = scanner.nextLine();

		switch (inputString) {

		case "y":
		case "Y":
			System.out.println("YES");
			break;
		case "n":
		case "N":
			System.out.println("NO");
			break;

		default:
			System.out.println("Wrong answer");
			
			

		}
		}
	}
}
	

