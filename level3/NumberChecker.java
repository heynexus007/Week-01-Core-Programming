//2
import java.util.Scanner;
public class NumberChecker{
	// function 1 for counting Digit
	public static int countDigit(int number){
		int count=0;
		while(number!=0){
			count++;
			number=number/10;
		}
		return count;
	}
	// function 2 for digit in Number
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
	// function 3 for finding checkDuck
	public static boolean checkDuck(int number){
		int[]digits=digitInNumber(number);

		for(int i=0;i<digits.length;i++){
			if(digits[i]==0)
				return false;
		}
		return true;
	}
	// function 4 for check Armstrong
	public static boolean checkArmstrong(int number){
		int[]digits=digitInNumber(number);
		int sum=0;
		for(int i=0;i<digits.length;i++){
			sum=sum+(digits[i]*digits[i]*digits[i]);			
		}
		boolean check=(sum==number);
		return check;
	}
	// function 5 for finding largest And SecondLargest
	public static int[]largestAnd2ndLargest(int number){
		int[]digits=digitInNumber(number);
		int largest=Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;
        	// Finding the largest element
        	for (int i = 0; i <digits.length; i++) {
            	if (digits[i] > largest)
                	largest = digits[i];
        	}
        	// Finding the second largest element
        	for (int i = 0;i <digits.length; i++) {
           	 	//Update second largest if the current element is greater
           	 	//than second largest and not equal to the largest
           	 	if (digits[i] > secondLargest && digits[i] != largest) {
               			secondLargest = digits[i];
           		}
       	 	}
		int[]largestNdSecondLargest={largest,secondLargest};
		
		return largestNdSecondLargest;
	}
	// function 6 for finding smallestAndSecondSmallest
	public static int[]smallestAnd2ndSmallest(int number){
		int[]digits=digitInNumber(number);
		int smallest=Integer.MAX_VALUE, secondSmallest=Integer.MAX_VALUE;
        	// Finding the largest element
        	for (int i = 0; i <digits.length; i++) {
            	if (digits[i] < smallest)
                	smallest = digits[i];
        	}
        	// Finding the second largest element
        	for (int i = 0;i <digits.length; i++) {
           	 	//Update second largest if the current element is greater
           	 	//than second largest and not equal to the largest
           	 	if (digits[i] < secondSmallest && digits[i] != smallest) {
               			secondSmallest = digits[i];
           		}
       	 	}
		int[]smallestNdSecondSmallest={smallest,secondSmallest};
		
		return smallestNdSecondSmallest;
	}
	
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number=input.nextInt();

		int res1=countDigit(number);	//calling of method countDigit
		int[]res2=digitInNumber(number);//calling of method mean
		int[]res3=smallestAnd2ndSmallest(number);//calling of method shortest
		int[]res4=largestAnd2ndLargest(number);	//calling of method tallest
		
		System.out.println("Count of digits is "+res1);

		System.out.println("Digits in number are : ");
		for(int i=0;i<res2.length;i++){
			System.out.println(res2[i]);
		}

		System.out.println("largest And SecondLargest of digits are "+res4[0]+" and "+res4[1]);
		System.out.println("smallest And SecondSmallest of digits are "+res3[0]+" and "+res3[1]);
		
		// Closing Scanner 
		input.close();
	}
}