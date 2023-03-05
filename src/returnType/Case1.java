package returnType;

public class Case1 {
	public static void main(String[] args) {
		addition(70, 30); // Normal case
		int S1 = addition(10, 30, 50); // return type case
		System.out.println(S1);
	}

	// Normal Case
	public static void addition(int a, int b) {
		int Sum1 = a + b;
		System.out.println(Sum1);
	}

	// return type case
	public static int addition(int x, int y, int z) {
		int sum2 = x + y + z;
		return sum2;
	}
}
