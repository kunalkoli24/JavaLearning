package ProblemSolving;

import java.util.Scanner;

public class P29MaxMinEleInArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int ArrSize = input.nextInt();

        int[] arr = new int[ArrSize];
        int i =0;
        while (i<ArrSize){
            System.out.print("Enter element" + (i+1)+":");
            arr[i] = input.nextInt();
            i++;
        }
        int maxArr = max(arr);
        int minArr = min(arr);
        System.out.println("Maximum element in array is: "+maxArr);
        System.out.print("Minimum element in array is: "+minArr);

    }

    public static int max(int[] arr){
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }
        int max=arr[0];
        int i=1;
        while (i< arr.length){
            if (max<arr[i]){
                max=arr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int i=0;
        while (i< arr.length){
            if (min > arr[i]){
                min = arr[i];
            }

            i++;
        }
        return min;
    }

}
