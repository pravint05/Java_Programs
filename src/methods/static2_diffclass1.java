package methods;

public class static2_diffclass1 
{
	//static regular method call from different class
	public static void main(String[] args) 
	{
		System.out.println("Main method running");
		
		static3_diffclass2.m1(); //classname.methodname();
		static3_diffclass2.m2(); //classname.methodname();
		
	}
}

