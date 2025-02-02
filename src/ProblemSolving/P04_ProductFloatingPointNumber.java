package ProblemSolving;

import java.util.Scanner;

public class P04_ProductFloatingPointNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double a= input.nextDouble();

        System.out.print("Enter Number: ");
        double b= input.nextDouble();

        double Product = a*b;
        System.out.print("Product of two floating numbers is: "+ Product);
    }
}
