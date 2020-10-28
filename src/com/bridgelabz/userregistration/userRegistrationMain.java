package com.bridgelabz.userregistration;

import java.util.*;
import java.util.regex.Pattern;
public class userRegistrationMain {
	public static void main(String[] args) {
		Scanner consoleInputReader = new Scanner(System.in);
		//UC1
		System.out.println("Enter First Name:");
		String name = consoleInputReader.next();
		String validFirstName = "^[A-Z][a-zA-Z]+{2}";
		boolean result  = Pattern.matches(validFirstName, name);
		if(result) {
			System.out.println("Valid name");
		}
		else {
			System.out.println("Invalid name.");
		}
		
		//UC2
		System.out.println("Enter Last Name:");
		String lastName = consoleInputReader.next();
		String validLastName = "^[A-Z][a-zA-Z]+{2}";
		boolean result1  = Pattern.matches(validFirstName, name);
		if(result1) {
			System.out.println("Valid name");
		}
		else {
			System.out.println("Invalid name.");
		}
		
		if(result && result1){
			System.out.println("User's Name is: " + name + " " + lastName);
		}
		else {
			System.out.println("Either first name or last name is invalid");
		}
	}
}
