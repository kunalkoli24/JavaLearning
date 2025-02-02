package ProblemSolving;

import java.util.Scanner;

public class P16_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();
        int sum = sumOfOddNum(n);
        System.out.println("Sum Of Odd Numbers Till " + n + " Is: " + sum);
    }

    public static int sumOfOddNum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num){
            sum = sum + i;
            i = i + 2;
        }
        return sum;
    }
}
