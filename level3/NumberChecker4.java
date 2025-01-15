//3
import java.util.Scanner;
class NumberChecker3 {
	// function 1 for counting Digit
    public static int countDigit(int number){
		int count=0;
		while(number!=0){
			count++;
			number=number/10;
		}
		return count;
	}
	// function 2 for digitInNumber
    public static int[]digitInNumber(int number){
		int countDigit=countDigit(number);
		int []digits=new int[countDigit];
		int i=0;
		while(number!=0){
			digits[i]=number%10;
			number=number/10;
			i++;
		}
		return digits;
    }
	// function 3 for reverseDigits
    public static int[]reverseDigits(int number){		
		int []digits=digitInNumber(number);
        int size=digits.length;
        int []reverse=new int[size];
		for(int i=0;i<size;i++){
            reverse[i]=digits[size-i-1];
        }
		return reverse;
    }
	// function 4 for checkPalindrome
    public static boolean checkPalindrome(int number){
        int []digits=digitInNumber(number);
        int []reverse=reverseDigits(number);
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=reverse[i])
                return false;

        }
        return true;
    }
	// function 5 for checkDuck
    public static boolean checkDuck(int number){
        int []digits=digitInNumber(number);
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
		// Taking input
        System.out.println("Enter the number");
        int number=input.nextInt();

        int res1=countDigit(number);		// Calling of method countDigit
        int[]res2=digitInNumber(number);	// Calling of method digitInNumber
        boolean res3=checkPalindrome(number); // Calling of method checkPalindrome
        boolean res4=checkDuck(number);		// Calling of method checkDuck

        System.out.println("Count of digits is "+res1);
        System.out.println("Digits in number are ");
        for(int i=0;i<res2.length;i++){
            System.out.println(res2[i]);
        }
		System.out.println("The number is Palindrome number ? "+res3);
		System.out.println("The number is Duck  number ? "+res4);
		
		// Closing Scanner 
		input.close();
    }
}
