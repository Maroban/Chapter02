package com.javaex.ex13;

public class Student extends Person {

	// 필드
	private String schoolName;

	// 생성자

	public Student() {

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
		return "Student [schoolName=" + schoolName + " name=" + getName() + "]";
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
