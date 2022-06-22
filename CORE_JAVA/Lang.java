package com.abcd;


	abstract class Language {

		  // method of abstract class
		  public void display() {
		    System.out.println("This is Java Programming");
		  }
		}

		class Lang extends Language {

		  public static void main(String[] args) {
		    
		    // create an object of Main
		    Lang obj = new Lang();

		    // access method of abstract class
		    // using object of Main class
		    obj.display();
		  }
		}


