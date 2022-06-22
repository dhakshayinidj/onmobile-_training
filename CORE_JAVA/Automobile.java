package com.abc;

	public class Automobile 
	{
		 String name;
		String Brand;
		String color;
		String Vehiclenumber;
	    int  Modelnumber;	

	    Automobile(String a, String b, String c, int d)
	    {
	    	name = a;
	    	Brand =b;
	    	color = c;
	    	Modelnumber =d;
	    }

	public static void main(String[] args)
	{
		Automobile v = new Automobile("Car","Kia seltos", "Black", 456);
		
		System.out.println("Automobile details : ");
		System.out.println("VehicleType :" + v.name);
		System.out.println("Brand :"+v.Brand);
		System.out.println("Color:"+v.color);
		
	}
	}

