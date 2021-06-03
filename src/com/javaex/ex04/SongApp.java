package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		//아이유 - 좋은날
		Song iu = new Song();
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("Real");
		iu.setComposer("이민수 작곡");
		iu.setYear(2010);
		iu.setTrack("3번 track");
		
		//빅뱅 - 거짓말
		Song bb = new Song();
		bb.setTitle("거짓말");
		bb.setArtist("BIGBANG");
		bb.setAlbum("Always");
		bb.setComposer("G-DRAGON 작곡");
		bb.setYear(2007);
		bb.setTrack("2번 track");
		
		
		
		//버스커버스커 - 벚꽃엔딩
		Song busker = new Song();
		busker.setTitle("벚꽃엔딩");
		busker.setArtist("버스커버스커");
		busker.setAlbum("버스커버스커 1집");
		busker.setComposer("장범준 작곡");
		busker.setYear(2012);
		busker.setTrack("4번 track");
		
		//showInfo 메소드
		iu.showInfo();
		bb.showInfo();
		busker.showInfo();
		
	}

}
