package com.xworkz.laptop.runner;

public class School {
	
	public static void main(String[] args) {
		
		

		try {
			
	Class.forName("com.mysql.cj.jdbc.Driver");	
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	}

}
