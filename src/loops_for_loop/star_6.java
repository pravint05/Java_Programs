package loops_for_loop;

public class star_6 
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
			System.out.print("* "); // nextline
		}
			System.out.println();
	}
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int c=4;c>=a;c--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
}
   }

