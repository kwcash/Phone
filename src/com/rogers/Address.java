package com.rogers;

import java.io.Console;
import java.util.Scanner;
//state variables

public class Address {
		
	int streetNumber;
	String street;
	String city;
	String state;
	int zipCode;
	public Address(int streetNumber, String street, String city, String state, int zip) {
		super();
		this.streetNumber = streetNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	} 
		
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
		}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zipCode;
	}
	public void setZip(int zip) {
		this.zipCode = zipCode;
	}

	public String  setAddress()
	
	{
		Scanner addressScanner = new Scanner(System.in);
		String addressString="";
		
		System.out.println("Please enter your street number");
		streetNumber= Integer.parseInt(addressScanner.nextLine());
		System.out.println("Please enter your street name");
		street=addressScanner.nextLine();
		System.out.println("Please enter your City");
		city=addressScanner.nextLine();
		System.out.println("Please enter your State");
		state=addressScanner.nextLine();
		System.out.println("Please enter your Zip Code");
		zipCode=Integer.parseInt(addressScanner.nextLine());
		
		addressString=String.valueOf(streetNumber) + ", " + city + ", " + state + "String.valueOf(zipCode)";
		
		addressScanner.close();
		return addressString;
	 }
	
}
