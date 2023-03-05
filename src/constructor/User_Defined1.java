package constructor;

public class User_Defined1 {
	// Step-I: Variable declaration
	int a;
	int b;
	String name;

	// Step-II:variable initialization
	User_Defined1() // User defined constructor---->Zero parameter/without parameter
	{
		a = 100;
		b = 50;
	}

	User_Defined1(int x, int y) // User defined constructor---->2 int parameter
	{
		a = x;
		b = y;
	}

	User_Defined1(String z) // User defined constructor---->String Parameter
	{
		name = z;
	}

	// Usage
	public void addition() {
		int sum = a + b;
		System.out.println(sum);
	}

	public void ClassName() {
		System.out.println(name);
	}

}
