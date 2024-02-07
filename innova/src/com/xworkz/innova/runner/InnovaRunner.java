package com.xworkz.innova.runner;

import com.xworkz.bag.constants.ConnectionData;
import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.service.BagService;
import com.xworkz.bag.service.BagServiceImpl;




public class InnovaRunner {
	public static void main(String[] args) {
		
		
		
		
		
		ConnectionData.URL.setValue("jdbc:mysql://localhost:3306/innova_database");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("Xworkzodc@123");
		
		BagService service=new BagServiceImpl();
		BagDto dto=new BagDto("Ameriacn tourister ", 2000, "black");
		service.save(dto);
		
		
		
	}
	}


