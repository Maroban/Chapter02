package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		
		/*
		MyMath myMath = new MyMath(); // 이렇게 쓸 이유가 전혀 전혀 전혀 없다.(static을 이해 못 한 사람)
		// plus 하나로 double 과 int 모두 출력 가능하다 (이거시 메소드 오바로딩)
		System.out.println(myMath.plus(100, 100));	
		System.out.println(myMath.plus(100.5, 100.2));
		System.out.println(myMath.plus(151.8, 94));
		System.out.println(myMath.plus(68, 73.4));
		*/
		
		System.out.println(MyMath.cirleArea(5));
		
		System.out.println(MyMath.plus(100, 100)); // static을 이해 잘 한 사람.
		System.out.println(MyMath.plus(100.5, 100.2));
		System.out.println(MyMath.plus(151.8, 94));
		System.out.println(MyMath.plus(68, 73.4));
		
		
		
		

	}

}
