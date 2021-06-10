package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		// 사각형 관리
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);		
		Rectangle r02 = new Rectangle("초록", "검정", 6, 6);
		Rectangle r03 = new Rectangle("파랑", "검정", 7, 7);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		
		// 원 관리
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("빨강", "검정", 11);
		Circle c02 = new Circle("초록", "검정", 22);
		Circle c03 = new Circle("파랑", "검정", 33);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		
	
		
		
	}

}
