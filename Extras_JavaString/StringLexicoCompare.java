import java.util.*;
class StringLexicoCompare{
    public static int compare(String s1, String s2){
        int minLen=Math.min(s1.length(),s2.length());
        if(s2.length()>s1.length())
        return -1;

        else if(s1.length()>s2.length())
        return 1;

        for(int i=0; i<minLen; i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(c2>c1) return -1;
            else if(c1>c1) return 1;
            else return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s1=input.next() ; //"apple"
        System.out.print("Enter String 2 : ");
        String s2=input.next(); //"banana"

        // int res=s1.compareTo(s2); //built-in Method
        // user-defied method
        int res=compare(s1, s2);
        if(res<0)
        System.out.println("\""+s1+"\" comes before \""+s2+"\" in lexicographical order");

        else if(res>0)
        System.out.println("\""+s1+"\" comes after \""+s2+"\" in lexicographical order");

        else
        System.out.println("\""+s1+"\" is equal to \""+s2+"\"");
    }
}