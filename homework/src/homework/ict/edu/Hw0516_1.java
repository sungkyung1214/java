package homework.ict.edu;

import java.util.Scanner;

public class Hw0516_1 {

	public static void main(String[] args) {

		Hw0516 t1 = new Hw0516();

		boolean isStop = false; // 계속 진행 여부
		while (!isStop) {

			// 컴퓨터의 랜덤 가위바위보 세팅;
			String com = t1.getComGbb();

			// 사용자가 입력한 값
			Scanner scan = new Scanner(System.in);
			System.out.println("가위, 바위, 보 중 하나를 입력해 주세요.");
			String user = scan.next();

			System.out.println("컴퓨터 ::: " + com + ", 사용자 ::: " + user);

			// 0 짐, 1 비김, 2 이김
			int result = t1.getWinner(user, com);

			if (result == 1) {
				System.out.println("비김!!!");
			} else if (result == 2) {
				System.out.println("사용자 승!!!");
			} else {
				System.out.println("컴퓨터 승!!!");
			}

			System.out.println("계속 해? ( 1: yes, 2: no)");
			int keepYn = scan.nextInt();
			isStop = keepYn == 2 ? true : false;
		}
	}
}
