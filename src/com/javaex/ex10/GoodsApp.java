package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[3];
		System.out.println(goodsArray.length);
		
		int count = 0;
		
		Goods camera = new Goods("캐논", 450000);
		Goods computer = new Goods("LG그램", 2500000);
		
		/*
		camera.showInfo();  // 이런식으로 하면 1000개 출력할 때 1000번 써야한다.
		computer.showInfo();
		*/
		
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		
		System.out.println(camera.getName());
		System.out.println(goodsArray[0].getName());
		
		
		// 카운터 세는 배열
		for (int i = 0; i < goodsArray.length; i++) {  // 배열로 하면 1000개 출력할 때 i만 넣으면 해결된다.
			if (goodsArray[i] != null) { // 배열의 주소가 있으면 실행해라.(아직 배우지 않음)
				count++;
				goodsArray[i].showInfo();
			}
		}
		
		System.out.println(count+"개");
		
		
		
		
		
		
		
	}

}
