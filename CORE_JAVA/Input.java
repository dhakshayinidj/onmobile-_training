package com.abc;

import java.util.Scanner;

public class Input {
      public static void main(String[] args)
      {
    	  Scanner input = new Scanner(System.in);
    	  
    	  //getting float input
    	  System.out.println("Enter float");
    	  float myFloat = input.nextFloat();
    	  System.out.println("Float entered = " + myFloat);
    	
    	  //getting doublt input
    	  System.out.println("Enter double:");
    	  double myDouble = input.nextDouble();
    	  System.out.println("Double entered = " +myDouble);
    	  
    	  //getting String input
    	  System.out.println("Enter text: ");;
    	  String myString = input.next();
    	  System.out.println("Text entered = " +myString);
      
      }
}
