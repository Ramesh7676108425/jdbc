package com.xworkz.Bike1.runner;

public class Bike1Name {
	
	
	public static void main(String[] args) {
		
		try {
			
	Class.forName("com.mysql.cj.jdbc.driver");	
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
		
	}

}
