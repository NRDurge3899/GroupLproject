package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import com.project.ConnectionTest;
import com.project.Quiz;



public class Questions extends Quiz{
	public static int score;

	PreparedStatement ps=null;
	ConnectionTest connectionTest=new ConnectionTest();
	Connection connection = connectionTest.getConnectionDetails();
		Scanner sc=new Scanner(System.in);
		
public void getQuiz() {
		LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();
		
		try {
			
			 ps=connection.prepareStatement("select * from questions");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
			String Question=rs.getString(2);
		    
		    String Answer=rs.getString(3);
		    
			map.put(Question,Answer);
			
			}

			
			Set<String>s=map.keySet();
			
	        for( String i:s) {
	        	
				System.out.println(i);
				String ans = map.get(i);
		      System.out.println("choose answer");
			String input=sc.next();
			 Thread.sleep(500);
			if(input.equalsIgnoreCase(ans)) {
				System.out.println("Correct answer");
				score++;
	        }
				else
			System.out.println("Wrong Answer...\nCorrect Option is>> "+ans );
			 Thread.sleep(1000);
			}
			System.out.println("Your score is:"+score);
			if(score>=8 && score==10) {
				System.out.println("Class A");
				}
			else if(score>=6 && score==10) {
				System.out.println("Class B");
				}
			else if(score==5) {
				System.out.println("Class C");
				}
			else
				System.out.println("Class D");
			
			rs.close();
			System.out.println("Submitted Successfully");
			}
			
			catch(Exception e) {
			e.printStackTrace();
			}
			
			}



	}


