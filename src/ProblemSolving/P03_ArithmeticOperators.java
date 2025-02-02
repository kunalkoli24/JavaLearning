package ProblemSolving;

import java.util.Scanner;

public class P03_ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operations ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a= input.nextInt();
        System.out.print("Enter Second Number: ");
        int b= input.nextInt();

        System.out.println("Addition: "+ (a+b));
        System.out.println("Substraction: "+ (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));
        System.out.print("Modulus: "+ (a%b));
    }
}
