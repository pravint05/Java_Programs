package string;

public class Code2 {
	public static void main(String[] args) {

		// Create object of String class(Without Using new keyword)
		String s1 = "XYZ";
		String s2 = "XYZ";
		String s3 = "xyz";
		String s4 = "XYZ1";

		// Create object of String class(With Using new keyword)
		String s5 = new String("XYZ");
		String s6 = new String("XYZ");
		String s7 = new String("xyz");
		String s8 = new String("XYZ1");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s5); // false
		System.out.println(s1 == s3); // false
		System.out.println(s5 == s6); // false
		System.out.println(s2 == s6); // false
		System.out.println(s5 == s7); // false
		System.out.println(s4 == s8); // false
		System.out.println(s5 == s8); // false
		System.out.println(s4 == s3); // false
	}

}
