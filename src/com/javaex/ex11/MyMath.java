package com.javaex.ex11;

public class MyMath {

	// 필드
	private static double pi = 3.14;
	
	// 생성자
	
	
	// 메소드 - GS
	
	
	// 메소드 - 일반
	
	// 메소드 오버로딩 사용의 좋은 예. 
	// 작성자는 못 느끼지만 사용자가 편하다고 느낄 수 있다.
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static double plus(double a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double plus(double a, int b) {
		double result = a + b;
		return result;
	}
	
	public static double plus(int a, double b) {
		double result = a + b;
		return result;
	}
	
	public static double cirleArea(int radius) {
		double result = radius * radius * pi;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
}
