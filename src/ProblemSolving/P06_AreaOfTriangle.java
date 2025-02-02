package ProblemSolving;

import java.util.Scanner;

public class P06_AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Area Of Triangle");

        Scanner input= new Scanner(System.in);
        System.out.print("Enter Base: ");
        double a = input.nextDouble();

        System.out.print("Enter Height: ");
        double b = input.nextDouble();

        double areaOfTriangle = 0.5 * a * b;
        System.out.print("Area Of triangle: " + areaOfTriangle);


    }
}
