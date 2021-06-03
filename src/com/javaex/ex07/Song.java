package com.javaex.ex07;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// 생성자
	public Song() {
		
	}
	
	public Song(String title, int track) {
		this.title = title;
		if(track<0) {              // 이 코드가 좋아서 다른 곳에 사용하려고  
			this.track = 0;		   // Ctrl + V 할 경우 원본 코드가 수정이 되면 똑같이 수정해야 한다.  
		} else {				   // 그래서 나온 것이 this() 다.
			this.track = track;	   // this()를 사용하면 원본 코드의 수정만 되면 같이 수정이 된다.
		}
	}
	
	public Song(String title, String artist, String album) {
		this.title = title;
		this.artist = artist;
		this.album = album;
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, track);		// this() 사용법은 () 안에 사용하고자 한 코드의 변수 명을 넣으면 된다.
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	
	
	
	// 메소드 - GS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드 - 일반
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track +"번 track, " + composer + " )");
	}

}
