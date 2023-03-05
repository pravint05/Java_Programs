package access_specifier;

public class AS_Protected 
{
	protected int a=100;
	
	protected void m3()
	{
		System.out.println("Good Morning");
	}
	
	public static void main(String[] args) 
	{
		AS_Protected ASP=new AS_Protected();
		ASP.m3();
		System.out.println(ASP.a);
	}
	
}
