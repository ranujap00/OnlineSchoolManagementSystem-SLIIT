package com.school;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class schoolDBUtil {
	private static Connection con = null;
	//statements are used to execute static SQL queries
	private static Statement stmt = null;
	//Resultset is used to store the result after executing an SQL statement
	private static ResultSet rs = null;
	
	private static boolean isSuccess;
	
	public static List<Student> validateStudent(String username, String password){
		ArrayList<Student> stdArr = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//Fetch all data related to that user from the DB and display 
			String sql = "SELECT * FROM student WHERE username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String address = rs.getString(4);
				int phone = rs.getInt(5);
				int grade = rs.getInt(6);
				String uname = rs.getString(7);
				String pwd = rs.getString(8);
				
				Student std = new Student(id, name, age, address, phone, grade, uname, pwd);
				stdArr.add(std);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return stdArr;
	}
	
	public static List<Staff> validateStaff(String username, String password){
		ArrayList<Staff> staffArr = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//Fetch all data related to that user from the DB and display 
			String sql = "SELECT * FROM staff WHERE username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String NIC = rs.getString(4);
				String address = rs.getString(5);
				int phone = rs.getInt(6);
				String email = rs.getString(7);
				String role = rs.getString(8);
				double salary = rs.getDouble(9);
				String uname = rs.getString(10);
				String pwd = rs.getString(11);
				
				Staff staff = new Staff(id, name, age, address, phone, NIC, email, role, salary,  uname, pwd);
				staffArr.add(staff);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return staffArr;
	}
}
