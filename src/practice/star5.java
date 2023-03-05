package practice;

public class star5 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)//rows
		{
			for(int j=1; j<=i; j++)//Space
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--) //stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
