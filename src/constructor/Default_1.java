package constructor;

public class Default_1 
{
	public static void main(String[] args) 
	{
		//Create object of same class
		Default_1 D1=new Default_1();	//classname objectname=new classname();
		//Call the method
		D1.addition();		
		
		//Create object of different class 
		Default_2_diffclass D2=new Default_2_diffclass();	//classname objectname=new classname();	
		//Call the method
		D2.addition();
	}
	
	//Non-static regular method
	public void addition()
	{
		int a=10;
		int b=20;
		int Sum1=a+b;
		System.out.println(Sum1);
	}
}
