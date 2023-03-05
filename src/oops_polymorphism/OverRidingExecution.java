package oops_polymorphism;

public class OverRidingExecution {
	public static void main(String[] args) {
		OverRidingSon S1 = new OverRidingSon();
		S1.money();				//Overridden Method
		S1.Bike();				//Overridden Method
		S1.Mobile();			//Overridden Method
		S1.TV();				//OverRidingFather class Method
		OverRidingSon.Home();	//method hiding concept

	}

}
