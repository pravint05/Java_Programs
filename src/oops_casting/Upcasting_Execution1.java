package oops_casting;

public class Upcasting_Execution1 {
	public static void main(String[] args) {

		//create object of sub class by providing reference of super class

		Upcasting_Father1 F1 = new Upcasting_Son1();
		F1.money();
		F1.car();
		F1.Home();
	}
}
