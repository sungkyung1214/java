package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;



public class Ex02_Set {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복안됨, 특정기준으로 정렬 할 수 없음.
		//		 (단, TreeSet은 항상 오름차순을 유지한다.)
		// 형식 : HashSet<제네릭타임=객체타임=클래스> 참조변수 = new HashSet<[제네릭타임=객체타임=클래스]>();
		// 형식 : TreeSet<제네릭타임=객체타임=클래스> 참조변수 = new TreeSet<[제네릭타임=객체타임=클래스]>();

		// 1. 컬렉션 생성( 랩퍼 클래스 : 기본자료형들을 클래스로 만들어주는 클래스)
		//				(Integer, Double, Character, String)
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Double> h2 = new HashSet<>();
		HashSet<Character> h3 = new HashSet<>();
		HashSet<String> h4 = new HashSet<>();
		
		System.out.println(h1);
		
		// 2. 컬렉션에 객체 넣기(add)
		h1.add(new Integer(14));
		h1.add(new Integer("16"));
		h1.add(20); // 오토박싱 : 기본자료형이 해당 객체로 만들어진다.
					// 오토 언박싱 : 해당 객체를 기본자료형으로 되돌리는 것 
		
		System.out.println(h1);
		
		h2.add(new Double(30.1) );
		h2.add(new Double("35.1") );
		h2.add(38.2 );
//		h2.add(30); //무조건 제네릭타입을 맞춰야 한다. 프로모션을 생각하면 안된다.
		System.out.println(h2);
		
		h3.add(new Character('j'));
		h3.add(new Character('a'));
		h3.add(new Character('v'));
		h3.add(new Character('a')); //중복불가, 들어가지 않음
		System.out.println(h3);
		
		System.out.println("하나씩 처리하기(개선된 for문)");
		for (Integer k : h1) {
			System.out.println(k +10);
		}
		System.out.println("=====================");
		System.out.println("하나씩 처리하기(iterator)");
		Iterator<Double> it =  h2.iterator();
		while (it.hasNext()) {//다음꺼 있냐~?
			Double k = (Double) it.next();//다음꺼 가지고 나와라~
			System.out.println(k);
		}
		System.out.println("=====================");
		Iterator<Character> it2 = h3.iterator();
		while (it2.hasNext()) {
			Character k = (Character) it2.next();
			System.out.println(k);
		}
		
		
		
		
		
		
		
		
	}
}
