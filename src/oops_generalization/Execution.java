package oops_generalization;

public class Execution {

	public static void main(String[] args) {
		Jio J1 = new Jio();
		J1.calling();
		J1.data();
		J1.sms();

		System.out.println("----------------------------------------");

		Airtel A1 = new Airtel();
		A1.calling();
		A1.data();
		A1.sms();

		System.out.println("-----------------------------------------");

		BSNL B1 = new BSNL();
		B1.calling();
		B1.data();
		B1.sms();
	}

}
