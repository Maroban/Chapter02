package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
		// 디폴트 생성자 사용
		Student s00 = new Student();
		s00.setName("정우성");
		s00.setAge(45);
		s00.setSchoolName("서울고등학교");
				
		s00.showInfo();
		
		/*
		// Student 생성자(this) 사용
		Student s01 = new Student("이효리", 40);
		s01.setSchoolName("강남고등학교");
		
		s01.showInfo();
				
		// Student 생성자(super(값)) 사용
		Student s02 = new Student("유재석", 50, "경기고등학교");
		
		s02.showInfo();
		*/
		
		// 부모의 디폴트 생성자(super()) 사용  => 부모의 디폴트 생성자가 없으면 super() 사용 불가
		Student s03 = new Student("유재석", 50, "경기고등학교");
		
		s03.showInfo();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
			