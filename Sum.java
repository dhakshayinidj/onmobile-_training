package com.abc;

public class Sum {

	public static void main(String[] args) {
		  
		   // an array of numbers
		   int[] numbers = {3, 10, 30, -5, 0, 14, 27, 80, 100,2335775};
		   int sum = 0;

		   // iterating through each element of the array 
		   for (int number: numbers) {
		     sum += number;
		   }
		  
		   System.out.println("Sum = " + sum);
		 }

}
