package ProblemSolving;

import java.util.Scanner;

public class P02_Swap_Two_Numbers {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//        int c = a;
//        System.out.println("Before Swap\na: "+a+"\nb: "+b);
//
//         a = b;
//         b = c;
//
//        System.out.println("After Swap\na: "+a+"\nb: "+b);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Value of A: ");
        int a = input.nextInt();

        System.out.print("Enter Value of B: ");
        int b = input.nextInt();

        System.out.println("Before Swap\na: "+a+"\nb: "+b);

        int c=a;
        a=b;
        b=c;

        System.out.println("After Swap\na: "+a+"\nb: "+b);



    }
}
