package array;

public class Singledimensional3 {
	public static void main(String[] args) {
		// Array Declaration
		int[] arr3 = new int[5];

		// Array Initialization
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 30;
		arr3[3] = 40;
		// if we don't initialize value in particular index it will consider as 0

		// Usage
		for (int i = 0; i <= arr3.length - 1; i++) // arr3.length = size of array ; size-1=index
		{
			System.out.println(arr3[i]);
		}
	}
}
