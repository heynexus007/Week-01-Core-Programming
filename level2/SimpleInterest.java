import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter Principal (INR)
        double principal = input.nextDouble();

        // Enter Rate of Interest (%)
        double rate = input.nextDouble();

        // Enter Time (years)
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal +", Rate of Interest %"+rate+", and Time "+time+" years");
		
		input.close();
    }
}

