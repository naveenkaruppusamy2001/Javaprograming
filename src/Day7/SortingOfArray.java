package Day7;
import java.util.Arrays;

public class SortingOfArray 
{
	public static void main(String[] args) 
	{
		/*int a[]= {3,1,5,2,5,6,1,7};
		
		System.out.println("Before Sorting: "+Arrays.toString(a));  //Inbuild method to print the enter values in the array
		
		Arrays.sort(a);                                             //Inbuild method used to sort the given array 
		
		System.out.println("After Sorting: "+Arrays.toString(a));*/
		
		
		
		String a[]= {"Naveen","Pradeesh","Imman","AB","BC","DE"};
		
		System.out.println("Before Sorting: " + Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("Array After sorting: " + Arrays.toString(a));
	}
	

}
