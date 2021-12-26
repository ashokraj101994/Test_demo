package com.greatlearning.service;
import java.util.Random;



public class CredentialServices {

public static String generateEmailAddress(String firstName, String lastName, String Department) {
 
	return firstName + lastName + "@" + Department + ".abc.com";
} 
CredentialServices cred = new CredentialServices();
public static String generatePassword(){
	String numbers = "1234567890";
	String smallLetter = "abcdefghijklmnopqrstuvwxyz";
	String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String Specials = "!@#$%^&*()";
	String ans = numbers+smallLetter+Specials+capitalLetter;
	Random random = new Random();
	char[] password = new char[8];
	for(int i=0;i<8;i++) {
		password[i] = ans.charAt(random.nextInt(ans.length()));
		
	}
	return password.toString();
	
}
 public static void showCredentials() {
	 String Password = CredentialServices.generatePassword();
	 System.out.println("password----> " + Password);
 }

 
	
}
