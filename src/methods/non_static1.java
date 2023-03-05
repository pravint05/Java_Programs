package methods;

public class non_static1 
{
	//non static regular method call from same class
	
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD IS RUNNING");
		
		//step I: create object of same class
		non_static1 S1=new non_static1();	//classname objectname = new classname();
		
		//step II: call the method
		S1.m1();							//objectname.methodname();
		S1.m2();
	}
	
		public void m1()
		//non static regular method
	{
		System.out.println("Non static regular method is running");
	}
		
		public void m2()
		{
			System.out.println("Hello");
		}
}
