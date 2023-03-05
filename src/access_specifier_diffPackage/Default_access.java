package access_specifier_diffPackage;

import access_specifier.AS_Default;
import access_specifier.AS_Private;

public class Default_access
{
	
		public static void main(String[] args) 
		{
			AS_Default AS2=new AS_Default();
			//default access specifier only allow use information within same package
		//	AS2.m1();		//to allow 'm1' and 'a' require-->change visibility as public
		//	System.out.println(AS2.a);
		}
	
}
