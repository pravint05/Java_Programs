package java_exceptions;

public class Handle_ArrayIndexOutOfBoundException {

	public static void main(String[] args) {

		int[] Ar = new int[5];

		try 
		{
			Ar[6] = 10;
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
		}

		System.out.println("Hello");
		
	}
}
