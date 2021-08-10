package com.rogers;

import java.util.Scanner;

public class Number {

	int phoneNumber;
		public Number(int phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
		public int getPhoneNumber() {
		return phoneNumber;
	}
		public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public String addPhoneNumber()
	
	{
		String phoneNumberStr=" ";
		
		Scanner phoneScanner = new Scanner(System.in);
		phoneNumber = Integer.parseInt(phoneScanner.nextLine());
		
		phoneNumberStr=String.valueOf(phoneNumber);
		
		return phoneNumberStr;
		
	}
	
	
}
