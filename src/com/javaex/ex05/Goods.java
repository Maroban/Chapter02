package com.javaex.ex05;

public class Goods {

	// 필드
	private String name;
	private int price;
	
	
	// 생성자
	public Goods() {
		// Goods를 메모리(힙)에 올리는 것이 목적
	}
	
	public Goods(String name, int price) { // 이것만 사용하면 name, price에 저장이 안된다.
		this.name = name;  // 그래서 이렇게 저장하겠다~ 하는 문법을 넣어줘야 저장이 된다.
		this.price = price; 
	}
	
	// 메소드 - GS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	// 메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println();
	}
	
	
	
}
