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
			String query="INSERT INTO book_details values('xyz'.'app')";
			statement.execute(query);
			
		}catch(SQLException e) {
			System.out.println("class is not connected");
			e.printStackTrace();
		}
	}

}
