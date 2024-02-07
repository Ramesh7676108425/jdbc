package com.xworkz.nike.runner;

import com.xworkz.bluetooth.constants.ConnectionData;
import com.xworkz.bluetooth.dto.BluetoothDto;
import com.xworkz.bluetooth.service.BluetoothService;
import com.xworkz.bluetooth.service.BluetoothServiceImpl;

public class NikeRunner {
	
	public static void main(String[] args) {
		
		ConnectionData.URL.setValue("jdbc:mysql://localhost:3306/nike_database");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("Xworkzodc@123");
		
		
	BluetoothService service=new BluetoothServiceImpl();
	BluetoothDto dto = new BluetoothDto("boult", "blue", 2000);
	service.save(dto);
	
		
		
	}

}
