package com.javaex.ex22;

import java.io.IOException;

public class FileReader {

	// 필드
	
	
	// 생성자
	
	
	// 메소드 - GS
	
	
	// 메소드 - 일반
	
	// 정상 메소드
	public void Read(String path) {
		String file = "학교 종이 땡땡땡 어서 모이자~ 선생님이 우리를 기다리신다.";
		System.out.println(file);
	}
	
	
	
	// 예외발생 메소드
	public void Read2(String path) {
		// 파일이 없는 경우
		try {
			throw new IOException();  // 파일이 없다.
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
	}
	// 예외발생 처리
	public void Read3(String path) throws IOException { // 예외가 됐을 때 코드 실행한 얘한테 던진다.
		throw new IOException();  // 파일이 없다.
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
