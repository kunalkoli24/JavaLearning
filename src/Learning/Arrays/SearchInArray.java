package Learning.Arrays;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {33,42,11,4,65,73,89,22,55,19,10};
        System.out.print("Enter Number To Search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);

        if(isFound){
            System.out.println("Number Present In Array");
        }else {
            System.out.println("Number Is Not present In Array");
        }

    }

    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
