package com.grealearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
	
		Employee employee = new Employee("Harshit", "choudhary");
		CredentialService cs = new CredentialService();
		String generateEmail;
		char[]generatePassword;
		
		System.out.println("please enter the department from the following");
		System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4.Legal");
        
        Scanner sc = new Scanner(System.in);
        int option =sc.nextInt();
        
        if (option==1) {
           generateEmail=cs.generatweEmailAddress(employee.getFirstName().toLowerCase(),
        		   employee.getLastName().toLowerCase(),"tech");
           generatePassword = cs.generatePassword();
           cs.showCredentials(employee,generatedEmail, generatedPassword);
       }

      else if (option== 2) {
       generateEmail=cs.generatweEmailAddress(employee.getFirstName().toLowerCase(),
    		   employee.getLastName().toLowerCase(),"adm");
       generatePassword = cs.generatePassword();
       cs.showCredentials(employee,generatedEmail, generatedPassword);
    }
      else if (option== 3) {
        generateEmail=cs.generatweEmailAddress(employee.getFirstName().toLowerCase(),
     		   employee.getLastName().toLowerCase(),"Hr");
        generatePassword = cs.generatePassword();
        cs.showCredentials(employee,generatedEmail, generatedPassword);
     }
      else if (option== 4) {
         generateEmail=cs.generatweEmailAddress(employee.getFirstName().toLowerCase(),
      		   employee.getLastName().toLowerCase(),"le");
         generatePassword = cs.generatePassword();
         cs.showCredentials(employee,generatedEmail, generatedPassword);
          
         else
        	 System.out.println("enter a valid option");
         sc.close();
          
      
      }
