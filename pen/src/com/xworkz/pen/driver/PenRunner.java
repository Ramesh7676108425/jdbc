package com.xworkz.pen.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.pen.constants.Constantpen;

public class PenRunner {
	
	public static void main(String[] args) {
		
		
		
		try(Connection connection=DriverManager.getConnection(Constantpen.URL.getValue()
				
				, Constantpen.USERNAME.getValue()
				
				, Constantpen.PASSWORD.getValue());
				
				Statement statement=connection.createStatement()){
			System.out.println("class is connected");
			String query="INSERT INTO pen_details values('xyz','1')";
			statement.execute(query);
			
		}catch(Exception e) {
			System.out.println("class is not connected ");
			e.printStackTrace();
			
		}
	}

}
