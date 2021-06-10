package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {

		// 배열 만들기
		Shape[] sArray = new Shape[3];

		// 도형 만들기.
		Shape sr01 = new Rectangle("빨강", "검정", 10, 10);
		Shape sc01 = new Circle("초록", "검정", 5);
		Shape st01 = new Triangle("파랑", "검정", 10, 10);

		// 배열 <-- 도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;

		// 배열을 이용해서 그리기
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}

		((Rectangle) sr01).getWidth();
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
			System.out.println("넓이:" + sArray[i].area());
		}


	}

}
