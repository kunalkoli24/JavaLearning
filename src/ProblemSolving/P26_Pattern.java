package ProblemSolving;

import java.util.Scanner;

public class P26_Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        RightHalfPyramid(rows);
        ReverseRightHalfPyramid(rows);

    }

    public  static void RightHalfPyramid(int num){
        System.out.println("\n Right Half Pyramid");
        int rows = 0;
        while(rows < num){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void ReverseRightHalfPyramid(int num){
        System.out.println("\nReverse Right Half Pyramid");
        int rows = num;
        while (rows > 0){
            int  i =0;
            while (i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }



}
