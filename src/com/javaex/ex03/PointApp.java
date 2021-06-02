package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		Point p01 = new Point();
		Point p02 = new Point();
		
		p01.setX(5);
		p01.setY(5);
		
		p02.setX(10);
		p02.setY(23);

		p01.draw();
		p02.draw();
	}

}
