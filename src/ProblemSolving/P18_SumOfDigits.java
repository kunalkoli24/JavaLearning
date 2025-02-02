package ProblemSolving;

import java.util.Scanner;

public class P18_SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();
        int sum = SumOfDigit(n);
        System.out.println("Sum Of Digits is: "+ sum);
    }

    public static int SumOfDigit(int num){
        int sum = 0;
        while (num > 0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        return 0;
    }
}
