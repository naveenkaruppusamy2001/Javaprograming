package Day18;

import java.util.Scanner;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		System.out.println("The program was started...");
		System.out.println("The enter the number....");
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			
			int calc = 0;
			try {
				
				calc = 100/n;
				System.out.println("The calculated value is "+calc);
			} catch (ArithmeticException e) {
				System.out.println("Enter the valid number");
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
