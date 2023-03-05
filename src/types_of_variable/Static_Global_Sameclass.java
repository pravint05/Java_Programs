package types_of_variable;

public class Static_Global_Sameclass 
{
	static int a=25;	//Static global variable
			
	public static void main(String[] args) 
	{
		System.out.println(a);	//SOP(variablename);
	
		m1();	//methodname();
		
		Static_Global_Sameclass SG = new Static_Global_Sameclass ();//classname objectname = new classname();
		SG.m2(); 		//objectname.methodname();	
	}
	
	public static void m1() //static method
	{
		System.out.println(a);
	}
	
	public void m2()	//non static method
	{
		System.out.println(a);

	}
	
}
