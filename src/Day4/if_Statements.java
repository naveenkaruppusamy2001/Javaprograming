package Day4;

import java.util.Scanner;

public class if_Statements {
	
	public static void main(String[] args) {
		
		try (Scanner m = new Scanner(System.in)) {
			System.out.println("Enter the marks :");
			
			int mark = m.nextInt();
			
			if (mark>=35) {
				
				System.out.println("Pass");
				
			}
		}
		
	}

}
