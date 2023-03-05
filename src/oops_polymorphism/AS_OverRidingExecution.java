package oops_polymorphism;

public class AS_OverRidingExecution {
	public static void main(String[] args) {
		AS_OverRidingSon S1 = new AS_OverRidingSon();
		S1.m1();
		S1.m2();
		S1.m3();
	//	S1.m4(); not visible due to private access modifier
}

}