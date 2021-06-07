package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		//카메라
		Good camera = new Good();
		camera.name = "캐논"; // Goods.java 에 있는 틀을 이용해 지정해줄 수 있다.
		camera.price = 400000;
		System.out.println(camera.name + " , " + camera.price);

		//컴퓨터
		Good computer = new Good();
		computer.name = "그램";
		computer.price = 1000000;
		System.out.println(computer.name + " , " + computer.price);

		//컵
		Good cup = new Good();
		cup.name = "머그컵";
		cup.price = 2000;
		System.out.println(cup.name + " , " + cup.price);

	}

}
