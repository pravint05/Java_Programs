package this_and_super_keyword;

public class Test1 {
	int a = 20; // Non static Global variable
	int b = 30;
	static int c=100;
	
	public void M1() {
		int a = 10; // Local Variable

		System.out.println(a); // 10
		System.out.println(b); // 30
		System.out.println(this.a); // 20 //this.varaiablename
		System.out.println(c);//we can call static global variables directly into non static method
		m2();
	}

	public static void m2()	//we can call static methods directly into non static methods
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Test1 T1 = new Test1();
		T1.M1(); // Objectname.methodname();

	}
}
