package com.javaex.ex22;

import java.io.IOException;

public class MyApp {

	public static void main(String[] args) {
		
		// 파일이 있을 때
		FileReader fr = new  FileReader();
		fr.Read("C:/school.text");
		
		
		// 파일이 없을 때
		fr.Read2("C:/school.text");
		
		
		// 예외발생
		try {
			fr.Read3("C:/school.text");
		} catch (IOException e) {
			System.out.println("*********** 파일이 없습니다. ***********");
		}
		
		
	}

}
