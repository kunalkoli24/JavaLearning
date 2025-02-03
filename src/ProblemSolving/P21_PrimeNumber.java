package ProblemSolving;

import java.util.Scanner;

public class P21_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        boolean isprime= Prime(num);
        if(isprime){
            System.out.println("It's Prime");
        }else {
            System.out.println("Not Prime");
        }
    }

    public static boolean Prime(int num){
//        int i =1;
        int i= 2;
        while (i<num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
