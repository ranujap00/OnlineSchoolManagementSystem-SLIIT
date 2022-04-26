package com.school;

public class Staff extends User{
	private String NIC;
	private String email;
	private int staffID;
	private String role;
	private double salary;
	
	public Staff(int staffID, String name, int age, String address, int phone, String NIC, String email, String role, double salary, String username, String password) {
		super(name, age, address, phone, username, password);
		this.NIC = NIC;
		this.email = email;
		this.staffID = staffID;
		this.role = role;
		this.salary = salary;
	}

	public String getNIC() {
		return NIC;
	}

	public String getEmail() {
		return email;
	}

	public int getStaffID() {
		return staffID;
	}

	public String getRole() {
		return role;
	}

	public double getSalary() {
		return salary;
	}
}

