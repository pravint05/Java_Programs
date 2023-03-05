package java_exceptions;

public class HandleArithmeticException {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		int c;
		
		System.out.println("Hello");
		try
		{
			c=a/b;				//Risky Code---------->Exception
		}
		catch (java.lang.ArithmeticException k)
		{
			System.out.println("Arithmetic Exception Handled");
			c=a/1;				//alternate solution
		}	
		
		System.out.println(c);
		System.out.println("Hi");
		
		

	}

}
