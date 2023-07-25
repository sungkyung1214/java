package homework.ict.edu;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sysin = scanner.nextInt();

		if (sysin % 2 == 0) {
			System.out.println("입력값 : " + sysin + " => 짝수");
		}

		else {
			System.out.println("입력값 : " + sysin + " => 홀수");
		}

		String sysinName = scanner.nextLine();
		int sysinKor = scanner.nextInt();
		int sysinEng = scanner.nextInt();
		int sysinMath = scanner.nextInt();
		int totalPoint = sysinKor + sysinEng + sysinMath;
		double avrg = (double) totalPoint / 3;
		System.out.println("이름 : " + sysinName);
		System.out.println("총점 : " + totalPoint);
		System.out.print("평균 : " + String.format("%.1f", avrg));

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (c == 1) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if (c == 2) {
			System.out.println(a + " - " + b + " = " + (a - b));
		} else if (c == 3) {
			System.out.println(a + " * " + b + " = " + (a * b));
		} else if (c == 4) {
			System.out.println(a + " / " + b + " = " + (a / b));
		} else {
			System.out.println("세번째 값은 1 ~ 4 중에서 입력해 주세요.");

			int d = scanner.nextInt();
			int e = scanner.nextInt();
			int f = scanner.nextInt();
			if (f == 1) {
				System.out.println(d + " + " + e + " = " + (d + e));
			} else if (f == 2) {
				System.out.println(d + " - " + e + " = " + (d - e));
			} else if (f == 3) {
				System.out.println(d + " * " + e + " = " + (d * e));
			} else if (f == 4) {
				System.out.println(d + " / " + e + " = " + (d / e));
			} else {
				System.out.println("세번째 값은 1 ~ 4 중에서 입력해 주세요.");
			}
		}
		
		
	}
}
