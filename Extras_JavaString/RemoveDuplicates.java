//4
import java.util.*;
//Basic method:
class RemoveDuplicates {
	public static String removeDuplicatesChr(String s){
		StringBuilder sb= new StringBuilder("");
		boolean check[]=new boolean[26];
		s.toLowerCase();
		
		for(int i=0; i<s.length(); i++){
			char c= s.charAt(i);
			if(!check[c-'a']){
				sb.append(c);
				check[c-'a']=true;
			}
		}
		return sb.toString();
	}
		
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a String
		System.out.print("Enter String : ");
        String s1 = input.next();
		
		System.out.println(" String before removing element : "+ s1);
		System.out.println(" Modified String after removing element : "+ removeDuplicatesChr(s1));
	
	// Closing scanner obj
    input.close();
    }
}
