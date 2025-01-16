//1
import java.util.Scanner;
class CompareStrings {
	boolean areEqual(String s1, String s2){
		for(int i=0; i<s1.length(); i++){
			if(s1.length()!=s2.length())
				return false;
			
			if(s1.charAt(i)!= s2.charAt(i))
				return false;
		}
		return true;
	}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a String
		System.out.print("Enter String 2 : ");
        String s1 = input.next();
		
		System.out.print("Enter String 1 : ");
        String s1 = input.next();
		
		// Calling method by creating
		CompareStrings check = new CompareStrings();
		// Printing String are equals or Not
		System.out.println("Both Strings are the same? " + check.areEqual(s1,s2));
		System.out.println("Both Strings are the same using Built-in method? " + s1.equals(s2));
		
    input.close();
    }
}
