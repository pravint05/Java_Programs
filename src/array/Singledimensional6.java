package array;

import java.util.Arrays;

public class Singledimensional6 {
	public static void main(String[] args) {
		// Array Declaration
		int[] arr6 = new int[5];

		// Array Initialization
		arr6[0] = 60;
		arr6[1] = 20;
		arr6[2] = 40;
		arr6[4] = 10;

		// To make array in ascending order
		Arrays.sort(arr6);

		for (int i = 0; i <= arr6.length - 1; i++) {
			System.out.println(arr6[i]);
		}

		System.out.println("-----------------------------");

		// To make array in descending order
		for (int i = arr6.length - 1; i >= 0; i--) {
			System.out.println(arr6[i]);
		}

	}

}
