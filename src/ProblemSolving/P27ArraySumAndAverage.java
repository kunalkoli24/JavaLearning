package ProblemSolving;

import java.util.Scanner;

public class P27ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int Arraysize = input.nextInt();

        int[] num = new int[Arraysize];
        int i= 0;
        while (i<Arraysize){
            System.out.print("Enter element no " + (i+1) + ":");
            num[i] = input.nextInt();
            i++;
        }
        long sum = sum(num);
        double average = avg(num);
        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array is: " + average);
    }

    public static long sum(int[] arr){
        long sum =0;
        int i= 0;
        while (i< arr.length){
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static double avg(int [] arr){
        double sum = sum(arr);

        return  (sum / arr.length);
    }
}
