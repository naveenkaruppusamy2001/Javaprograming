package Day8;

public class StringComparasion 
{
	public static void main(String[] args)
	{
		String s1="Welcome";
		String s2="Welcome";
		
		System.out.println(s1==s2);       //compare the objects
		System.out.println(s1.equals(s2));//compare the values in the object
		
		
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		System.out.println(s3==s4);       //compare the objects
		System.out.println(s3.equals(s4)); //compare the value within the objects 
		
	}

}
