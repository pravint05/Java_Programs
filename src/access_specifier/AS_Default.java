package access_specifier;

public class AS_Default 
{	
	int a=50;
	
	//default non static method
	void m1()	
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) 
	{
		AS_Default AS1= new AS_Default();
		AS1.m1();
		System.out.println(AS1.a);
	}
}

//default access specifier only allow use information within same package