package com.xworkz.Bike1.runner22;

import java.sql.Connection;
import java.sql.DriverManager;

public class LaptopRunner {
	
	
	public static void main(String[] args) {
		
		
		

		String url="jdbc:mysql://localhost:3306/Bike1_database";
		String userName="root";
		String password="Xworkzodc@123";
		{
		
		
		
		try(Connection connection=DriverManager.getConnection(url, userName, password)){
			if(connection!=null) {
				System.out.println("connection are success");
			}else {
				System.out.println("not connected successfully");
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	
		}
}

	}


