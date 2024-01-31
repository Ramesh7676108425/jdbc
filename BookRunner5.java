package com.xworkz.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.book.constants.ConstantBook;

public class BookRunner5 {
	
	public static void main(String[] args) {
		
		
		

		try	(Connection connection=DriverManager.getConnection(ConstantBook.URL.getValue(), ConstantBook.USERNAME.getValue(),
					ConstantBook.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
			System.out.println("successfully connected");
			String query="INSERT INTO  book_info  values ('poorana',350)";
			statement.execute(query);
			String query2="UPDATE  book_info set name='nagamangala' where name='poorana'";
			int rrs=statement.executeUpdate(query2);
			
			
			
			
		}catch(SQLException e) {
			System.out.println("not connected successfully ");
			e.printStackTrace();
			
		}
		}
	}


