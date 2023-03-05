package loops_for_loop;

public class star_7 
{
   public static void main(String[] args) 
   {
	   for(int a=1;a<=10;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int c=10;c>=a;c--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
   }
}
