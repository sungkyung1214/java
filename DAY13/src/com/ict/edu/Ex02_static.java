package com.ict.edu;

public class Ex02_static {
	// static : 객체 생성과 상관없이 미리 만들어지
	// 			static 영역에서 생성 된다.
	//			(객체 생성전에도 호출가능=클래스이름.  )
	// 			공유 개념을 가진다.
	// 			(모든 객체가 접근 가능하다.)
	// 			**클래스와 지역변수에는 사용할 수 없다.
	// 			(내부 클래스에서는 사용할 수 있다)

	int su1 = 10;
	static int su2 = 10;

	// 기본생성자
	public Ex02_static() {
		su1++;
		su2++;
		
	}
}
