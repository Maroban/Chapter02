package com.javaex.ex14;

public class Student extends Person {

	// 필드
	private String schoolName;

	// 생성자

	public Student() {

	}

	/*
	// this 사용
	public Student(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	 super(값) 사용
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	*/
	
	// super(디폴트) 사용
	public Student(String name, int age, String schoolName) {
		super();
		super.setName(name);  // 이름이 겹치지 않으니 setName(name)이라고만 해줘도 인식한다.
		super.setAge(age);
		this.schoolName = schoolName;  // 이름이 겹치지 않으니 schoolName 이라고만 해줘도 인식한다.
	}
	
	
	// 메소드 - GS

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 테스트 출력
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + " name=" + getName() + " age=" + getAge() + "]";
	}

	// 메소드 - 일반

	public void showInfo() {
		System.out.println("======================================");
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("학교: " + schoolName);
		System.out.println("======================================");
	}

}
