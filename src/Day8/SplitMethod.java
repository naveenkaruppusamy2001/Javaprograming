package Day8;

import java.util.Arrays;

public class SplitMethod {
	
	public static void main(String[] args) 
	{
		
	String E= "test@gmail.com#90030";
	String E1[] =E.split("@");
	System.out.println(Arrays.toString(E1));
	String E2[] =E1[1].split("#");
	System.out.println(Arrays.toString(E2));
	}

}
