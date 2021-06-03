package com.javaex.ex05;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();  // 생성자 호출(디폴트 생성자 사용)
		// 디폴트 생성자가 없으면 오류가 난다.
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		Goods computer = new Goods("그램", 1000000);  // 디폴트 생성자가 아닌 다른 생성자 사용.
		// setName, setPrice를 사용 안하고 생성자를 사용해 값을 넣은 것.
		// 이러면 되는데 굳이 setName, setPrice를 만든 이유는 수정할 때 필요하기 때문이다.
		computer.showInfo();
		
		
	}
}
