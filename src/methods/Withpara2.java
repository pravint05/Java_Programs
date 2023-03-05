package methods;

public class Withpara2 
{
	public static void main(String[] args) 
	{
		//Step-I: Create object of same class
		Withpara2 S1 = new Withpara2 ();
		S1.substraction();
		S1.substraction(100,50);
		S1.substraction(40,20,50);
		S1.substraction(40,20);
	}
	
	//Non-Static Regular Method---->Zero parameter/Without Parameter	
	public void substraction()	
	{
		int a =50;
		int b = 25;
		int c = a-b;
		System.out.println(c);
	}
	
	//Non-Static Regular Method---->with 2 Parameter
	public void substraction(int e, int f)
	{
		int substract1 = e-f;
		System.out.println(substract1);
	}
	
	public void substraction(int g, int h, int i)
	{
		int substract2 = g-h-i;
		System.out.println(substract2);
	}
	
}
