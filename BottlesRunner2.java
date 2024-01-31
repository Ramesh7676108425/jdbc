package com.xworkz.bottles.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.bottles.constants.Constantbottles;

public class BottlesRunner2 {
	
	public static void main(String[] args) {
		
		
		try(Connection connection=DriverManager.getConnection(Constantbottles.URL.getValue()
				,  Constantbottles.USERNAME.getValue(),Constantbottles.PASSWORD.getValue());
				
				  Statement statement=connection.createStatement()){
			System.out.println("connected successfully");
			
			String query="INSERT INTO bottles_details values('llll','122')";
			
			statement.execute(query);
			String query1="UPDATE bottles_details set  name='rrr' where name='llll'";
			int r=statement.executeUpdate(query1);
			
		}catch(Exception e) {
			System.out.println("not connected successfully");
			e.printStackTrace();
			
		}
	}

}
