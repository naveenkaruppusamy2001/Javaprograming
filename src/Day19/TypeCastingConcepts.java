package Day19;

public class TypeCastingConcepts 
{ 
	public static void main(String[] args) 
	{
		
		int intvalue =100;                  ///upcasting --Converting the lower datatype to the higher datatype
		float floatvalue=intvalue;
		System.out.println(floatvalue);
		
		
		float floatvalue1=100.7f;
		double doublevalue=floatvalue1;        ///upcasting --Converting the lower datatype to the higher datatype
		System.out.println(doublevalue);
		
		
		
		double d=10000.00;
		int value=(int)d;                         //downcasting --Converting the higher datatype to the lower datatype
		System.out.println(value);
	}

}
