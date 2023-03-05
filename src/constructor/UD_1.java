package constructor;
//User defined constructor
public class UD_1 
{	
	//Step-I: Variable declaration
	int a;	 //Non-static global variable
	int b;	 //Non-static global variable
	
	//Step-II:variable initialization 
	UD_1()		//user defined constructor
	{
		a=35;	
		b=45;
	}
	
	//Usage
	public void m1()
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		 //Create object of same class
		UD_1 S1 = new UD_1();
		S1.m1();
		
		  //Create object of different class
		UD_2_diffclass S2 = new UD_2_diffclass ();
		S2.m2();
	}
	
}
