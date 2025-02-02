package ProblemSolving;

import java.util.Scanner;

public class P17_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();
        long fact = Factorial(n);
        System.out.println("Factorial of " + n + " is : " + fact);
    }

    public static long Factorial(int num){
        if (num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
