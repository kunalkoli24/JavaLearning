package ProblemSolving;

import java.util.Scanner;

public class P13_CalGradeFromMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int Mark = input.nextInt();

        if (Mark >= 90){
            System.out.println("A Grade");
        }else if (Mark >=75){
            System.out.println("B Grade");
        } else if (Mark >= 60){
            System.out.println("C Grade");
        } else if (Mark >= 30){
            System.out.println("D Grade");
        } else if (Mark < 30){
            System.out.println("F Grade");
        }
    }
}
