package Day7;
import java.util.Scanner;

public class NumberOfRepetations
{
	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50,60,70,80,10,10,20,30,40,40,40};
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter the number :  ");
			int number =obj.nextInt();
			int count=0;
			
			
			for (int i = 0; i < a.length; i++) 
			{
				if (number==a[i]) 
				
				{
					count=count+1;
					
				}	
			}
			System.out.println("The number of repeated times : "+ count);
		}
		
	}

}
