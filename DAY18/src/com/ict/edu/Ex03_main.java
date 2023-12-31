package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		// 객체를 저장하는 2가지 방법 : 배열,컬렉션 
		//데이터 넣은 2가지 방법 only
		
		//메서드에서 가장 중요한건 반환형
		
		
		//setter를 이용해서 데이터 넣기
		Ex03 p1 = new Ex03();
		p1.setName("둘리");
		p1.setAge(24);
		p1.setWeight(81.9);
		
		//생성자를 이용해서 데이터 넣기
		Ex03 p2= new Ex03("희동이", 3, 12.6);
		Ex03 p3= new Ex03("마이콜", 21, 65.2);
		Ex03 p4= new Ex03("또치", 36, 56.2);
		
		//객체를 저장하는 방법 : 배열, 컬렉션
		// 1. 배열 : 크기를 지정하면 변경 안됨
		Ex03[] arr =new Ex03[4];
		arr[0]= p1;
		arr[1]= p2;
		arr[2]= p3;
		arr[3]= p4;
		
		// 2. 컬렉션 : 크기지정 없음, 추가 혹은 삭제 가능
		HashSet<Ex03> set1 = new HashSet<>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		set1.add(new Ex03("공실이", 24, 51.4));
		
		// 이름만 꺼내고 싶어용
		// 1. 배열은 일반 for문 & 개선된 for문 둘다 사용 가능
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}//알아서 이름들만 쭉 나옴 
		
		System.out.println();
		for (Ex03 k : arr) {
			System.out.println(k.getName());
		}
		System.out.println();
		// 2. 컬렉션 : 개선된 for문, Iterator
		for (Ex03 k : set1) {
			System.out.println(k.getName());
		}
		System.out.println();
		Iterator<Ex03> it = set1.iterator();
		while (it.hasNext()) {
			Ex03 k = (Ex03) it.next();
			System.out.println(k.getName());
			
		}
		
		
		
		}
	}

