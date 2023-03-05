package practice;

public class star3 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)//rows
		{
			for(int j=5; j>=i; j--) // stars in row
			{
				System.out.print("*");
			}
			System.out.println();//next line
		}
	}
}
