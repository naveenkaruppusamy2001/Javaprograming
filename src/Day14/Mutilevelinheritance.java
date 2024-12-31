package Day14;

class A
{
	int a=100;
}

class b extends A
{
	int b=101;
}

class c extends b
{
	int c=102;
	
}

class D extends c
{
	int d=100;
	void add()
	{
		int sum =a+b+c+d;
		System.out.println(sum);
		
		
	}
	
	
	
}



public class Mutilevelinheritance {
	
	public static void main(String[] args) 
	{
		
		D obj=new D();
		
		System.out.println(obj.b);
		int a[]= {100,200,300};
		System.out.println(a[0]);
		
		
	}

}
