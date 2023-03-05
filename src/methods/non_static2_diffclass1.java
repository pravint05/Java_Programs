package methods;

public class non_static2_diffclass1 
{
	//non static regular method call from different class
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method running");

		//step I : create object of different class
		non_static3_diffclass2 S1=new non_static3_diffclass2();	//classname objectname = new classname();
	
		//Step II : call the method
		S1.m1();				//objectname.methodname();
	
	}
	
}
