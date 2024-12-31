package Day4;

public class Nested_If_Statement {

 public static void main(String[] args) {
	 
	 int a,b,c;
	 
	 a=100;
	 b=20;
	 c=30;
	 
	 
	 if (a>b && a>c) {
		 
		 System.out.println("A is larger");
		 
		 
	} else if(b>a && b>c) {
		System.out.println("B is larger");
		

	}else {
		System.out.println("C is larger");

	}
	
}
}
