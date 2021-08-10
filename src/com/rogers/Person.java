package com.rogers;

import java.util.Scanner;

public class Person {
	
	String firstName;
	String lastName;
	
	public Person(String firsName, String lastName) {
		super();
		this.firstName = firsName;
		this.lastName = lastName;
		
	}
	public String getFirsName() {
		return firstName;
	}
	public void setFirsName(String firsName) {
		this.firstName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String addPerson()
	{
	Scanner personScanner = new Scanner(System.in);
		String personString="";
		
		System.out.println("Please enter your first name");
		firstName= personScanner.nextLine();
		System.out.println("Please enter your last name");
		lastName=personScanner.nextLine();
		
		
		personString=firstName+", "+lastName;
		
		personScanner.close();
		return personString;
}
	

}
