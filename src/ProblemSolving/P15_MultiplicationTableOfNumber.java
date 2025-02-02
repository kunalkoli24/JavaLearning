package ProblemSolving;

import java.util.Scanner;

public class P15_MultiplicationTableOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number For Multiplication Table: ");
        int num = input.nextInt();
        multiplication(num);
        }

        public static void multiplication(int num){
            int i = 1;
            while (i<=10){
                System.out.println(num + " X " + i + " = " + (num * i));
                i++;
            }
        }
}
