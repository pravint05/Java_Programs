package methods;

public class Withpara4
{
	public static void main(String[] args) 
	{
		//Create object of Same class
		Withpara4 w4 = new Withpara4();
		//call the method
		w4.m1("Rahul", 28);			
		
		//Create object of different class   
		Withpara5 w5 = new Withpara5();
		//call the method
		w5.m2("Nashik");
	}
	
	//Non-static regular method-->2 Parameter/arguments
	public void m1(String Sname, int age)
	{
		System.out.println(Sname);	//Rahul
		System.out.println(age);	//28
	}		
	
}
