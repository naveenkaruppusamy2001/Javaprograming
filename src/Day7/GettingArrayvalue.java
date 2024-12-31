package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class GettingArrayvalue 
{
	public static void main(String[] args) 
	{
		int a[]= new int[7];
		
		for (int i = 0; i < a.length; i++)
		{
			
			try (Scanner sc = new Scanner(System.in)) 
			{
				System.out.println("Enter the value: "+ i + "  Position");
				a[i]=sc.nextInt();
			}
			
		}
		System.out.println("The final array is :"+Arrays.toString(a));
		
	}

}
