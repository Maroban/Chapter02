package com.javaex.ex17;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		
		// 부모클래스 테스트
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		s01.draw();
		System.out.println();
		
		
		// 사각형 테스트
		/*
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3);	
		System.out.println(r01.toString());
		r01.draw();
		*/
		
		// 배열
		Rectangle[] rArray = new Rectangle[3];
				
		rArray[0] = new Rectangle("빨강", "검정", 3, 3);
		rArray[1] = new Rectangle("초록", "검정", 5, 5);
		rArray[2] = new Rectangle("파랑", "검정", 7, 7);
		
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		System.out.println();
		
		// 원 테스트
		Circle[] cArray = new Circle[3];
		
		cArray[0] = new Circle("빨강", "검정", 10);
		cArray[1] = new Circle("초록", "검정", 20);
		cArray[2] = new Circle("파랑", "검정", 30);
		
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		System.out.println();
		
		// 삼각형 테스트
		Triangle[] tArray = new Triangle[3];
		
		tArray[0] = new Triangle("빨강", "검정", 3, 3);
		tArray[1] = new Triangle("초록", "검정", 5, 5);
		tArray[2] = new Triangle("파랑", "검정", 7, 7);
		
		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}
		System.out.println();
		
		
		
	}

}
