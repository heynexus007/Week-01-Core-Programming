//5
import java.util.*;
class HandlingStringIndexOutOfBoundException{ 
	public static void handleException(String v){
		  
			// Catching the exception by try - catch block
		try{ 
			// Trying to get char which index is not availible, this will through an error.
			char ch = str.v(7);
		} 
		catch(StringIndexOutOfBoundsException e){
			System.out.print("Opps! you are trying to get index value which is not availible in that string");
		}
	}
	public static void main(String[] args){
            // Creating a string and assigning string to it
            String str = "nexus";
             // calling handleException method
            handleException(str);
	}
}