package com.ict.edu;

import java.util.Random;

public class Ex05_extends_FM extends Random {
	int su = nextInt();

	public void play() {
		System.out.println("Ex05 :" + su);
	}

	// static 메서드는 static 변수만 사용 가능
	public static void main(String[] args) {

		// 자기 자신이라도 객체를 만들자
		Ex05_extends_FM test = new Ex05_extends_FM();
		test.play();

	
	}
}
