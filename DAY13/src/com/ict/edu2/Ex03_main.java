package com.ict.edu2;

import com.ict.edu.Ex03_static;

public class Ex03_main {
	public static void main(String[] args) {
		// static 접근제한
		// k1 = public = 누구나 다 접근
		// k2 = 생략 = default = 같은 패키지만 접근 가능
		// k3 = private = 외부에서 접근 못함
		
		System.out.println(Ex03_static.k1);
		//System.out.println(Ex03_static.k2);
		//System.out.println(Ex03_static.k3);
		// 다른 패키지에서는 프라이빗이랑 디폴트 오류
	}
}
