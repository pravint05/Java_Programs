package array;

public class Multidimensional1 {

	//	   0   1   2
	// 0  10  60  20
	// 1  80  90  50

	public static void main(String[] args) {

		//Array Declaration 
		int Arr1[][] = new int[2][3];

		 //Array Initialization 
		Arr1[0][0] = 10;
		Arr1[0][1] = 60;
		Arr1[0][2] = 20;
		Arr1[1][0] = 80;
		Arr1[1][1] = 90;
		Arr1[1][2] = 50;

		//usage
		System.out.println(Arr1[1][2]); // 50
		
		System.out.println("----------------------------------");

		//usage
		for (int i = 0; i <= 1; i++) {
			for (int a = 0; a <= 2; a++) {
				System.out.print(Arr1[i][a] + " ");
			}
			System.out.println();
		}
	}
}
