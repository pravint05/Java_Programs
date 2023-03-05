package control_statement;

public class Nested_If 
{
	public static void main(String[] args) 
	{
		String username = "abc1";
		String password = "xyz1";
		
	
	if("abc1"==username)
	{
		System.out.println("valid username");
	 
		if("xyz1"== password)
		{
			System.out.println("Valid Password, login successful");
		}
		else
		{
			System.out.println("Invalid Password, Login failed");
		}
	}
	else
	{
		System.out.println("Invalid username, Login failed");
	}
}

}