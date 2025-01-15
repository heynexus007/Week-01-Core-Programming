//2
import java.util.*;
public class NumberChecker2 {
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
	// function 3 for calc sum Of Digit
    public static int sumOfDigit(int number){
        int []digits=digitInNumber(number);
		int sum=0;
		for(int i=0;i<digits.length;i++){
			sum=sum+digits[i];
		}
		return sum;
    }
	// function 4 for calc sumOfSquareOfDigit
    public static double sumOfSquareOfDigit(int number){
        int []digits=digitInNumber(number);
		double sum=0;
		for(int i=0;i<digits.length;i++){
			sum=sum+Math.pow(digits[i],2);
		}
		return sum;
    }
	// function 5 for checkHarshad
    public static boolean checkHarshad(int number){
        int sumOfDigit=sumOfDigit(number);
		if(number%sumOfDigit==0){
				return true;
		}
		return false;
    }
	// function 6 for counting frequencyOfDigit
    public static int[][] frequencyOfDigit(int number){       
        int [][]digits=new int[10][2];
		for(int i=0;i<digits.length;i++){
			int digit=number%10;
            digits[digit][1]++;
            digits[digit][0]=digit;
            number=number/10;
		}
		return digits;
    }
	
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
		//Taking input
        System.out.println("Enter the number");
        int number=input.nextInt();
    

        int res1=countDigit(number);		//calling of method countDigit
        int[]res2=digitInNumber(number); 	//calling of method digitInNumber
        int res3=sumOfDigit(number);			//calling of method sumOfDigit
        double res4=sumOfSquareOfDigit(number); //calling of method
        boolean res5=checkHarshad(number);	//calling of method sumOfSquareOfDigit
        int[][]res6=frequencyOfDigit(number); 	//calling of method frequencyOfDigit


        System.out.println("Count of digits is "+res1);

        System.out.println("Digits in number are ");
        for(int i=0;i<res2.length;i++){
            System.out.println(res2[i]);
        }
        System.out.println("Sum  of digits is "+res3);
        System.out.println("Sum of Square of digits are "+res4);
        System.out.println("The number is Harshad number ? "+res5);
        
        for(int i=0;i<10;i++){
            System.out.println("Digit "+res6[i][0]+" frequency "+res6[i][1]);
        }
    
		// Closing Scanner 
		input.close();
    }
}