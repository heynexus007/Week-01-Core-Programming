//4

import java.util.Scanner;
class NumPrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter salary
        int numbers = input.nextInt();
		boolean isPrime = true;
		for (int i=2;i<numbers; i++){
			if(numbers%i==0){
				isPrime=false;
				break;
			}
		}
		
		if(isPrime || numbers==1){
			System.out.println("It is a prime number");
		}
		
		else{
			System.out.println("It is not a prime number");
		}
    input.close();
    }
}