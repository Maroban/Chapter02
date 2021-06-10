package com.javaex.ex16;

public class Circle extends Shape {

	// 필드
	private int radius;

	// 생성자
	public Circle() {

	}

	public Circle(String fillColor, String lineColor, int radius) {
		super();
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		this.radius = radius;
	}

	// 메소드 - GS
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 - 일반
	public void draw() {
		System.out.println(
				"[면색: " + super.getFillColor() + ", 선색: " + super.getLineColor() + ", 반지름: " + radius + "] 원을 그렸습니다.");
	}

}