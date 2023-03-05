package oops_polymorphism;

public class AS_Overloading 
{	//Method OverLoading can achieve with all access specifiers.
	public void m1()
	{
		System.out.println("Hi");
	}
	
	void m1(char c)
	{
		System.out.println("Namaste");
	}
	
	protected void m1(float f)
	{
		System.out.println("Good Morning");
	}
	
	private void m1(int s)
	{
		System.out.println("Hello");
	}
}
