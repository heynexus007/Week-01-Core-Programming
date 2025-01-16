//10
import java.util.Scanner;
class ConvertToLowerCaseCharacters {

    // Method convert character to Lower Case
    public static String convertLowerCase(String v) {
		StringBuilder lowerStr = new StringBuilder("");
		for(int i=0;i<v.length(); i++){
			char c= v.charAt(i);
			
			if(c>='A' && c<= 'Z'){
				char lowerChr = (char) (c +32);
				// char lowerChr = (char) (c + 'a' + 'A');
				lowerStr.append(lowerChr);
			}
			else
				lowerStr.append(c);
		}
		return lowerStr.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a String : ");
		String s = input.nextLine();
		String lowerStr = s.toLowerCase();
		System.out.println(convertLowerCase(s));
		
		// Comparing equal or not by both methods
		System.out.println("Both String are equals using built-in and user-defined method? "+convertLowerCase(s).equals(lowerStr));
		
        
		// Closing scanner obj
        input.close();
    }
}