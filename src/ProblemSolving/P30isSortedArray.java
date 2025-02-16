package ProblemSolving;

import java.util.Scanner;

public class P30IsSortingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int arrSize = input.nextInt();

        int[] num = new int[arrSize];
        int i=0;
        while (i<arrSize){
            System.out.print("Enter element" + (i+1) +": ");
            num[i] = input.nextInt();
            i++;
        }
        boolean increasing = isIncreasing(num);
        boolean decreasing = isDecreasing(num);
        if (increasing || decreasing){
            System.out.println("Your Array is sorted");
        }
        else System.out.println("Not sorted");

    }

    public static boolean isIncreasing(int[] num){
        int i= 1;
        while (i<num.length){
            if(num[i] < num[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] num){
        int i=1;
        while (i<num.length){
            if (num[i] > num[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
