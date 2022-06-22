package com.abc;

public class Practice {
public static void main(String[] args)
{
	String s1 = "ABC";
	String s2 ="XYZ";
	String s3 = s1;
    s1 = s2;
    s3 = s1;
    s3 = "UVW";
	
	System.out.println("String1 ="+s1);
	System.out.println("String1 ="+s2);
	System.out.println("String3 ="+s3);
	
	
	
	
}
	 
}
