package com.xworkz.pen.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.pen.constants.Constantpen;

public class PenRunner2 {
	
	public static void main(String[] args) {
		
		
		try (Connection connection = DriverManager.getConnection(Constantpen.URL.getValue()

				, Constantpen.USERNAME.getValue()

				, Constantpen.PASSWORD.getValue());

				Statement statement = connection.createStatement()) {
			System.out.println("class is connected");
			
			//String query="INSERT INTO   pen_details  values('black',15)";
			//statement.execute(query);
			
			String query1="UPDATE   pen_details  set name='red' where name='black'";
			int t=statement.executeUpdate(query1);
			
		} catch (Exception e) {
			System.out.println("class is not connected ");
			e.printStackTrace();

		}
	}

}
