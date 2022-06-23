package com.xyz;


	import java.time.Period;
	public class Enum3 {

	   public static void main(String[] args)
	   {
	       //Here is the age String in format to  parse
	       String age = "P17Y9M5D";

	       // Converting strings into period value
	       // using parse() method
	       Period p = Period.parse(age);
	       System.out.println("the age is: ");
	       System.out.println(p.getYears() + " Years\n"
	                          + p.getMonths() + " Months\n"
	                          + p.getDays() + " Days\n");
	   }
	}
	
