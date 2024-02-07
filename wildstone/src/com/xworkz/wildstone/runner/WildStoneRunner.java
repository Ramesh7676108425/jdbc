package com.xworkz.wildstone.runner;

import java.sql.Connection;
import java.sql.DriverManager;

import com.xworkz.biscuit.constant.ConnectionData;
import com.xworkz.biscuit.dto.BiscuitDto;
import com.xworkz.biscuit.service.BiscuitService;
import com.xworkz.biscuit.service.BiscuitServiceImpl;

public class WildStoneRunner {
	
	public static void main(String[] args) {
		ConnectionData.URL.setValue("jdbc:mysql://localhost:3306/snacks_database");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("Xworkzodc@123");
		
		BiscuitDto dto=new BiscuitDto("Darck fantacy", 40, 12);
		BiscuitService service=new BiscuitServiceImpl();
		service.save(dto);
		
	}

}
