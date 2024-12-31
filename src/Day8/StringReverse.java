package Day8;

public class StringReverse
{
	public static void main(String[] args)
	{
		String s="Notepad";
		char a[]=s.toCharArray();
		String rev="";
		
		for (int  i = s.length()-1; i>= 0; i--) 
		{
		    rev=rev+a[i];
		}
		System.out.println(rev);
	}

}
