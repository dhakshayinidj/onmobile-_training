package com.xyz;


	abstract class Language {

		  // method of abstract class
		  public void display() {
		    System.out.println("This is Java Programming");
		  }
		}

		class Abstracttest extends Language {

		  public static void main(String[] args) {
		    
		    // create an object of Main
		    Abstracttest obj = new Abstracttest();

		    // access method of abstract class
		    // using object of Main class
		    obj.display();
		  }
		}




