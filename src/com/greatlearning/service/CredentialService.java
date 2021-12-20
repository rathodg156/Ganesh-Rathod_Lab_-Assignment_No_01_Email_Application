package com.greatlearning.service;

import java.util.Random;

public class CredentialService {
	public String generateEmailAddess(String firstName , String lastName ,String department) {
		return firstName+lastName+"@"+department+".abc.com";
	}
	public String generatePassword(){
		String numbers = "1234567890";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacter = "!@#$%^&*()_+/*-:<>?";
		String values = numbers+smallLetters+specialCharacter+capitalLetter;
		Random random = new Random();
		char[] password = new char[8];
		for (int i=0; i<8;i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
			//(random.nextInt(values.length()))----> returns the random number 
			//from 0 to values.length() which is the size of the String.
			//charAt returns the character at the index.
		}
		return password.toString();
		
	}
	public void showcredentials(String email,String  password) {
		System.out.println("Your Genrated Credentials are");
		System.out.println("Email ---> "+email);
		System.out.println("Password---> "+password);
	}		

		
	}

