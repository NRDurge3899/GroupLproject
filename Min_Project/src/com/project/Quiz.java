package com.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz implements Login {
	 private static int  studentId;
	 private static  String studentName;


	public static  int getStudentId() {
		return studentId;
	}
	public  void setStudentId(int studentId) {
		studentId = studentId;
	}
	public static  String getStudentName() {
		return studentName;
	}
	public  void setStudentName(String studentName) {
		studentName = studentName;
	}
	PreparedStatement ps=null;
	ConnectionTest connectionTest=new ConnectionTest();
	Connection connection = connectionTest.getConnectionDetails();
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		@Override
		public void loginDetails() throws SQLException {
			System.out.println("Enter Your id:");
			 studentId =sc.nextInt();
		ps=connection.prepareStatement("select * from student_details");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		int sid=rs.getInt(1);
		if(studentId==sid) {
			
		try {
			throw new InvalidIdException("Please Enter valid Id");
			
		}
		catch(Exception e) {
			   e.printStackTrace();
			   System.exit(0);
		   }}
		}
		
		System.out.println("Enter Your Name");
		studentName=sc.next();
		try {
			
			Thread.sleep(500);
			System.out.println("Login Sucessfully");
			Thread.sleep(1000);
			System.out.println("Welcome to the Quiz");
			Thread.sleep(1500);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}}

