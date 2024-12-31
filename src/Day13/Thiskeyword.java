package Day13;

public class Thiskeyword 
{

	int x;
	int y;   //Class variable or instance variable 
	
	
	
	
	Thiskeyword(int x,int y)
	{
	
		this.x=x;
		this.y=y;   //this keyword is used to specify the class variable
		
	}
	         
	
	void display() 
	{
		System.out.println(x+y);
		
	}
	public static void main(String[] args) 
	{
		
		Thiskeyword obj=new Thiskeyword(100, 200);
		obj.display();
		
	
	}
}
