package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램", 1000000);
		computer.showInfo();
		
		Goods camera = new Goods();
		camera.setName("캐논");
		camera.setPrice(420000);
		camera.showInfo();
		
		Goods cup = new Goods("머그컵", 2000);
		cup.showInfo();		
		
		

	}

}
