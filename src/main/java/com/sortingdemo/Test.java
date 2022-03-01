package com.sortingdemo;

class Human
{
	
}

class Doctor extends Human
{
	
}

class Animal 
{
	
}

class Dog extends Animal
{
	
}

class Bird
{
	 
}
public class Test {
	
//	this method will accept only human kind of object
	public static <T extends Human> void printInfo(T humanObject)		
	{
		System.out.println("You are human");
	}
	public static void main(String[] args) {
		printInfo(new Human());
		printInfo(new Doctor());
//		printInfo(new Dog()); 	this will get compile time error because Dog is Animal kind object it is not human being
		
		
	}
}
