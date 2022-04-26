package com.school;

public class Student extends User{
	private int sid;
	private int grade;
	
	public Student(int sid, String name, int age, String address, int phone, int grade, String username, String password) {
		super(name, age, address, phone, username, password);
		
		this.grade = grade;
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public int getGrade() {
		return grade;
	}
	
}