package com.addressbook;

/*
@description: class to add multiple person,s
details
@parameters: defining a addNewPerson method to
create new person details
*/
import java.util.*;

public class AddressBook {

	public void addNewPerson() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First Name");
		String firstName = scanner.nextLine();
		System.out.println("Last Name");
		String lastName = scanner.nextLine();
		System.out.println("address");
		String address = scanner.nextLine();
		System.out.println("State");
		String state = scanner.nextLine();
		System.out.println("City");
		String city = scanner.nextLine();
		System.out.println("Zip");
		String zipCode = scanner.nextLine();
		System.out.println("Phone Number");
		long phoneNumber = scanner.nextLong();
		System.out.println("Email");
		String email = scanner.next();

		ContactInfo person = new ContactInfo( firstName, lastName , city,  state,  address,  email,  zipCode, phoneNumber);
		person.showPersonsDetails();
		System.out.println("new person details added");
	}


	public static void main(String args[]) {

		AddressBook addressBook = new AddressBook();
		addressBook.addNewPerson();

	}
}
