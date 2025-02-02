package ProblemSolving;

import java.util.Scanner;

public class P07_CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Compound Interest Program");

        Scanner input= new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int Principle = input.nextInt();

        System.out.print("Enter Rate: ");
        float Rate = input.nextFloat();

        System.out.print("Enter Year: ");
        float Year = input.nextFloat();



        double compoundInterest = Principle * Math.pow((1 + Rate / 100), Year);
        System.out.println("Simple Interest is: " + compoundInterest);
    }
}
