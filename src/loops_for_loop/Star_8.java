package loops_for_loop;

public class Star_8 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++) // loop repeat
		{
			
			for(int j=1; j<=i; j++) // print *times
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
			System.out.print("*"); // nextline
		}
			System.out.println();
	}
}
}