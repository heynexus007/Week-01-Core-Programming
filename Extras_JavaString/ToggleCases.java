//7
import java.util.*;
//Basic method:
class ToggleCases {
	
	public static String toggleCharacterCase(String s){
		StringBuilder sb= new StringBuilder();
		for(char c : s.toCharArray()){
			//LowerCase converts to UpperCase
			if(c==Character.toLowerCase(c))
				sb.append(Character.toUpperCase(c));
			
			//UpperCase converts to LowerCase
			else
				sb.append(Character.toLowerCase(c));
		}
		// Convert StringBuilder to String
		return sb.toString();
	}
		
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a String
		System.out.print("Enter String1 : ");
        String s1 = input.next();

		System.out.println("Normal String "+s1);
		System.out.println("String after convert character cases : "+ toggleCharacterCase(s1));
	
	// Closing scanner obj
    input.close();
    }
}
