package com.ict.edu4;

public class Ex01_main {
	public static void main(String[] args) {
		//자식 객체를 생성하면 먼저 부모객체가 먼저 만들어진다.
		//객체가 만들어진다는 뜻은 생성자가 한번 호출 됐다라는 뜻
		//자식클래스, 부모클래스에 생성자가 없으면 기본생성자로 호출
		Ex01_Sub test = new Ex01_Sub();
		System.out.println(test.name);
		System.out.println(test.age);
		System.out.println(test.weight);
		System.out.println();
		
		Ex01_Sub test2 = new Ex01_Sub("일지매",21);
		System.out.println(test2.name);
		System.out.println(test2.age);
		System.out.println(test2.weight);
		
	}
}
