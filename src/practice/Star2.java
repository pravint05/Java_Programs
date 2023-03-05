package practice;

public class Star2 
{
public static void main(String[] args) 
{
	for(int i=1; i<=5; i++)//rows
	{
		for(int j=1; j<=i; j++)//star in row
		{
			System.out.print("*");
		}
		System.out.println();//next line
	}
}
}
