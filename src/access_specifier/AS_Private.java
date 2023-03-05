package access_specifier;

public class AS_Private 
{
	private int a=10;
	private AS_Private() 	//if Constructor is private then only object creation is in within that same class
	{
		
	}
	
	private void m1()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args) 
	{
		AS_Private A1 = new AS_Private();
		A1.m1();  							     //Hi
		System.out.println(A1.a); 				 //10
	}
	
	
}
