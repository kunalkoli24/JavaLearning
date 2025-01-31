package ProblemSolving;

import java.util.Scanner;

public class P01_Addition {
    public static void main(String[] args) {
        // 1. to print name between sentence

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Name: ");
//        String str = input.nextLine();
//        System.out.println("Welcome " + str + " For java class");

        // to add two numbers taken from user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Addition is: "+ (num1+num2));

    }
}
