package com.javaex.ex08;

public class Tv {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	
	
	// 생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	// 메소드 - GS
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}

	
	// 메소드 - 일반
	
	// 전원
	public void power(boolean power) {
		if(power == true) {
			this.power = true;
		} else {
			this.power = false;
		}	
	}
	
	// 볼륨
	public void volume(int volume) {
		if(volume>100) {
			this.volume = 100;
		} else if(volume<0) {
			this.volume = 0;
		}
	}
	
	public void volume(boolean up) {
		if(up == true) {
			volume++;
		} else {
			volume--;
		}
	}
	
	//채널
	public void channer(int channel) {
		if(channel>255) {
			this.channel = 255; 
		} else if(channel<=0) {
			this.channel = 1;
		}
	}
	
	public void channer(boolean up) {
		if(up == true) {
			channel++;
		} else {
			channel--;
		}
	}
	
	
	
	//TV 정보 출력
	public void status() {
		if(power == true) {
			System.out.println("티비가 켜졌습니다.");
			System.out.println("현재 채널: " + this.channel);
			System.out.println("현재 볼륨: " + this.volume);
			System.out.println();
		} else {
			System.out.println("티비가 꺼졌습니다.");
			System.out.println();
		}		

	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
