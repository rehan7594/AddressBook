package com.addressbook;
import java.util.*;
import java.io.*;

public class ContactInfo{

	// Class-variable declarations
	private String firstName, lastName, city, state, address, email,zipCode;
	private long phoneNumber;

	public ContactInfo(String firstName, String lastName , String city, String state, String address, String email, String zipCode, long phoneNumber){

		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.address = address;
		this.email = email;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}

	// Methods for modifying class-variables

	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setState(String state){
		this.state = state;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setemail(String email){
		this.email = email;
	}
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	// Methods for displaying class-variables
	public String getfirstName(){
		return this.firstName;
	}
	public String getlastName(){
		return this.lastName;
	}
	public String getCity(){
		return this.city;
	}
	public String getState(){
		return this.state;
	}
	public String getAddress(){
		return this.address;
	}
	public String getemail(){
		return this.email;
	}
	public String getZipCode(){
		return this.zipCode;
	}
	public long getPhoneNumber(){
		return this.phoneNumber;
	}
	public void showPersonsDetails(){


		System.out.println("First name :: "+ this.getfirstName());
		System.out.println("Last  name :: "+ this.getlastName());
		System.out.println("Phone Number :: "+ this.getPhoneNumber());
		System.out.println("City :: " + this.getCity());
		System.out.println("State :: "+ this.getState());
		System.out.println("Address :: "+ this.getAddress());
		System.out.println("Address :: "+ this.getemail());
		System.out.println("Zip Code :: "+ this.getZipCode());
	}


}