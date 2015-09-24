import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    	System.out.println("Please enter 2 numbers");
 
        int XX = input.nextInt();
        int XY = input.nextInt();
        int Answer = XX + XY;
        System.out.println("The numbers you enter are " + XX + " and " + XY);
        System.out.println("The sum is " + Answer);
        System.out.println("What if I subtract three and four?");
       
        int Solution = XX - XY;
        System.out.println("The difference equals " + Solution);
        System.out.println("What is the product?");
       
        int Product = XX * XY;
        System.out.println("The product equals " + Product);
        System.out.println("How about the quotient?");
       
        int Quotient = XX / XY;
        System.out.println("The quotient equals " + Quotient);
    }
}