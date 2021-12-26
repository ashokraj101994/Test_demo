package com.greatlearning.model;

public class Employee {



public static  String firstName;
public static String lastName;

public Employee(String fn, String ln) {
	firstName = fn;
	lastName = ln;
}	

public static String getFirstName() {
	return firstName;
}

public static void setFirstName(String fn) {
	firstName = fn;
}
public static String getLastName() {
	return lastName;
}
public static void setLastName(String ln) {
	lastName = ln;
}
 
}






