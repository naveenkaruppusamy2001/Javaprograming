package Day7;

import java.util.Scanner;

public class SearchElementInArray 
{
	
	public static void main(String[] args) 
	{
		
		int a[]= {10,20,30,40,50,60};
		try (Scanner element = new Scanner(System.in)) {
			System.out.println("Enter the Value :  ");
			int searchelement = element.nextInt();
			
			boolean status = false;

			
			for (int i = 0; i < a.length; i++)
			{
				
				if (a[i]==searchelement) 
				{
					
					System.out.println("The Element is found");
					status =true;
					break;
					
				}
				
			}
			
			if (status==false)
			{
				System.out.println("The Element is not found");
				
			}
		}
				
		
	}

}
