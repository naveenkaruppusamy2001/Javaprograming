package Day19;



class Animal
{
	int Ani=100;
	void m1()
	{
		
		System.out.println("This method belongs to animal");	
	}	
}

class Cat extends Animal
{
	int cat=209;
	
	void m2() 
	{
		System.out.println("Thus method belongs to cat");	
		
	}
}

class Dog extends Animal
{
	
  int dog=500;
  
 void  m3()
  {
	  System.out.println("The method belongs to the dog");
}
}


public class Typecasting_Objects 
{
	public static void main(String[] args) 
	{
//		Dog d=new Dog();
//		d.m1();
//		d.m1();
		
		Animal d=new Dog();
		Dog c= (Dog) d;
		c.m1();
		
//		
	}

}
