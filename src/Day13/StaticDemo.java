package Day13;

public class StaticDemo 
{
	
	 int a=100;

	static int b=300;
	
	
	static void add() 
	
	{
		System.out.println("This is the static method ");
		
		
	}
	
	void add1()
	{
		System.out.println("This is the non static method");
	}
	
     public static void main(String[] args)
     {
    	add();
    	System.out.println(b);
    	
    	StaticDemo obj=new StaticDemo();
    	obj.add1();
    	System.out.println(obj.a);
    	 
     }
}
