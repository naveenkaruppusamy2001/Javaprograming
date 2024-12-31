package Day12;

public class Adder
{                      ///Method overloading is a concept 
	int x=100;
	int y =200;
	
	void add()
	{
		System.out.println(x+y);
		
	}
	void add(int x,int y)   ///Method Overloading by changing the parameters
	{
		System.out.println(x+y);
		
	}
	void add(int x,int y,int z)  //By changing the couts of parameters
	{
		System.out.println(x+y+z);
		
	}
	
	void add(int x,double y)  //By changing the datatype of the params
	{
		System.out.println(x+y);
		
	}
	
	void add(int x,int y,double z) //by changing the params 
	{
		System.out.println(x+y+z);
		
	}

}
