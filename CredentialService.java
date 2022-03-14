package com.greatlearning.service;

import java.util.Random;

public class CredentialService {
	
	public char[] generatePassword() {
	
	       String capitalLetters="abcdefghijklmnopqrstuvwxyz";
	       String smallLetters="abcdefghijklmnopqrstuvwxyz";
	       String numbers="0123456789";
	       String specialCharacters="!@#$%^&*_=+-/.?<>";
	
	
	       String values = capitalLetters + smallLetters + numbers +specialCharacters ;
	
	      //Using random method
	      Random random = new Random();
	      
	      char[] password = new char[8];
	      
	      for(int i=0; i < 8; i++) {
	    	  //Use of charAt()	method : to get character value
	    	  //Use of nextInt() as it is scanning the value as int
	    	  password[i] = values.charAt(random.nextInt(values.length()));
	    	  
	      }
	      return password;
	}
	
	public String generateEmailAddress(String firstName,String lastName,String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee,String email,char[] generatePassword) {
	    System.out.println("Dear "+employee.getfirstName()+"your generated credentials are as follows ");
	    System.out.println("email --> "+email);
	    System.out.println("password --> 1"
	    		+ "")
	    System.out.print(generatePassword);
	}
	
