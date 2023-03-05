package oops_polymorphism;

public class OverRidingSon extends OverRidingFather
{			//Sub class
	
	public void money()
	{
		System.out.println("5Lac");
	}
	
	//Overridden Method
	public void Bike()
	{
		System.out.println("pulser");
	}
	
	//Overridden Method
	public void Mobile ()
	{
		System.out.println("Apple");
	}
	
	//Method Hiding concept //Looks like Method overriding but not Override.
	public static void Home()		
	{	
		System.out.println("3BHK");
	}
	
}
