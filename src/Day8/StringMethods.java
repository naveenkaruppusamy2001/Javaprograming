package Day8;

public class StringMethods {

	public static void main(String[] args) 
	{
		
	//length -- Used to find the length of the string
		
		String s= "Navee";
		System.out.println("The length of the given string"+ s.length());
		
		//contact the diffent strings
		
         String s1="Testing";
         String s2="methods";
         String s3="and its types"; 
        System.out.println("The concat of three strings "+ s1.concat(s2).concat(s3)); 
        
        //trim method
        
        String s4="                  testing                     "; 
        System.out.println(s4.length());
        String s5= s4.trim();
        System.out.println(s5.length());
        
        //CharA method to get the single character in a array using the index.
       System.out.println(s5.charAt(1)); 
       System.out.println(s5.charAt(2)); 
       
       
      //contains method returnd the boolean value if it contains
       
       System.out.println(s5.contains("T"));
       
       
       //equals(), EqualsIgnore case method is used to compare the strings returns the boolean value.
       
      System.out.println(s5.equals("Testing")); 
       
      System.out.println(s5.equalsIgnoreCase("Testing")); 
      
      String name = "Ravi";
      
      name.replace("Ravi","Ram");
      
      System.out.println(name.replace("Ravi","Ram"));
      
     String replacedvalue= s5.replaceAll(s5,name);
     
     System.err.println(replacedvalue);
       
       
	}
	
	
}
