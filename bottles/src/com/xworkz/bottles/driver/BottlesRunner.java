package com.xworkz.bottles.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.bottles.constants.Constantbottles;

public class BottlesRunner {
	
	public static void main(String[] args) {
		
		
		
		
		try(Connection connection=DriverManager.getConnection(Constantbottles.URL.getValue()
				,  Constantbottles.USERNAME.getValue(),Constantbottles.PASSWORD.getValue());
				
				  Statement statement=connection.createStatement()){
			System.out.println("connected successfully");
			
			String query="INSERT INTO bottles_details values('qqqq','pppp')";
			statement.execute(query);
			
		}catch(Exception e) {
			System.out.println("not connected successfully");
			e.printStackTrace();
			
		}
	}

}
