package methods;

public class Withpara3 
{
	public static void main(String[] args) 
	{
		m1();	//methodname();
		m2("Thakare");	//methodname();
		
		Withpara3 NS = new Withpara3 ();
		NS.m3("Pushkar", 25, 'c', 45.09f);
	}
	
	//Static Regular Method---->Zero parameter/Without Parameter
	public static void m1()
	{
		String S1 = "Pravin";
		System.out.println(S1);	//Pravin
	}
	
	//Static Regular Method---->With Parameter
	public static void m2(String S2)
	{
		System.out.println(S2);	//Thakare
	}
	
	public void m3(String Name,int Roll_No, char Grade, float percentage )
	{
		System.out.println("Name: "+Name);
		System.out.println("Roll No: "+ Roll_No);
		System.out.println("Grade: "+Grade);
		System.out.println("Percentage: "+percentage+"%");
		
	}
	
}
