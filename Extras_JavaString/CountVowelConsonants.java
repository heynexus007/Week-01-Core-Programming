//1
import java.util.*;
class CountVowelConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a String
		System.out.println("Enter String : ");
        String s1 = input.next();
		
		int vCnt=0,lCnt=0;
		for (char c : s1.toCharArray()){
			if("aeiouAEIOU".indexOf(c)!=-1)
				vCnt++;
			
			else if (Character.isLetter(c))
				lCnt++;
		}
		
		// Printing String are vowel and letter count
		System.out.println("Number of vowels in a String is : " + vCnt);
		System.out.println("Number of Consonants in a String is : " + lCnt);
		
    input.close();
    }
}
