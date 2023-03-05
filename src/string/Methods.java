package string;

public class Methods 
{
	
		public static void main(String[] args)
		
		{
			String S1 = "velocity";
			String S2 = "";
			String S3 = "ABCD";
			String S4 = "VELOCITY";
			String S5 = "city";
			String S6 = "abcabab";
			String S7 = "Classes";
			String S8 = "Manual Classes";
			
			// length/Size of String
			System.out.println(S1.length());						//8
			
			//to verify empty or not
			System.out.println(S1.isEmpty());						//false
			System.out.println(S2.isEmpty());						//true
			
			//To convert into uppercase
			System.out.println(S1.toUpperCase());					//VELOCITY
			
			//to convert into lowercase
			System.out.println(S3.toLowerCase());					//abcd
			
			//Compare S1 & S4
			System.out.println(S1.equals(S4));						//false
			
			//compare S1&S4
			System.out.println(S1.equalsIgnoreCase(S4));			//true
			
			//Compare S1 & S5
			System.out.println(S1.contains(S5));					//true
			
			//to get character by providing index
			System.out.println(S1.charAt(4));						//c
			
			//to verify string
			System.out.println(S1.startsWith("ve"));				//true
			
			System.out.println(S1.endsWith("te"));					//false
			
			// to get index by providing character(from front)
			System.out.println(S6.indexOf('c'));					//2
			
			// to get index by providing character(from back)
			System.out.println(S6.lastIndexOf('a'));				//5
			
			//to find some character from string	
			System.out.println(S1.substring(4));					//city
			
			//to find some character from string
			System.out.println(S1.substring(2, 5));					//loc
			
			//concat 2 strings
			System.out.println(S1+S7);								//velocityClasses
			System.out.println(S1.concat(S7));						//velocityClasses
			
			System.out.println(S1+ " "+S7);							//velocity Classes
			System.out.println(S1.concat(" "+S7));					//velocity Classes
			
			//to replace word
			System.out.println(S8.replace("Manual", "Automation")); //Automation Classes
			
		}

}
