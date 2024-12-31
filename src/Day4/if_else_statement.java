package Day4;

import java.util.Scanner;

public class if_else_statement {
	public static void main(String[] args) {
		
		try (Scanner std = new Scanner(System.in)) {
			System.out.println("Enter the student mark");
			int Mark = std.nextInt();
			
			
			if (Mark>=35) {
				
				System.out.println("The student got the pass mark");
				
			} else {
				
				System.out.println("The student got the fail mark");

			}
		}
		
	}

}
