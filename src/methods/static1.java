package methods;

public class static1 
{
	//Static regular method call from same class
	
	static public void main(String args[])
	{
		System.out.println("main method is running");
		
		//call the method
		m1();				// methodname();
		m1();				// methodname();
		m2();				// methodname();
		m3();				// methodname();
		
	}
	
	//Static regular method
	public static void m1()
	{
		System.out.println("Static regular method is running");
	}
	
	public static void m2()
	{
		System.out.println("Good Morning");
		System.out.println("Good Afternoon");
		
	}
	public static void m3()
	{
		System.out.println("Hi");
		System.out.println("Hello");
	}
}
