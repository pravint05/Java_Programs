package loops_for_loop;

public class Star_5 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++) // loop repeat
		{
			
			for(int j=5; j>=i; j--) // print *times
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
			System.out.print("*"); // nextline
		}
			System.out.println();
	}
}
}
