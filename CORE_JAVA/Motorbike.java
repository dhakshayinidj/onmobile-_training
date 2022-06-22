package com.abcd;



	abstract class MotorBike1 {
		  abstract void brake();
		}

		class SportsBike extends MotorBike1 {
		    
		  // implementation of abstract method
		  public void brake() {
		    System.out.println("SportsBike Brake");
		  }
		}

		class MountainBike extends MotorBike1{
		    
		  // implementation of abstract method
		  public void brake() {
		    System.out.println("MountainBike Brake");
		  }
		}

		class Motorbike {
		  public static void main(String[] args) {
		    MountainBike m1 = new MountainBike();
		    m1.brake();
		    SportsBike s1 = new SportsBike();
		    s1.brake();
		  }
		}
		


