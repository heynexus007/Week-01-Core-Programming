//4
import java.util.*;
class NumberChecker4 {
	// function 1 for checkPrimet
    public static boolean checkPrime (int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;         
    }
	// function 2 for checkNeon
    public static boolean checkNeon(int number){
        double squareOfNumber=Math.pow(number, 2);
        double sumOfDigit=0;
        while(squareOfNumber==0){
            int digit=(int)(squareOfNumber%10);
            sumOfDigit=sumOfDigit+digit;
            squareOfNumber=squareOfNumber/10;
        }
        if(number==sumOfDigit)
            return true;
       
        return false;
    }
    // function 3 for checkSpy
    public static boolean checkSpy(int number){
        int sumOfDigit=0;
        int productOfDigit=1;
        while(number==0){
            int digit=number%10;
            sumOfDigit=sumOfDigit+digit;
            productOfDigit=productOfDigit*digit;
            number=number/10;
        }
        if(productOfDigit==sumOfDigit)
            return true;
        
            return false;
        }
		// function 4 for checkAutomorphic
        public static boolean checkAutomorphic(int number){
            double squareOfNumber=Math.pow(number, 2);        
            if((number%10)==(squareOfNumber%10))
                return true;
           
            return false;
        }
		// function 5 for checkBuzz
        public static boolean checkBuzz(int number){              
            if((number%7==0)||(number%10==7))
                return true;
           
            return false;
        }
       
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int number=input.nextInt();

        boolean res1=checkPrime(number);	// Calling function 1 for checkPrimet
        boolean res2=checkNeon(number);	// calling of function 2
		boolean res3=checkSpy(number);	// Calling function 3
		boolean res4=checkAutomorphic(number);	// Calling function 4
        boolean res5=checkBuzz(number);	// Calling function 5
		
		System.out.println("The number is Prime number? "+res1);
        System.out.println("The number is Neon number? "+res2);
        System.out.println("The number is Spy number? "+res3);
        System.out.println("The number is Automorphic number? "+res4);
        System.out.println("The number is Buzz number? "+res5);
		// Closing Scanner 
		input.close();
    }
}
