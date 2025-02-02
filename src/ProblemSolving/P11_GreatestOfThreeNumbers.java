package ProblemSolving;

import java.util.Scanner;

public class P11_GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number A: ");
        int a = input.nextInt();

        System.out.print("Enter Number B: ");
        int b = input.nextInt();

        System.out.print("Enter Number C: ");
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println("A Is Greater, Number: " + a);
        } else if (b>a && b>c) {
            System.out.println("B Is greater, Number: " + b);
        }else {
            System.out.println("C Is greater, Number: " + c);
        }
    }
}
