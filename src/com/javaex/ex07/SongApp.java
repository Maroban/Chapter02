package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		// 생성자 1
		Song iu = new Song();
		
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("Real");
		iu.setComposer("이민수 작곡");
		iu.setYear(2010);
		iu.setTrack(3);
		
		iu.showInfo();
		
		// 생성자 2
		Song bb = new Song("거짓말", "BIGBANG", "Always");
		
		bb.setComposer("G-DRAGON 작곡");
		bb.setYear(2007);
		bb.setTrack(2);
		
		bb.showInfo();
		
		// 생성자 3
		Song busker = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커 1집", "장범준 작곡", 2012, 4);
		
		busker.showInfo();
		
	}

}
