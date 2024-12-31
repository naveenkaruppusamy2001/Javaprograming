package Day20;

import java.util.HashMap;


public class HashmapDemo
{

	public static void main(String[] args)
	{
		HashMap hm=new HashMap();
		
	
		hm.put(100, "naveen");
		hm.put(101, "naveen");
		hm.put(102, "naveen");
		hm.put(103, "naveen");
		hm.put(104, "naveen");
		
		System.out.println(hm);
		
		Object S =hm.size();
		System.out.println("To display the size of the hashmap: " +S);
		
		//Remove the pair
		
		hm.remove(100);
		System.out.println(hm);
		
		//Access the value of the key
		
		System.out.println(hm.get(101));
		
		//Get all the keys from the hashset
		
		System.out.println(hm.keySet());   //Get only the key
		System.out.println(hm.values());   //Get all the values
	    System.out.println(	hm.entrySet()); //Get the both key and value
	    
	    
	    
		
		
	}
}
