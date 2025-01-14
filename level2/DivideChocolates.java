import java.util.Scanner;
class DivideChocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter number of chocolates
        int chocolates = input.nextInt();

        // Enter number of children
        int children = input.nextInt();

        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;

        System.out.println("The number of chocolates each child gets is "+ chocolatesPerChild +" and the number of remaining chocolates is "+ remainingChocolates);
		
		input.close();
    }
}


