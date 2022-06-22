package com.abc;

public class Trafficlight {

	public static void main(String[] args)
	{
		Signalcolor c = new Signalcolor();
		Thread t1 = new Thread(c);
		t1.start();
		System.out.println("Thread has started");	
	   t1.stop();
		t1.interrupt();
	//	t1.stop();
	
	}	
}


class Signalcolor implements Runnable
{
	public void run()
	{
		while(true)
		{
			try {
			System.out.println("Color : Red");
			Thread.sleep(2000);
			}
			catch(InterruptedException e) { }
			
			try {
			System.out.println("Color : Yellow");
			Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			
		try {
			System.out.println("Color : Green");	
			Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
}
			
			
			
			
			
		
	

