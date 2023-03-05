package constructor;

public class Constructor_chaining 
{
	int p;
	int q;
	int r;
	int s;
	int t;
	Constructor_chaining()
	{
		this(10);
	}
	
	Constructor_chaining(int a)
	{
		
	      this(20,10);	
	}
	
	Constructor_chaining(int b, int c)
	{
		this(50,150,100);
	}
	
	Constructor_chaining(int d, int e, int f)
	{	
		p=d;
		q=e;
		r=f;
	}
	
	public void m1()
	{
		int sum=p+q+r;
		System.out.println(sum);
	}
	

	public static void main(String[] args) 
	{
		Constructor_chaining S1 = new Constructor_chaining();
		S1.m1();		//300
		
	}
}
