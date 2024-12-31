package Day6;

public class SingleDimensionalArrayDeclaration {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			
			if (i<=5) {
				
				System.out.println("The number is below 5 :"+ i);
				
			}System.out.println("The number is after 5 :"+ i);
			
		}
	}
}
