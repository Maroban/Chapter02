package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		
		// Sutdent 클래스
		Student s00 = new Student();
		s00.setName("정우성");
		s00.setAge(45);
		s00.setSchoolName("서울고등학교");
		
		/*
		System.out.println(s00.getName());
		System.out.println(s00.getAge());
		System.out.println(s00.getSchoolName());
		
		System.out.println(s00.toString());
		*/
		
		s00.showInfo();
	}

}
			