//9
import java.util.Scanner;
class ConvertToUpperCaseCharacters {

    // Method convert character to Upper Case
    public static String convertUpperCase(String v) {
		StringBuilder upStr = new StringBuilder("");
		for(int i=0;i<v.length(); i++){
			char c= v.charAt(i);
			
			if(c>='a' && c<= 'z'){
				// char upperChr = (char) (c - 32);
				char upperChr = (char) (c - 'a' + 'A');
				upStr.append(upperChr);
			}
			else
				upStr.append(c);
		}
		return upStr.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a String : ");
		String s = input.nextLine();
		String upperStr = s.toUpperCase();
		System.out.println(convertUpperCase(s));
		
		// Comparing equal or not by both methods
		System.out.println("Both String are equals using built-in and user-defined method? "+convertUpperCase(s).equals(upperStr));
		
        
		// Closing scanner obj
        input.close();
    }
}