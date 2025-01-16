//4
import java.util.*;
class HandleNullPointerException{ 
      public static void generatingException(String v){
            int vLen = v.length();
      }
      public static void handleException(String v){
          // Catching the exception by try - catch block
      try{ 
          // Generating exception
           generatingException(v);
      } catch(NullPointerException e){
           System.out.print("Opps! Something went wrong!!!");
      }
}
      public static void main(String[] args){
            // Creating a string and assigning null to it
            String s1 = null;
             // Calling method
            handleException(s1);
      }
}