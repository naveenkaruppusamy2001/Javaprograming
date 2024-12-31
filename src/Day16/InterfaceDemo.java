package Day16;

interface shape
{
	
	int length =10;    //final & Static
	int width =20;    //final & Static
	
	void circle();    //abstract method
	
	
	default void square() 
	{
		System.out.println("This is the square default method ");
	}
	
	static void rectangle() 
	{
		System.out.println("This is the rectangle - static method ");
	}
	
	
	
	
}



public class InterfaceDemo implements shape {
	
	public void circle() 
	{
		System.out.println("This is the circle of the abstract class");
	}
	public static void main(String[] args)
	{
//		InterfaceDemo obj=new InterfaceDemo();
//		obj.square();
//		obj.circle();
//		
//		shape.rectangle();  ///static method can directly call method 
		
		
		//scenerio 2
		
		shape sh=new InterfaceDemo();
		sh.square();
		sh.circle();
		
		shape.rectangle();
		
		
	}

}
