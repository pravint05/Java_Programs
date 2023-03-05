package constructor;

public class User_Defined2 
{
	public static void main(String[] args) 
	{
		//Create object of different class
		User_Defined1 S1 = new User_Defined1();
		S1.addition();
		
		//Create object of different class
		User_Defined1 S2 = new User_Defined1(50,10);
		S2.addition();
		
		//Create object of different class
		User_Defined1 S3 = new User_Defined1(70,90);
		S3.addition();
		
		//Create object of different class
		User_Defined1 S4 = new User_Defined1("Career");
		S4.ClassName();
	}
	
}
