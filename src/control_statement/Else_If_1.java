package control_statement;

public class Else_If_1 
{
	public static void main(String[] args) 
	{
		int marks = 53;	//Variable declartion and intialisation
		
	if(marks>=65)	//false
	{
		System.out.println("Distinction");
	}
	else if(marks>=60) //false
	{
		System.out.println("First Class");
	}
	else if(marks>=55)	//false
	{
		System.out.println("Higher Second Class");
	}
	else if(marks>=50)	//true
	{
		System.out.println("Second Class");
	}
	else if(marks>=35)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}
}
