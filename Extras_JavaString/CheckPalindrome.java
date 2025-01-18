//3
import java.util.*;
class CheckPalindrome {
	public static boolean isPalind(String s){
		for(int i=0; i<=s.length()/2 ; i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
			}
			return true;
		}
		
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a String
		System.out.print("Enter String : ");
        String s1 = input.next();
		
		if(isPalind(s1))
		System.out.println("String is a Palindrome");
	
		else
		System.out.println("String is not a Palindrome");
	
	// Closing scanner obj
    input.close();
    }
}
