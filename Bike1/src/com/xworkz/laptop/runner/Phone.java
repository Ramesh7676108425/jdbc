package com.xworkz.laptop.runner;

public class Phone {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
	
	}

}
