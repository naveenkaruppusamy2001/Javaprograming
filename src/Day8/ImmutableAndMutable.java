package Day8;

public class ImmutableAndMutable {
	
	public static void main(String[] args) 
	{
		
		StringBuffer s1=new StringBuffer("Welcome");
		s1.append("to java");
		System.out.println(s1);////Mutable but the string is immutable
		
	}

}
