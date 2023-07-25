package homework.ict.edu;

public class Ex01 {
	public static void main(String[] args) {

		//  if else 문
		// 농구공 5개씩 한박스에 들어간다.
		// 40개면 8상자 26개면 6개
		// int k1 = 127 몇상자 필요한가

		int k1 = 127;
		int res = 0; // 상자
		if (k1 % 5 == 0) {
			res = k1 / 5;
			System.out.println(res + "상자");
		} else {
			res = k1 / 5 + 1;
			System.out.println(res + "상자");
		}
		System.out.println("=============");
		
		
		// for문으로 풀기
		// 0000 0000 0000 0000
		// for( 초기식;조건식;증감식 )
		for (int s = 1; s < 5; s++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("=============");
		
		
		// 이중 for문으로 1000 0100 0010 0001
		for (int i = 1; i < 5; i++) {
		for (int j = 1; j < 5; j++) {
				//
				// if(i == j){
				// System.out.print("1 ");
				// } else {
				// System.out.print("0 ");
				// }

		System.out.print(i == j ? "1 " : "0 ");
			}
		System.out.println();
		}
		System.out.println("=============");
		
		
		
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
		// 몇까지 더해야 총합이 100이상이 되는지 ﻿
		int sum = 0;
		int su = 1;
		while(sum < 100){
		if(su % 2 == 0){
		sum = sum - su; // 왼쪽 구문을 줄여서 sum -= su; 이렇게 사용 가능.
		} else {
		sum = sum + su; //sum += su;
		}
		//System.out.println("su :: " + su + ", sum :: " + sum);
		su++;
		}
		System.out.println("숫자 " + su + "일 때까지 더하면 합이 100 이상도달");
		
		System.out.println("=============");
		
		for (int  i = 1;  i<5; i++) {
			for (int j=1; j<5; j++) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("=============");
		
		


		for(int i=1;i<5;i++){
			for(int j=4;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
		



