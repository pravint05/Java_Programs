package practice;

public class methods 
{
	static int a=10;
	static int b=20;
	int c=30;
	public static void hello()
	{
	   System.out.println("hey");
	   System.out.println(a);
	   System.out.println(b);
	  // System.out.println(c);
	}
	public void hie()
	{
		   System.out.println("change");
		   System.out.println(a);
		   System.out.println(b);
		   System.out.println(c);
	 }
	public int add(int x,int y)
	{
		
		int z=x+y;
		//return z;
	    System.out.println("add is:"+z);
	     return 0;
	}
	public static int add1()
	{
		int r=20,d=30,f;
		f=r+d;
				
		//return z;
	    System.out.println("add is:"+f);
	     return 0;
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		hello();
		//methods.hello();
		methods s=new methods();
		s.hie();
		methods p=new methods();
		int result=p.add(50,20);
		add1();
	}

}
