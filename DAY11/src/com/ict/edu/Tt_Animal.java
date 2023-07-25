package com.ict.edu;

public class Tt_Animal {
	public static void main(String[] args) {
	
		//객체 생성
		T_Animal animal = new T_Animal();
	
		//이름 큰뿔소 변경
		animal.setName("큰뿔소");
		
		//나이 3 변경
		animal.setAge(3);
		
		//생존여부 살아있음
		animal.setLive(true);
		
		
		
		//결과 출력
		String m1 = animal.getName();
		System.out.println("이름 : " + m1);
		
		int m2 = animal.getage();
		System.out.println("나이 : " + m2);
		
		boolean m3 = animal.getLive();
		if(m3) {
			System.out.println("생사여부 : 살아있음");
		}else {
			System.out.println("생사여부 : 죽었음");
		}
		
		
		//이름을 펭귄, 나이1, 살아있음으로 변경
		System.out.println("==============================");
		animal.setName("펭귄");
		animal.setAge(1);
		animal.setLive(true);
		

		//결과 출력
		String p1 = animal.getName();
		System.out.println("이름 : " + p1);
		
		int p2 = animal.getage();
		System.out.println("나이 : " + p2);
		
		boolean p3 = animal.getLive();
		if(p3) {
			System.out.println("생사여부 : 살아있음");
		}else {
			System.out.println("생사여부 : 죽었음");
		}
		System.out.println("==============================");
		animal.play(false, 14, "엄지");
		animal.prn();
		
		System.out.println("==============================");
		animal.play("까치", 14, true);
		animal.prn();
	}
}
