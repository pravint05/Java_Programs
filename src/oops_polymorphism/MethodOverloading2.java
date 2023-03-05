package oops_polymorphism;

public class MethodOverloading2 {
	public static void main(String[] args) {
		
		MethodOverloading1.m1();
		MethodOverloading1.m1(20);
		MethodOverloading1.m1('x');
		
		System.out.println("------------------------------------------");
		
		MethodOverloading1 S1 = new MethodOverloading1();
		S1.addition();
		S1.addition(50, 60,90);
		S1.addition(90, 10);
	}

}
