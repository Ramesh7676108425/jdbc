package com.xworkz.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.book.constants.ConstantBook;

public class BookRunner1 {
	
	public static void main(String[] args) {
		
		
	try	(Connection connection=DriverManager.getConnection(ConstantBook.URL.getValue(), ConstantBook.USERNAME.getValue(),
				ConstantBook.PASSWORD.getValue());
			Statement statement=connection.createStatement()){
		System.out.println("successfully connected");
//		String query="INSERT INTO  book_info  values ('satamana',250)";
//		statement.execute(query);
		String query1="UPDATE  book_info set name='mukuta' where name='satamana'";
		int reff=statement.executeUpdate(query1);
//		if(reff==1) {
//			System.out.println("updated successfully");
//		}else {
//			System.out.println("not updated successfully");
//		}
		
		
		
	}catch(SQLException e) {
		System.out.println("not connected successfully ");
		e.printStackTrace();
		
	}
	}

}
