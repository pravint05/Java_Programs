package returnType;

public class Case2 {
	public static void main(String[] args) {
		m1("XYZ"); // Normal Case

		String S1 = m2("ABC"); // return type case
		System.out.println(S1);
	}

	// Normal Case
	public static void m1(String A) {
		System.out.println(A);
	}

	// return type case
	public static String m2(String B) {
		String X = B;
		return X;
	}
}
