package ProblemSolving;

import java.util.Scanner;

public class P09_PositiveNegativeZeroNumbers {
    public static void main(String[] args) {
        // To check number is positive, negative or zero.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num = input.nextInt();

        if(num > 0){
            System.out.println("Number Is positive");
        } else if (num == 0) {
            System.out.println("Number Is Zero");
        } else{
            System.out.println("Number Is Negative");
        }
    }
}
