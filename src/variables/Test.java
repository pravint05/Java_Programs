package variables;

public class Test {
	public static void main(String[] args) {

		int a = 10;		//variable declaration and initialization
		System.out.println(a);	//10

		a = 20;				//re_initialization
		System.out.println(a);	//20
		
//if we declare variable as final then variable value becomes constant for that class, we cannot re_initialize that variable
		final int b=30;			
		System.out.println(b);
		
	//	b=20; 		variable 'b' not reinitialize
	}
}
