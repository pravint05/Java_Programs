package methods;

public class Withpara1 
{
	public static void main(String[] args) 
	{
		addition();				//methodname();
		addition(30,40);		//methodname();
		addition(50,60,15);
		addition(250,350);
	}
	
	//Static Regular Method---->Zero parameter/Without Parameter
	public static void addition()		
	{
		int a = 10;
		int b = 20;
		int c =a+b;
		System.out.println(c);
	}
	
	//Static Regular Method---->2 parameter/arguments method(With parameter)
	public static void addition(int c, int d)	
	{
		int sum1=c+d;
		System.out.println(sum1);
	}
	
	//Static Regular Method---->3 parameter/arguments method(With parameter)
	public static void addition(int e , int f, int g)
	{
		int sum2=e+f+g;
		System.out.println(sum2);
	}
	
	
}
