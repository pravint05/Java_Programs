package practice;

public class Star6 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++) //rows
		{
			for(int j=4; j>=i; j--) //space
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
