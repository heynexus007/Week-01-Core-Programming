//5

import java.util.Scanner;
class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter a Number
        int numbers = input.nextInt();
		if(numbers>0){
			for(int n=0; n<=numbers; n++){
				// e is multiple of 3 and 5 Print 'FizzBuzz'
				if((n%3==0)&&(n%5==0)){
					System.out.println("FizzBuzz");
				}
				
				// e is multiple of 3 Print 'Fizz'
				else if (n%3==0){
					System.out.println("Fizz");
				}
				
				// e is multiple of 5 Print 'Buzz'
				else if(n%5==0){
					System.out.println("Buzz");
				}
				
				//Otherwise printing num
				else{
					System.out.println(n);
				}	
			}
		}
		
		input.close();
    }
}