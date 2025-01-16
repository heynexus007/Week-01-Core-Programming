//6
import java.util.*;
class HandlingIllegalArgumentException{ 
	public static void generatesException(String v){
		String subStr = str.substring(4,1);
      }
      public static void handlesException(String v){
        // Catching the object of exception by try - catch block
      try{ 
        // Trying to genrate exception
        generatesException(v);
      } 
	  catch(StringIndexOutOfBoundsException e){
        System.out.println("Opps!!! You just triggered a Illigal Argument exception!" + e.getMessage());
      }
	  catch(RuntimeException e){
        System.out.println("Caught a RuntimeException! " + e.getMessage());
      }
}
      public static void main(String[] args){
		  Scanner input = new Scanner(System.in);
		// Creating a string and taking user input in it
		System.out.println("Enter a String : ")
        String s = input.next();
		
		// Calling Exception method
		handlesException(s);
      }
}