package practice;

public class star4 
{
	public static void main(String[] args) 
	{	
		for(int i=1; i<=5; i++) // rows
		{
			for(int j=4; j>=i; j--) // Space
			{
			System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
			System.out.print("*");// stars in a row
			}
			System.out.println();//next line
		}
		

	}
}