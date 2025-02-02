package ProblemSolving;

import java.util.Scanner;

public class P14_PersonIntoAgeGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int Age = input.nextInt();

        if (Age >= 60){
            System.out.println("Your Senior");
        }else if (Age >= 20){
            System.out.println("Your Adult");
        } else if (Age < 20){
            System.out.println("Your Teen Age");
        } else if (Age < 13){
            System.out.println("Your Child");
        }
    }
}
