//6
import java.util.*;
public class NumberChecker6 {
    // Method 1 for factorsOfNumber
    public static int[]factorsOfNumber(int number){
         int maxFactor = 10;
         int[] factors = new int[maxFactor]; 
         int index = 0; 
         for (int i = 1; i <= number; i++) {
             if (number % i == 0) { 
                 factors[index++] = i;
                 if (index == maxFactor) {
                     maxFactor *= 2; 
                     int[] temp = new int[maxFactor]; 
                     for(int a=0;a<factors.length;a++){
                         temp[a]=factors[a];
                     }
                     factors = temp;
                 }
             }
        }
        return factors;
    }
	// Method 2 for greatestFactor
    public static int greatestFactor(int number){
        int greatestFactor=1;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
            if(factor[i]>greatestFactor){
                greatestFactor=factor[i];
            }
        }
        return greatestFactor;
    }
	// Method 3 for sumOfFactor
    public static int sumOfFactor(int number){
        int sumOfFactor=0;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
            sumOfFactor=sumOfFactor+factor[i];
        }
        return sumOfFactor;
    }
	// Method 4 for productOfFactor
    public static int productOfFactor(int number){
        int productOfFactor=1;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
            productOfFactor=productOfFactor*factor[i];
        }
        return productOfFactor;
    }
	// Method 5 for cubeOfFactors
    public static double[] cubeOfFactors(int number){
        int[] factor=factorsOfNumber(number);
        int size=factor.length;
        double[] cubeOfFactors=new double[size];
        for(int i=0; i<size ;i++){
            cubeOfFactors[i]=Math.pow(factor[i],3);
        }
        return cubeOfFactors;
    }
	// Method 6 for checkPerfect
    public static boolean checkPerfect(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number==sumOfDivisor)
            return true;
        return false;
    }
	// Method 7 for checkAbundant
    public static boolean checkAbundant(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number<sumOfDivisor)
            return true;
        return false;
    }
	// Method 8 for checkDeficient
    public static boolean checkDeficient(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number>sumOfDivisor)
            return true;
        return false;
    }
	// Method 9 for factorial
    public static int factorial(int digit){
        int factorial=1;
        for(int i=1;i<=digit;i++){
            factorial=factorial*i+1
        }
        return factorial;
    }
	// Method 10 for checkStrong
    public static boolean checkStrong(int number){
        if(number<0){
            return false;
        }
        int sumOfFactorialOfDigits=0;
        int temp=number;
        while(temp==0){
            int digit=temp%10;
            temp=temp/10;
            sumOfFactorialOfDigits=sumOfFactorialOfDigits+factorial(digit);
        }
        if(number==sumOfFactorialOfDigits)
            return true;
        return false;
    }
	//Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        int number=input.nextInt();

		// Calling of method for particular functions
        int[] res1=factorsOfNumber(number);		
        int res2=sumOfFactor(number);		//Calling of method
        int res3=greatestFactor(number);	//Calling of method
        int res4=productOfFactor(number);	//Calling of method
        double[] res5=cubeOfFactors(number);	//Calling of method

        boolean res6=checkPerfect(number);	//Calling of method countDigit
        boolean res7=checkAbundant(number); //Calling of method mean
        boolean res8=checkDeficient(number);	//Calling of method
        boolean res9=checkStrong(number);	//Calling of method
        System.out.println("Factors of number "+number);	//Calling of method
        for (int i=0; i <res1.length; i++) {
            System.out.println(res1[i]+",");
        }
        System.out.println("Cube of Factors of number "+number);
        for (int i=0; i <res1.length; i++) {
            System.out.println(res5[i]+",");
        }
        System.out.println("Greatest Factors of number "+number+" is "+ res2);
        System.out.println("Sum Factors of number "+number+" is "+ res2);
        System.out.println("Greatest Factors of number "+number+" is "+ res4);
        System.out.println("The number is Perfect number? "+res6);
        System.out.println("The number is Abundant number? "+res7);
        System.out.println("The number is Deficient number? "+res8);
        System.out.println("The number is Strong number? "+res9);
		
		// Closing Scanner 
		input.close();
    }
}

