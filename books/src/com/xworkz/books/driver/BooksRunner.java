package com.xworkz.books.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.books.constants.ConstantBooks;

public class BooksRunner {
	
	public static void main(String[] args) {
		
		
		
		try(Connection connection=DriverManager.getConnection(ConstantBooks.URL.getValue()
				, ConstantBooks.USERNAME.getValue(), ConstantBooks.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
			System.out.println("class is connected");
			String query="INSERT INTO books1_details(name,cost) values('xyz',99),('sooryakanthi',100),('siriya nadige',150),('mavana jathi',170),"
					+ "('kannada naadu',200),('nenneya soorya',300),('noorane nota' ,300),('saakyageethe',250),('unnatavagali',220),('naakula',120),('hakki haru',80),('puthana',550),('nodada mana',250),('avalokana',600)";
			
			statement.execute(query);
			
		}catch(SQLException e) {
			System.out.println("class is not connected");
			e.printStackTrace();
		}
	}

}
