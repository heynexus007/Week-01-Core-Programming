import java.util.*;
class LongestWordz{
    public static String getLongestWord(String s){
        // Split the sentence and store in StringArray
        String hold []= s.split(" ");
        String longestWord="";
        for(String k: hold){
            //Comparing if wordLength and longestWord length
            if(k.length()>longestWord.length())
            longestWord=k;
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter Sentence : ");
        String s=input.nextLine();

        //Call method and displaying result
        System.out.println(getLongestWord(s));

        //Closing Scanner
        input.close();
    }
}