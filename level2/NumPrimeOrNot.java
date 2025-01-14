//4

import java.util.Scanner;
class NumPrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a Number
        int numbers = input.nextInt();
		boolean isPrime = true;
		
		// Check number is prime or not
		for (int i=2;i<numbers; i++){
			if(numbers%i==0){
				isPrime=false;
				break;
			}
		}
		// isPrime is TRUE then, no. is prime otherwise not a prime
		if(isPrime || numbers==1){
			System.out.println("It is a prime number");
		}
		
		else{
			System.out.println("It is not a prime number");
		}
    input.close();
    }
}