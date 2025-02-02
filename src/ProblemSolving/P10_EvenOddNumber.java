package ProblemSolving;

import java.util.Scanner;

public class P10_EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number Is Even");
        }else {
            System.out.println("Number Is Odd");
        }
    }
}
