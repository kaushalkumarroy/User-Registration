package com.bridgelabz.userregistration;

import java.util.*;
import java.util.regex.Pattern;
public class userRegistrationMain {
	public static void main() {
		Scanner consoleInputReader = new Scanner(System.in);
		//UC1
		System.out.println("Enter First Name:");
		String name = consoleInputReader.next();
		String validFirstName = "^[A-Z] {3,}";
		boolean result  = Pattern.matches(validFirstName, name);
		if(result) {
			System.out.println("Valid name");
		}
		else {
			System.out.println("Invalid name.");
		}
	}
}
