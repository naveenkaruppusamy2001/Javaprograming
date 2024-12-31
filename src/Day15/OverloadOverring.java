package Day15;

class abc
{
	void display(int a) 
	{
	System.out.println(a);	
	}
	
	void print(int b) 
	{
		System.out.println(b);
	}
	
	
}

class xyz extends abc
{
	void display(int a) ////overiding
	{
	System.out.println(a*a);	
	}
	
	void print(int b,int c)    //overloading
	{
		System.out.println(b+c);
	}
}

public class OverloadOverring
{
	public static void main(String[] args)
	{
		xyz obj=new xyz();
		obj.display(20);
		obj.print(60);
		obj.print(20, 40);
		
	}

}
