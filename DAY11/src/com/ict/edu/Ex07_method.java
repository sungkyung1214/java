package com.ict.edu;

public class Ex07_method {
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	// 여기까지 봤을때 변수를 다 만들어놓음. 이럴경우 하나씩 넣어서하면 된다.void

	// 총정을 구하는 메서드
	public void getSum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}

	// 평균을 구하는 메서드
	public void getAvg() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
	}

	public void getAvg(int k1) {
		avg = (int) (k1 / 3.0 * 10) / 10.0;
	}

	// 학점을 구하는 메서드
	public void getHak() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}
}
