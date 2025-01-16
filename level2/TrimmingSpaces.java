import java.util.*;
 class TrimmingSpaces {
    //method to trim the extra leading and trailing space
    public static String doingTrim(String v){
        int low = 0;
        int high = v.length()-1;
        while(low<high){
            if(v.charAt(low)==' '){
                low++;
            }
			else if(v.charAt(high)==' '){
                high--;
            }
			else{
                break;
            }
        }
        return v.substring(low, high+1);
    }
    public static void main(String[] args) {
        // Scanner object to take input
        Scanner input = new Scanner(System.in);
        // take input from the user
        System.out.println("Please Enter any String with leading and trailing spaces : ");
        String s = input.nextLine();
		
        // trim by built in method
        String built_InTrim = s.trim();
		
        // trim by user defined method
        String userDefined_Trim = doingTrim(s);
		
        // printing both the result and boolean value
        System.out.println("This is the output of user defined method to trim --> "+userDefined_Trim);
        System.out.println("This is the out of built in trim method of string --> " +built_InTrim);
        System.out.println("Both are equals ==> "+userDefined_Trim.equals(built_InTrim));
        
		//close the scanner object
        input.close();
    }
}