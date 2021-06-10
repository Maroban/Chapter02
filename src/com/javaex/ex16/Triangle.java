package com.javaex.ex16;

public class Triangle extends Shape {

	// 필드

	// 생성자
	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {

	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super();
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 - GS

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 - 일반

	public void draw() {
		System.out.println("[면색: " + super.getFillColor() + ", 선색: " + super.getLineColor() + ", 가로: " + width
				+ ", 세로: " + height + "] 삼각형을 그렸습니다.");
	}
}
