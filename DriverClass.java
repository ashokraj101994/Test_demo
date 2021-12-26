package com.greatlearning.main;
import com.greatlearning.service.CredentialServices;
import java.util.Scanner;
import com.greatlearning.model.Employee;

public class DriverClass {
public static Scanner in = new Scanner(System.in);
		public static void main(String[] args) {
			Employee employee = new Employee("sujith","kumar");
			displaymenu();
			int num = in.nextInt();
			switch(num) {
		case 1: System.out.println("Dear Sujith your generated credentials are as follows");
		        System.out.println("");
			    System.out.println("Email----> " + CredentialServices.generateEmailAddress(Employee.getFirstName(), Employee.getLastName(), "tech")); break;     
	    case 2: System.out.println("Dear Sujith your generated credentials are as follows");
	            System.out.println("");
	            System.out.println("Email----> " + CredentialServices.generateEmailAddress(Employee.getFirstName(), Employee.getLastName(), "hr")); break;
		case 3: System.out.println("");
			    System.out.println("Dear Sujith your generated credentials are as follows");
			    System.out.println("Email----> " + CredentialServices.generateEmailAddress(Employee.getFirstName(), Employee.getLastName(), "admin"));break;
		case 4: System.out.println("Dear Sujith your generated credentials are as follows");
		        System.out.println("");
		        System.out.println("Email----> " + CredentialServices.generateEmailAddress(Employee.getFirstName(), Employee.getLastName(), "legal"));break;
	    default : System.out.println("Invalid choice");
	    
}
			CredentialServices.showCredentials();
		}
	
		public static void displaymenu() {
			System.out.println("please choose a department");
			System.out.println("");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.Human Resources");
			System.out.println("4.Legal");
			System.out.println("");
			
			
	}


}
