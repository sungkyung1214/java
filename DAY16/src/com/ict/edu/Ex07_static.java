package com.ict.edu;

public class Ex07_static {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;

	public Ex07_static() {
		System.out.println("외부 생성자 : " + this);
	}

	public void play() {
		int money = 1000;
		System.out.println("외부 메서드 : " + name);
		System.out.println("외부 메서드 : " + money);
	}

	// 내부클래스
	// 내부클래스의 멤버변수가 static이면 class를 static 으로 만들어야 한다.
	// 권장사항은 아님( 일반 클래스에서는 static 사용 못함, 오류남)
	public static class Inner01 {
		String addr = "서울 마포구";
		int roomNumber = 1;
		static int count = 30 ;
		
		public Inner01() {
			System.out.println("내부 생성자 : " + this);
		}
		
		public void prn() {
			System.out.println(addr);
			System.out.println(roomNumber);
			
			//외부클래스의 멤버도 마음대로 사용가능(private도 가능)
			//System.out.println(name);
			//System.out.println(age);
			System.out.println(gender);
			
			//생성자에서 생성자 호출가능,메서드가 메서드 호출가능 그래서 내부메서드도 호출 가능
			
			//외부클래스의 메서드
			//play();
			
		}
	}
	
	
	
}
