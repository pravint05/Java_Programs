package array;

public class Singledimensional4 {
	public static void main(String[] args) {
		// Array Declaration
		String[] arr4 = new String[5];

		// Array Initialization
		arr4[0] = "Virat";
		arr4[1] = "Kohli";
		arr4[2] = "Harbhajan";
		arr4[3] = "Singh"; 
		// if we don't provide value to index, then index by default print null as output

		// Usage
		for (int i = 0; i <= arr4.length - 1; i++) {
			System.out.println(arr4[i]);
		}
	}
}
