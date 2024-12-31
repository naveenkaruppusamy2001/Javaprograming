package Day4;

public class Switch_Case_Statement {
	
	public static void main(String[] args) {
		
		String day ="Monday";
		
		switch (day) {
		case "Monday": 
			
			System.out.println("The day is monday");
			break;
		    case "Tuesday": 
			
			System.out.println("The day is Tuesday");
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
	}

}
