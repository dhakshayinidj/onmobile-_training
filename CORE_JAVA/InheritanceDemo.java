package com.abcd;

interface AnimalEat{
	void eat();
	}

interface Animalwalk{
	void walk();
}

interface AnimalCharecteristics extends AnimalEat, Animalwalk 
{
	void Charecteristics();
	
}

class Animal implements AnimalCharecteristics 
{
	public void display() {
		
		System.out.println(" Animal Charecteristics");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Charecteristics() {
		// TODO Auto-generated method stub
		
	}
}
public class InheritanceDemo {

	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.eat();
		a.walk();
	}
}
