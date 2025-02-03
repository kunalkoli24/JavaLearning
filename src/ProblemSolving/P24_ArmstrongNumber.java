package ProblemSolving;

import java.util.Scanner;

public class P24_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static boolean isArmstrong(int num) {
        int digit = NoOFDigits(num);
        int originalNum = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, digit);
        }
        return finalNumber == originalNum;
    }

    public static int NoOFDigits(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }
}
