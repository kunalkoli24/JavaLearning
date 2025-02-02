package ProblemSolving;

import java.util.Scanner;

public class P12_LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Is Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }
}
