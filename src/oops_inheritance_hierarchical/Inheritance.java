package oops_inheritance_hierarchical;

public class Inheritance 
{
	public static void main(String[] args) 
	{
		Son1 S1= new Son1();
		S1.Mobile();
		S1.Property();
		
		System.out.println("------------------------------------------");
		
		Son2 S2= new Son2();
		S2.Bike();
		S2.Property();
		
		System.out.println("------------------------------------------");
		
		Son3 S3= new Son3();
		S3.Laptop();
		S3.Property();
				
	}
}
