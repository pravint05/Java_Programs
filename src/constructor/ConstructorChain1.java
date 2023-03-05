package constructor;

public class ConstructorChain1 
{
	int a;
	int b;
	
	ConstructorChain1()
	{
		this(20,50);
	}
	
	ConstructorChain1(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public void addition()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		ConstructorChain1 S1 = new ConstructorChain1();
		S1.addition();
	}
}
