package com.xworkz.bottles.constants;

public enum Constantbottles {
	
	
	
	URL("jdbc:mysql://localhost:3306/bottles"),
	USERNAME("root"),
	PASSWORD("xworkzodc@123");
	
	
	private String value;

Constantbottles(String value) {
	this.value=value;
}
public String getValue() {
	return value;
}




}
