package oops_polymorphism;

public class MethodOverloading1 {
	
	//Example of compile_time poly_morphism----> Method_overloading
	
	public static void m1() 			//Method declaration
	{		
		System.out.println("Hello");	//Method definition
	}

	public static void m1(int a) 		
	{
		System.out.println("Good Morning");	
	}

	public static void m1(char c) 		
	{
		System.out.println("Good day");		
	}

	public void addition() 				//Method declaration
	{
		int a = 20;
		int b = 10;						//Method definition
		int sum1 = a + b;
		System.out.println(sum1);
	}

	public void addition(int p, int q)		
	{
		int sum2 = p + q;
		System.out.println(sum2);			
	}

	public void addition(int x, int y, int z) 	
	{
		int sum3 = x + y + z;
		System.out.println(sum3);
	}
}
