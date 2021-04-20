package com.addressbook;

/*
program to create Address Book with person's details
like first_Name,last_Name,city,state,zip,phoneNumber
*/
import java.util.*;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("person details");
		ContactInfo c = new ContactInfo("rehan", "kumar", "banglore", "karnataka" , "btm 2nd stage", "rehansdm94@7594.com","560076", 821764632);
		c.showPersonsDetails();
	}
}