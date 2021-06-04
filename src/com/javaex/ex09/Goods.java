package com.javaex.ex09;

public class Goods {

// 필드
	private String name;
	private int price;
	private static int count;

	


	// 생성자
	public Goods() {
		count++;
		}
	
	public Goods(String name, int price) {
		count++;
		this.name = name;
		this.price = price;
	}
	
	
	// 메소드 - Ge/Se
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	
	// 메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("Count: " + count);
		System.out.println();

	}
	
	
	

}
