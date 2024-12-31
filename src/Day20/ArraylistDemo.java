package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Gatherer.Integrator;

public class ArraylistDemo
{

	public static void main(String[] args)
	{
		
		//Declaration
		
		ArrayList arr=new ArrayList(); //used for the hetrogeneous data
		//List mylist=new ArrayList();     //Child class variable is stored in the parent

		//ArrayList <Integer>arr=new ArrayList<Integer>();  //usage of homogeneous data
		//ArrayList <String>arr=new ArrayList<String>();
		
		
		//Adding data into arraylist
		arr.add(100);
		arr.add(100.5);
		arr.add("Java");
		
		
		//Size of the Array list
		
		arr.size();
		System.out.println(arr.size());
		
		//Print the array
		System.out.println(arr);
		
		//Remove the element in the array
		arr.remove(1);
		System.out.println(arr);
		
		
		//Insertion in the array list 
		arr.add(2,"welcome");
		System.out.println(arr);
		
	
		//Modify the value 
		arr.set(2,"Welcome Java first");
		System.out.println(arr);
		
		//Access specific element
		Object x=arr.get(2);
		System.out.println("The element in the index of 2:   " +x);
		
		//Reading all the elements in the arraylist 
		
		//Using the forlopp
		
		for (int i = 0; i<arr.size()-1; i++) 
		{
			System.out.println(arr.get(i));
			
		}
		
		//using the forloop
		
		for(Object x1:arr) 
		{
			System.out.println(x1);
		}
		
		//using the iterator
		
		Iterator it=arr.iterator();
		System.out.println(it.hasNext());
		while(it.hasNext()) 
		{
			System.out.println("The list of elements were printer using the iterator concept "+it.next());
		}
		
		//Remove all the elements
		ArrayList Arr1=new ArrayList();
		Arr1.add("Java");
		
		arr.removeAll(Arr1);
		System.out.println(arr);
		
		
		
	}
}
