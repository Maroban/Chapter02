package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		// 디폴트 생성자
		Point p01 = new Point();		
		p01.setX(5);	// x 값에 대입
		p01.setY(5);	// y 값에 대입
		p01.draw();		// 출력

		// public Point(int x, int y) 생성자 
		Point p02 = new Point(6, 6);	// () 괄호 안에 값을 대입하여 사용
		p02.draw();		// 출력
		
		// 메소드 오버로딩
		Point p03 = new Point(50, 50);  
		p03.draw(false);  // boolean형으로 false 값 넣기		
		
		
	}

}
