package com.xyz;


	class GenericsClass <T extends Number> {

		  public void display() {
		    System.out.println("This is a bounded type generics class.");
		  }
		}

		class Generics {
		  public static void main(String[] args) {

		    // create an object of GenericsClass
		    GenericsClass<String> obj = new GenericsClass<>();
		  }
		}


