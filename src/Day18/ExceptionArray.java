package Day18;

import java.util.Scanner;

public class ExceptionArray 
{
	public static void main(String[] args) 
	{
		
		int a[]=new int[6]; 
		
		System.out.println("Enter the Position of the array.....");
		try (Scanner sc = new Scanner(System.in)) {
			int pos=sc.nextInt();
			
			System.out.println("Enter the value :..");
			int val=sc.nextInt();
			
			try {
				a[pos]=val;
			} catch (Exception e) {
			    System.out.println();
				e.printStackTrace();
			}
			
			System.out.println(a[pos]);
		}
		
		
	}

}
