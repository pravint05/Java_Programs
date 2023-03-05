package array;

public class Multidimensional2 {
	public static void main(String[] args) {
		//Array Declaration  and Initialization
		int[][] Arr2 = { { 10, 20, 30 }, { 60, 70, 80 }, { 75, 55, 35 } };
	   
		//usage
		for (int i = 0; i <= 2; i++)	//outer for loop for Rows	
		{
			for (int a = 0; a <= 2; a++) //Inner for loop for column
			{
				System.out.print(Arr2[i][a] + " ");
			}
			System.out.println();
		}
	}

}
