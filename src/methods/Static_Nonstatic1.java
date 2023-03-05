package methods;

public class Static_Nonstatic1 
{
	//main method
	public static void main(String[] args)
	{
			System.out.println("Main method is running");
		
		
			// Static regular method call from same class
				m1();	//methodname();		
		
		
			// Non-Static regular method call from same class 
			// Create object of same class 
		
		Static_Nonstatic1 SN1=new Static_Nonstatic1();	 //Classname objectname=new Classname();				
			SN1.m3();	 // objectname.methodname();     					 
		
		
			//Static regular method call from different class 
			Static_Nonstatic2.m2();	 //classname.methodname();
		
	     
			//Non-static regular method call from different class 
			//Create object of different class
			
			Static_Nonstatic2 SN2=new Static_Nonstatic2();	//Classname objectname=new Classname();
			SN2.m4();	 //objectname.methodname();
	}
	
	//static regular method
	public static void m1()
	{
		System.out.println("Static regular method call from same class");
	}
	
	//Non static regular method
	public void m3()
	{
		System.out.println("Non-Static regular method call from same class");
	}
	
}
