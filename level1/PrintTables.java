import java.util.Scanner;
 class PrintTables {
     public static void main(String[] args) {
        // Creating input scanner Object
        Scanner input = new Scanner(System.in);
		
        // Taking input of number
        System.out.print("Enter number : ");
        int number = input.nextInt();
        if(number<=9 && number>=6){
        // Creating an array of size 10
        int table[] = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i]=number * (i+1);
        }
        // Printing the each multiplication of number
        System.out.println("Printing Table : ");
        for (int i=0;i<table.length; i++) {
            System.out.println(number +" * "+ (i+1) + " = "+table[i] );
        }
    }
	else{
        System.out.println("Entered Number is not in the required range -> 6-9");
    }
        // Closing the scanner object
        input.close();
	}
 }