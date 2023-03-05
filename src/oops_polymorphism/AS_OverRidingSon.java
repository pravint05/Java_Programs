package oops_polymorphism;

public class AS_OverRidingSon extends AS_OverRidingFather
{
	public void m1()
	{
		System.out.println("Short");
	}
	 void m2()
	{
		System.out.println("Bad");
	}
	protected void m3()
	{
		System.out.println("Sad");
	}
	private void m4()
	{
		System.out.println("Night");
	}
}
