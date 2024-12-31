package Day11;

public class GreetingsMain
{
	public static void main(String[] args) 
	{
		
		Greetings obj =new Greetings();
		
		obj.m1();
		
		String s=obj.m2();
		System.out.println(s);
		
		
		obj.m3("Smith");
		
		
		String s1=obj.m4("john");
		System.out.println(s1);
		
		
	}

}
