package variables;

public class Datatypes1 

{  //class body
	
	public static void main(String[] args)
	{
		//step I : Variable Declaration
		String Studentname;					//datatype variablename
		int StudentRollNo;
		char StudentGrade;
		float StudentPercentage;
		
		//step II : variable Initialization
		Studentname= "Pravin";					//variablename="variable data/information"
		StudentRollNo=65;
		StudentGrade='A';
		StudentPercentage=67.89f;
		
		//step III : Usage 
		System.out.println("Student Name:" + Studentname); 		 //Student Name: Pravin
		System.out.println("Student Roll No: "+ StudentRollNo); //Student Roll No: 65
		System.out.println(StudentGrade);						// A
		System.out.println(StudentPercentage);					//67.89
	}
}
