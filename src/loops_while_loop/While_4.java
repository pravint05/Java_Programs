package loops_while_loop;

public class While_4 
{
	//print odd nos from 99 to 1 -->99 97 95 93 . . . . 7 5 3 1
	public static void main(String[] args) 
	{
		int i=99;
		while(i>=1)
		{
			System.out.println(i);
			i=i-2;
		}
	}
}
