package Day15;


class bank
{
	double ROI() 
	{
		return 0;
	}
}

class ICICI extends bank
{
	double ROI() 
	{
		return 10.5;
	}
}

class SBI extends bank
{
	double ROI() 
	{
		return 20.5;
	}
}




public class OverridingCDemo 
{
	public static void main(String[] args)
	{
		ICICI obj=new ICICI();
		System.out.println(obj.ROI());
		SBI obj1=new SBI();
		System.out.println(obj1.ROI());
	}

}
