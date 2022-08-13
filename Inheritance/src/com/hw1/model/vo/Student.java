package com.hw1.model.vo;

public class Student extends Person {

	// 鞘靛何
	private int grade;
	private String major;
	
	
	// 积己磊何
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.setName(name);
		this.grade = grade;
		this.major = major;
	}
	
	
	// 皋家靛何
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", grade : " + grade + ", major : " + major;
	}
	
}
