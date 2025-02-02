package ProblemSolving;

import java.util.Scanner;

public class P19_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int first = input.nextInt();

        System.out.println("Enter Second Number: ");
        int second = input.nextInt();

        int lcm = LCM(first,second);
        System.out.println("LCM of two numbers is : " + lcm);
    }

    public static int LCM(int first, int second){
        int i =1 ;
        while (i<second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;

    }
}
