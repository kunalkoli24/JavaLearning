package ProblemSolving;

import java.util.Scanner;

public class P05_PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Perimeter Of Rectangle");

        Scanner input= new Scanner(System.in);
        System.out.print("Enter 1st Side: ");
        int a = input.nextInt();

        System.out.print("Enter 2nd Side: ");
        int b = input.nextInt();

        System.out.print("Enter 3rd Side: ");
        int c = input.nextInt();

        System.out.print("Enter 4th Side: ");
        int d = input.nextInt();

        int Perimeter = a+b+c+d;
        System.out.print("Perimeter Of Rectangle Is: "+ Perimeter);
    }
}
