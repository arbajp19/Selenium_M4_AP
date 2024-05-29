package com.shoppersStack.genericutility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_utility {
	public int generateRandomNumber() {
		Random r=new Random();
		return r.nextInt(1000);
	}
	public String localDate() {
		return LocalDate.now().toString().replace("-","");
	}
	
	public String localDateTime() {
		return LocalDateTime.now().toString().replace("-","").replace(".","").replace(":","");
	}
}