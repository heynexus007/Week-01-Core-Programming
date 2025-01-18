//6
import java.util.*;
//Basic method:
class SubstringOccurence {
	public static int getOccurence(String s1, String s2){
		int countSubstr=0;
		for(int i=0; i<s1.length();i++){
			int check=0;
			for(int j=0, k=i; j<s2.length() && k< s1.length(); j++,k++){
				if(s1.charAt(k)==s2.charAt(j)) check++;
				
				if(check==s2.length())
					countSubstr++;
				
			}
		}
		return countSubstr;
	}
		
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a String
		System.out.print("Enter String1 : ");
        String s1 = input.next();
		
		System.out.print("Enter String2 : ");
        String s2 = input.next();

		System.out.println("String occurs : "+ getOccurence(s1,s2));
	
	// Closing scanner obj
    input.close();
    }
}
