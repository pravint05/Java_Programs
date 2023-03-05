package constructor;

public class Constructor_call
{
	int a ;
	int b ;
	
	// call one constructor into another constructor
	Constructor_call()
	{
		this(20,40);	//calling 2 parameter constructor
	}
	
	Constructor_call(int p, int q)			
	{
		a=p;
		b=q;
	}
	
	public void addition()
	{
		int add = a+b;
		System.out.println(add);
	}
	public static void main(String[] args) 
	{
		// create object of constructor in which another constructor is called
		Constructor_call K1 = new Constructor_call();
		K1.addition();
		
		Constructor_call K2 = new Constructor_call(90,80);
		K2.addition();
	}
	
}
