package Day20;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo
{

	public static void main(String[] args) 
	{
		HashSet mylist=new HashSet();

		//Adding the values the HashSet 

		mylist.add(100);
		mylist.add("Java");
		mylist.add("A");
		mylist.add(100.99);
		mylist.add("10");
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);
		mylist.add("java");
		
		System.out.println(mylist); ///[null, Java, A, java, 100, 100.99, 10]
		
		//Insertion Order is not preserved/Duplicates are removed/Multiple Null is not allowed.
		
		//Remove the specific element in the hashset
		
		mylist.remove("Java");
		System.out.println(mylist);  //[null, A, java, 100, 100.99, 10]
        
		//Insertion is not possible in the hashset
		//Since there is no order of storing 
		
		//Accessing the specific element is not possible
		
		//Retriving the value from the HashSet
		
		
		ArrayList al=new ArrayList(mylist);
		
		System.out.println(al);
		System.out.println(al.get(2));
		
		
		
		
	}
}
