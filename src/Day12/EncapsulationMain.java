package Day12;

public class EncapsulationMain
{
	public static void main(String[] args) 
	{
		
		Encapsulation obj=new Encapsulation();
		
		obj.setAccno(100227543);
		obj.setName("John");
		obj.setCuid(121);
		
		int a=obj.getAccno();
		System.out.println(a);
		String n=obj.getName();
		System.out.println(n);
		int c=obj.getCuid();
		System.out.println(c);
		
	}

}
