package com.xyz;


	enum Size {
		 SMALL, MEDIUM, LARGE, EXTRALARGE
		}

		class Enum1 {
		 Size pizzaSize;
		 public void Test(Size pizzaSize) {
		   this.pizzaSize = pizzaSize;
		 }
		 public void orderPizza() {
		   switch(pizzaSize) {
		     case SMALL:
		       System.out.println("I ordered a small size pizza.");
		       break;
		     case MEDIUM:
		       System.out.println("I ordered a medium size pizza.");
		       break;
		     default:
		       System.out.println("I don't know which one to order.");
		       break;
		   }
		 }
		}
