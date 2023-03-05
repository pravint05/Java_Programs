package this_and_super_keyword;

public class Sample2 extends Sample1 { // Subclass

	int a = 10;
	int b = 15;
	
	public void m1() {
		int a = 25; // Local Variable

		System.out.println(a);			//25
		System.out.println(this.a);		//10
		System.out.println(super.a);	//75
		System.out.println(b);			//15
		System.out.println(this.b);		//15
		System.out.println(c);			//49
		System.out.println(this.c);		//49
		System.out.println(super.c);	//49
	}

	public static void main(String[] args) {
		Sample2 S2 = new Sample2();
		S2.m1();
		System.out.println("-----------------------------------");
		
		//directly call static global variable from another class
		System.out.println(Sample1.z); 
		
		//directly call non static global variable from another class
		Sample1 S3=new Sample1();
		System.out.println(S3.a);
		System.out.println(S3.c);
	}
}
