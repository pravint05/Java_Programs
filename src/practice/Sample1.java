package practice;

public class Sample1 {

	public static void main(String[] args) {
		Sample1 S1=new Sample1();
		S1.m3();

	}
	
	public void m1()
	{	
	//	m2();
		System.out.println("Hello");
	}
	
	public void m3()
	{
		m1();
		m2();
	}
	
	public static void m2()
	{
		System.out.println("Hi");
	
	}

}
