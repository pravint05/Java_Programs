package loops_do_while_loop;

public class Do_While_3 
{
	//print even nos from 2 to 100-->2 4 6 8 10.......94 96 98 100
	public static void main(String[] args) 
	{
		int i=2;	//Starting condition
		do
		{
			System.out.println(i);
			i=i+2;	//Increment/decrement 
		}
		while(i<=100);	//end condition
	}
}
