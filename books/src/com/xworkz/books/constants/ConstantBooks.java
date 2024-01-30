package com.xworkz.books.constants;

public enum ConstantBooks {
	
	URL("jdbc:mysql://localhost:3306/Books"),
	USERNAME("root"),
	PASSWORD("Xworkzodc@123");
	
	
	private String value;

	ConstantBooks(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	
	

}
