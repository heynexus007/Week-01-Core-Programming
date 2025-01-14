//6

import java.util.Scanner;
class FizzBuzz2While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a Positive integer
        int numbers = input.nextInt();
		int n=0;
		if(numbers>0){
			While(n<=numbers){
				// n is multiple of 3 and 5 --> Print 'FizzBuzz'
				if((n%3==0)&&(n%5==0)){
					System.out.println("FizzBuzz");
				}
				
				// n is multiple of 3 --> Print 'Fizz'
				else if (n%3==0){
					System.out.println("Fizz");
				}
				
				// n is multiple of 5 --> Print 'Buzz'
				else if(n%5==0){
					System.out.println("Buzz");
				}
				
				// Otherwise printing n
				else{
					System.out.println(n);
				}	
			}
		}
		
		input.close();
    }
}