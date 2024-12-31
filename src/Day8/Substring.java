package Day8;

public class Substring {
	
	public static void main(String[] args) 
	{
		
		String s ="Donot Give Up";
		
		System.out.println(s.substring(0, 5));// First index starts from the index 0; last value is starts from the one
		System.out.println(s.substring(1));   //only the starting value is given , the entire strings is printered
		
		String upper =s.toUpperCase();
		System.out.println(upper);
		String Lower =s.toLowerCase();
		System.out.println(Lower);
	}

}
