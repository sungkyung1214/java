package com.ict.edu;

public class Ex02_method {
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int math = 80;
	
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	// 모두 void
	// void로 만드는 방법은 다 void를 붙여넣는다
	// void는 지 혼자 만드로 지 혼자 실행

	// 총점 구하는 메서드
	public void getSum() {
		sum = kor + eng + math;
		//System.out.println("총점 : "+sum);
	}

	// 평균 구하는 메서드
	public void getAvg() {
		avg = sum / 3;
		//System.out.println("총점 : "+avg);
	}

	// 학점 구하는 메서드
	public void getHak() {
		hak = "";
		if (avg >= 90) {
			hak = "A";
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70) {
			hak = "C";
		} else {
			hak = "F";
		}
		//System.out.println("학점 : "+hak);
	}

}