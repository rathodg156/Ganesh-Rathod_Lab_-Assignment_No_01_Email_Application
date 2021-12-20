package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {
	  public static Employee employee=new Employee("Ganesh", "Rathod");
	  public static Scanner scanner = new Scanner(System.in);
	  public static	CredentialService credentialService = new CredentialService();
	  
	public static void main(String[] args) {
        //S1. Print hello world -->
		//S2.Create a data model Employee with firstname and lastname in package model with class name Employee 
		//Use parametrized constructor of class Employee, to pass firstName,lastName
		//Create getter and setters manually.
		//S3.Display the Menu
		//1.Technical
		//2.Admin
		//3.Human Resource
		//4.Legal
		//S4.Create a scanner object and take input on the displayed options from the menu
		//S5.Create an Employee object.. can hardcode the firstname and lastname.
		//S6.Create Switch case , based on userInput , print "Chooosen option is technical"
		//S7.Create a CredentialService in service package
		//S8.Create 3 methods generateEmailaddress,generateRandomPassword,showCredentials
		//S9.Complete the create methods
         
		//Scanner scanner =new Scanner(System.in);
		displayMenu();
		int userChoice = scanner.nextInt();
		//Technical(tech),Admin(adm),Human Resource (hr),Legal(lg)
		String emailAddress = "";
		String password ="";
		switch (userChoice) {
		case 1: emailAddress = credentialService.generateEmailAddess(employee.getfirstName(), 
				employee.getlastName(), "tech");
				password = credentialService.generatePassword();
				credentialService.showcredentials(emailAddress, password);
			break;
		case 2: emailAddress =  credentialService.generateEmailAddess(employee.getfirstName(), 
				employee.getlastName(), "adm");
		 		password = credentialService.generatePassword();
				credentialService.showcredentials(emailAddress, password);

			break;
		case 3:  emailAddress = credentialService.generateEmailAddess(employee.getfirstName(), 
				employee.getlastName(), "hr");
				password = credentialService.generatePassword();
				credentialService.showcredentials(emailAddress, password);

			break;
		case 4: emailAddress =  credentialService.generateEmailAddess(employee.getfirstName(), 
				employee.getlastName(), "lg");
				password = credentialService.generatePassword();
				credentialService.showcredentials(emailAddress, password);


			break;
		default:
			System.out.println("Invalid Option Chosen");		
		}
		//System.out.println(emailAddress);
		//System.out.println(password);
	}
	private static void displayMenu() {
		System.out.println("Please enter the department from the Following ");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
	}

}
