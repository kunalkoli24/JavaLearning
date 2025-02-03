package ProblemSolving;

import java.util.Scanner;

public class P25_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = input.nextInt();
        boolean plaindrome = plaindrome(n);
        if (plaindrome){
            System.out.println("Number is a Palindrome");
        }else {
            System.out.println("Not a plaindrome");
        }

    }

    public static boolean plaindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
