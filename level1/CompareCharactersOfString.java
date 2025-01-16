//3
//import java.util.Scanner;
import java.util.Scanner;
class CompareCharactersOfString {
	// Method to create a substring using charAt()
	public static char[] gettingCharacter(String s){
		char [] ch= new char[s.length()];
		for(int i=0; i<s.length(); i++){
			c[i]=s.charAt(i)
		}
		// Convert StringBuilder to String and return
	}
	// Method to compare two strings using charAt()
	public static boolean compareStr(String s1, String s2){
		if (s1.length()!=s2.length())
			return false;		// If lengths are different, they are not equal
		
		for(int i=0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i))
				return false;	// If any character is different, return 'false'
		}
		
		return true;	// other all chr are equal
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a String
		System.out.print("Enter String : ");
        String s1 = input.next();
		// Taking input for start and end indices
		System.out.print("Enter Start Index : ");
		int startIdx = input.nextInt();
		System.out.print("Enter End Index : ");
		int endIdx = input.nextInt();
		
		// Calling method by creating
		//CompareSubstrings check = new CompareSubstrings();
		
		String finalRes = substringUsingCharAt(s1,startIdx,endIdx);
		String builtInSubstr = s1.substring(startIdx,endIdx);
		// Comparing both Strings
		boolean checkEqual= compareStr(finalRes,builtInSubstr);
		// Printing the results
		System.out.println("Substring using CharAt() method : " + finalRes);
		System.out.println("Substring using built-in method : " + builtInSubstr);
		System.out.println("Are both Substrings are equals? "+ checkEqual);
		
		//  Closing Scanner obj
		input.close();
    }
}
