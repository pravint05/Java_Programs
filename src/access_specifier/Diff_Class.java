package access_specifier;

public class Diff_Class
{
	public static void main(String[] args) 
	{
		AS_Public T1=new AS_Public();
		T1.m1();
		System.out.println(T1.a);	//objectname.variablename
	
		System.out.println("------------Public AS ends----------------------");
		
		AS_Default AS = new AS_Default();
		AS.m1();
		System.out.println(AS.a);
		
		System.out.println("---------Default AS ends-------------------------");
		
		AS_Protected A1 = new AS_Protected();
		A1.m3();
		System.out.println(A1.a);
		
		System.out.println("---------Protected AS ends-------------------------");
		
		
	}
}
