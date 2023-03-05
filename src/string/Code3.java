package string;

public class Code3 {
	public static void main(String[] args) {

		// Strings are In-mutable in nature
		String A1 = new String("XYZ");
		System.out.println(A1);

		//reference changes as new object create
		A1 = A1 + "ABC";	
		System.out.println(A1);
	}

}
