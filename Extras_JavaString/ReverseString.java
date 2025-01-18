//2
import java.util.*;
class ReverseString {
	public static String getReverse(String s){
			String rev= "";
			for(int i=s.length()-1; i>=0 ; i--){
				rev+=s.charAt(i);
			}
			return rev;
		}
		
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a String
		System.out.print("Enter String : ");
        String s1 = input.next();
		
		System.out.println("Normal String : "+ s1);
		System.out.println("Reverse String : "+getReverse(s1));
	
	// Closing scanner obj
    input.close();
    }
}
