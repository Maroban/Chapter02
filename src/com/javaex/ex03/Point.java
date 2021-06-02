package com.javaex.ex03;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자

	// 메소드 - Ge/Se
	public void setX(int x) {
		this.x = x;
		// .this는 필드의 변수명 x를 의미 ==> 변수명이 겹쳤을 때만 사용
	}

	public void setY(int y) {
		this.y = y;
		// .this는 필드의 변수명 y를 의미 ==> 변수명이 겹쳤을 때만 사용
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// 메소드 - 일반
	public void draw() {	//복잡한 기능을 구현해야 된다는 가정
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}

}
