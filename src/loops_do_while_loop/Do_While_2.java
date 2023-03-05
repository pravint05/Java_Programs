package loops_do_while_loop;

public class Do_While_2 
{
	//print no from 5 to 1-->5 4 3 2 1
	public static void main(String[] args) 
	{
		int i=5;	//starting condition
		do
		{
			System.out.println(i);
			i--;	//Increment/decrement 
		}
		while(i>=1);	//end condition
	}
}