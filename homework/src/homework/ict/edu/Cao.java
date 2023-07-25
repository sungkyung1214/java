package homework.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Cao {

	public static void main(String[] args) {
		Random rnd = new Random();   //랜덤 클래스
		Scanner sc = new Scanner(System.in); //스캐너 클래스
		String inputS = "";
		String[] inputA = new String[3]; // 사람이 넣는것을 spilt 으로 돌려받아서 미리 선언을 해놓은 것
		int strike = 0;
		int ball = 0;
		int count = 0; // 몇번 째 맞췄습니다
		boolean out = true; // 아웃  
		int[] ansA = new int[3]; //컴퓨터가 자동으로 랜덤으로 나온 숫자3개 (정답)
		String con = ""; //계속하시겠습니까.
		
		
		//컴퓨터 숫작 자동으로 설정되게 한것
		while (true) {
			int ans = 100 + rnd.nextInt(900); // 100~999까지 랜덤수를 ans
			ansA[0] = ans / 100; // 100의 자리
			ansA[1] = ans % 100 / 10; // 10의 자리
			ansA[2] = ans % 10; // 1의 자리

			if (ansA[0] == ansA[1] || ansA[0] == ansA[2] || ansA[1] == ansA[2])
				continue;
			else
				break;
		}
		// 정답 입력 완료
		System.out.println("※※※※※※※※※야구게임을 시작합니다※※※※※※※※※");
		esc: while (true) {
			strike = 0;
			ball = 0;
			System.out.print("세 자리 수를 입력해주세요 : ");
			inputS = sc.next(); // 얘는 지금 String 1,3,5 => ["1,3,5"]
			inputA = inputS.split(",");// 얘는 배열로 {"1","3","5"} split 의 return 값은 배열 
			int[] input = new int[3];  //방을 새로 만듬, 왜냐하면 위에애들은 지금 String. 이걸 다시 int로 변환해줄려고
			
			// Integer 클래스 안에 있는 parseInt라는 메서드는 () 안에 인자를 String으로 받은것을 다시 int로 변환 
			for (int i = 0; i < 3; i++) {
				input[i] = Integer.parseInt(inputA[i]);
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (input[i] == ansA[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike + ball == 0) {
				out = true;
				System.out.println("아웃입니다! 다틀림");
			} else {
				out = false;
			}
			if (!out) {
				System.out.println(strike + " Strike");
				System.out.println(ball + " Ball");
				if (strike == 3) {
					System.out.println("정답입니다. 총" + (count + 1) + "번 만에 맞추셨습니다.");
					break esc;
				}
			}
			System.out.println("=================================");
			count++;
			while (true) {
				if (count > 9) {
					System.out.print("계속할까요?(y/n)");
					con = sc.next();
					if (con.toLowerCase().equals("y") ) {
						break;
					} else if (con.toLowerCase().equals("n")) {
						System.out.println("게임을 종료합니다.");
						break esc;
					} else {
						System.out.println("잘못입력했습니다.");
						continue;
					}
				} else
					break;
			}
		}
		sc.close();
	}
}