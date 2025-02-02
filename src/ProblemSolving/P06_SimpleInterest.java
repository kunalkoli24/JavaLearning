package ProblemSolving;

import java.util.Scanner;

public class P06_SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Simple Interest Program");

        Scanner input= new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int Principle = input.nextInt();

        System.out.print("Enter Year: ");
        float Year = input.nextFloat();

        System.out.print("Enter Rate: ");
        float Rate = input.nextFloat();

        float simpleInterest = (Principle * Year * Rate) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);

    }
}
