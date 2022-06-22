package com.abc;


class Student
{
	private int Studentid = 27;
	private String Name = "Dakshayini";
	private int age= 22;
	private int cellNumber = 1;
	private String address = "11/8 Rama nilaya BAngalore";
	private double finalScore = 88;


public int getStudentid()
{
 return Studentid ;
}

public  String getName()
{
return Name;
}

public int getage()
{
return age;
}


public  int getcellNumber()
{
return cellNumber;
}

public String getaddress()
{
return address;
}

public double getfinalScore()
{
return finalScore ;
}

}
public class StudentInfo {
	
	public static void  main(String[] args)
	{
	Student obj = new Student();
	
	System.out.println("Student details :");
	System.out.println("Student id :"+ obj.getStudentid());
	System.out.println("Student name :"+ obj.getName());
	System.out.println("Student Age : "+obj.getage());
	System.out.println("Student Cell number : "+obj.getcellNumber());
	System.out.println("STudent address : "+obj.getaddress());
	System.out.println("Student Score :"+obj.getfinalScore());
	
	
	
	
	}
	
	

}

