package com.quiz;
import java.sql.SQLException;

public class InsertData extends Questions {
	
	public void insertStudentDetails(int studentId, String studentName,int score) throws SQLException {
		
		try {
			
		ps = connection.prepareStatement("insert into student_details(Student_Id,Student_Name,Student_Score)values(?,?,?)");
		ps.setInt(1, studentId);
		ps.setString(2, studentName);
		ps.setInt(3,score);
		int i = ps.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
			} 
		finally {
			connection.close();
			ps.close();
			}}}






