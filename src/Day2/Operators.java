package Day2;

public class Operators {
	
	public static void main(String[] args) {
		
	//Arithmethic operators + - * / % 
		
	int a=10,b=30;
	
	System.out.println("The sum of the two numbers is : "+(a+b));
	System.out.println("The difference  of the two numbers is : "+(a-b));
	System.out.println("The mutiplication of the two numbers is : "+(a*b));
	System.out.println("The Division of the two numbers is : "+(a/b));// return the Quotient Value
	System.out.println("The Modulus of the two numbers is : "+(a%b));//return the remainder value;
	
	
	//Relational Opertaors/ Comparasion > >= < <= != == 
	
	//it returns the boolean value
	
	System.out.println(a<b);   // true
	System.out.println(a<=b);  //true
	System.out.println(a>b);   //false
	System.out.println(a>=b);  //false
	System.out.println(a!=b);  //true
	System.out.println(a==b);  //false
	
	
	//logical operators && || !    it returns the boolean value; 
	//used to work with two boolen values
	
	boolean x=true;
	boolean y =false;
	
	System.out.println("Logical operators"+(x&&y));
	System.out.println(x||y);
	System.out.println(!y);
	System.out.println(!x);
	
	//increment decrement operators 
	
	int i,j;
	
	i=1;
	j=10;
	i++;
	
	System.out.println(i++);//2
	System.out.println(i--);//1
	System.out.println(j++);//11
	System.out.println(j++);//12
	System.out.println(j--);//11
	
    //Assignment Operators  = += -= *= /= %=
	
	i=9;
	i+=5;  ///i=i+5
	
	System.out.println(i);
	
	
	a=10;
	b=5;
	
	int t=(a>b)?a:b;
	System.out.println(t);
	
	int age = 17;
	
	String result = (age>=18)?"Eligible" : "Not Eligle";
	System.out.println(result);
	
	
	//swap the two numbers without using the temporay variable
	
	
	
	
	}

}
