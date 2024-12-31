package Day18;

public class CheckedException 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("The program is started ......");
		System.out.println("The program is in progress....");
		
	    Thread.sleep(5000);                                  //Checked exception is checked by the compiler ,Can use try catch and Throws exception to handle
		
		System.out.println("The program is ended");
		
	}

}
