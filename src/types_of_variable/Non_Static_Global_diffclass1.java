package types_of_variable;

public class Non_Static_Global_diffclass1 
{
	//Non-Static global variable call from different class
	public static void main(String[] args) 
	{
		//Create object of different class
		Non_Static_Global_diffclass2 G1= new Non_Static_Global_diffclass2();
		
		//Call the variable
		System.out.println(G1.a);	//objectname.variablename	
	}
}
