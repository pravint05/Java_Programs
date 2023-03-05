package types_of_variable;

public class Non_Static_Global_Sameclass 
{
	//Non-Static global variable call from same class
	int a=15;	 //Non-static global variable
	int b=45;	//Non-static global variable
	
	public static void main(String[] args) 
	{
		//create object of same class
		Non_Static_Global_Sameclass S1 = new Non_Static_Global_Sameclass();

		//Call the variable
		System.out.println(S1.a);	//Objectname.variablename
		
		m1();	//methodname();
	}
	
	public static void m1()
	{
		//Create object of same class
		Non_Static_Global_Sameclass S2 = new Non_Static_Global_Sameclass();
		
		//Call the variable
		System.out.println(S2.b);
	}
	
}
