package com.project;
import java.sql.SQLException;
import com.quiz.InsertData;


public class TestClass extends InsertData{
	public static void getTest () throws SQLException {
		TestClass test=new TestClass();
		test.loginDetails();
		test.getQuiz();
		test.insertStudentDetails(getStudentId(),getStudentName(),score);

	}}
