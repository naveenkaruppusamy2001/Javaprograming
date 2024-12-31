package Day11;

public class student 

{
	int stdid;
	String name;
	
	
	void intialize(int a,String b)
	
	{
		stdid=a;
		name=b;
		
	}
	
	void display()
	{
		System.out.println(stdid+"    "+name);
	}
	//Default constructor
	student()    //Constructor name should be name of the class
	             //it does not return any value,can pass params
	{
		
		stdid=100;
		name="Ajay";	
	}
	
	student(int a,String b)   //Paramteized constructor
	{
		stdid=a;
		name=b;
		
	}

}
