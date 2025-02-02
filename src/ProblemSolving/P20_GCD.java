package ProblemSolving;

import java.util.Scanner;

public class P20_GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first = input.nextInt();

        System.out.print("Enter Second Number: ");
        int second = input.nextInt();

        int GCD = GCD(first, second);  // Corrected method call
        System.out.print("GCD of two numbers is : " + GCD);
    }

    public static int GCD(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = least(first, second);  // Fixed incorrect variable names

        while (i <= least) {  // Fixed condition (should be <=)
            if (first % i == 0 && second % i == 0) {
                gcd = i;  // Assign i to gcd when a common divisor is found
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
