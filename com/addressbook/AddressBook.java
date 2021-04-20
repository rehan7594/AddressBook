package com.addressbook;

/*
@description: class to add multiple person,s
details,edit person details using firstName
and delete person's details using their first name 
@parameters: defining a addNewPerson method to
create new person details and editPerson method to edit
person details using first person's first name
and delete the person using their first name
*/
import java.util.*;

public class AddressBook {

	private ArrayList<ContactInfo> data=new ArrayList<ContactInfo>();

	//method to read string value from user
	public String readString(String displayMessage){

		Scanner sc = new Scanner(System.in);
		System.out.println(displayMessage);
		String input=sc.nextLine();

		return input;
	}

	//method to read long data
	public long readLong(String displayMessage){

		Scanner sc = new Scanner(System.in);
		System.out.println(displayMessage);
		long input=sc.nextLong();

		return input;
	}

	//method to get index of person object in addressBook
	public int indexOfPerson(){
		System.out.println();
		String name=readString("Enter Person's name: ");


		int index=0;
		for(ContactInfo p : this.data)
		{
			if(p.getfirstName().equals(name) ){
				return index;
			}
			++index;
		}
		return -1;
	}

	//method to add person to address book
	public void addPerson(){

		System.out.println();
		String firstName=readString("Enter Person's first name: ");
		String lastName = readString("Enter person's last name");
		String city=readString("Enter where he/she lives first enter City: ");
		String state=readString("Now, enter State: ");
		String address=readString("Now, enter full address: ");
		String email=readString("Now, enter email: ");
		String zipCode=readString("At last enter, area's Zip Code: ");
		long phoneNumber=readLong("Enter his/her phone number: ");
		ContactInfo newEntry=new ContactInfo(firstName, lastName, city, state, address, email, zipCode, phoneNumber);

		this.data.add(newEntry);
		System.out.println(firstName+" added successfully to address book.");
	}

	//method to edit person details using first name
	public void editPerson(){

		int index=this.indexOfPerson();

		if(index != -1){
			String options="What you want to change. 1.firstName  2.lastName 3.city  4.state 5.address 6.Zip 7.email 8.PhoneNumber ";
			int choice=(int)readLong(options);

			switch(choice)
			{
			case 1: 
				this.data.get(index).setfirstName(readString("Enter new first name Code: "));
				System.out.println("Entry Modified");
				break;
			case 2: 
				this.data.get(index).setlastName(readString("Enter new first name Code: "));
				System.out.println("Entry Modified");
				break;
			case 3: 
				this.data.get(index).setCity(readString("Enter new City: "));
				System.out.println("Entry Modified");
				break;
			case 4: 
				this.data.get(index).setState(readString("Enter new State: "));
				System.out.println("Entry Modified");
				break;
			case 5: 
				this.data.get(index).setAddress(readString("Enter new Address: "));
				System.out.println("Entry Modified");
				break;
			case 6: 
				this.data.get(index).setZipCode(readString("Enter new Zip Code: "));
				System.out.println("Entry Modified");
				break;
			case 7: 
				this.data.get(index).setemail(readString("Enter new email : "));
				System.out.println("Entry Modified");
				break;
			case 8: 
				this.data.get(index).setPhoneNumber(readLong("Enter new Phone number: "));
				System.out.println("Entry Modified");
				break;
			default:
				System.out.println("invalid Input!");
			}
		}
		else{

			System.out.println("No such person found!");
		}
	}

	//method to delete person using their first name
	public void deletePerson(){

		int index=this.indexOfPerson();

		if(index != -1){

			ContactInfo p=this.data.remove(index);
			System.out.println("Person "+p.getfirstName()+" removed successfully.");
		}
		else{

			System.out.println("No one with these details found!");
		}
	}

	//method to show person details
	public void showPerson(){

		int index=this.indexOfPerson();

		if(index != -1){

			this.data.get(index).showPersonsDetails();
		}
		else{

			System.out.println("No one with these details found!");
		}
	}

	//method to select which operation we want to do in address book
	public void runMenu(){

		long choice=-1;
		while(choice != 0)
		{
			System.out.println();

			System.out.println("| 1. Add a person");
			System.out.println("| 2. Edit a person");
			System.out.println("| 3. Show a person");
			System.out.println("| 4. delete a person");
			System.out.println("| 5. Exit");

			choice=readLong("Enter your choice: ");

			switch((int)choice)
			{
			case 1: addPerson();
			break;
			case 2: editPerson();
			break;
			case 3: showPerson();
			break;
			case 4: deletePerson();
			break;
			case 5: choice = 0;
			break;
			default: System.out.println("invalid Input!");
			}
		}
	}

	public static void main(String[] args) {
		AddressBook newBook=new AddressBook();
		newBook.runMenu();
	}

}