package com.xworkz.pen.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.xworkz.pen.constants.Constantpen;

public class PenRunner {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(Constantpen.URL.getValue()

				, Constantpen.USERNAME.getValue()

				, Constantpen.PASSWORD.getValue());

				Statement statement = connection.createStatement()) {
			System.out.println("class is connected");
			String query = "INSERT INTO pen_details  (name,cost)values('abcd',10),('luna quill',20),('orion ',30),('maverik quill',40),"
					+ "('nebula nom de plume',50),('ballpoint',60),('gel pen',70),('highlighter',80),('marker pen',100),('red pen',120),('black pen',130),('blue pen',150)"
					
				;
			statement.execute(query);

		} catch (Exception e) {
			System.out.println("class is not connected ");
			e.printStackTrace();

		}
	}

}
