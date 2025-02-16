package ProblemSolving;

import java.util.Scanner;

public class P31deleteElementFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int arrSize = input.nextInt();

        int[] arrElements = new int[arrSize];
        int i = 0;
        while (i < arrSize) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrElements[i] = input.nextInt();
            i++;
        }

        System.out.print("Enter number to delete from array: ");
        int numDelete = input.nextInt();

        //new array after deletion
        int[] newArr = deleteNum(arrElements, numDelete);

        // Display new array
        System.out.print("New array is: ");
        int k = 0;
        while (k < newArr.length) {
            System.out.print(newArr[k] + " ");
            k++;
        }
        System.out.println();
    }

    public static int[] deleteNum(int[] arrElements, int numDelete) {
        // Count occurrences of numDelete in array
        int occ = 0;
        int i = 0;
        while (i < arrElements.length) {
            if (arrElements[i] == numDelete) {
                occ++;
            }
            i++;
        }

        if (occ == 0) {
            return arrElements; // Return original array if number is not found
        }

        // Create new array with reduced size
        int newSize = arrElements.length - occ;
        int[] arr = new int[newSize];

        i = 0;
        int j = 0;
        while (i < arrElements.length) {
            if (arrElements[i] != numDelete) {
                arr[j] = arrElements[i];
                j++;
            }
            i++;
        }
        return arr;
    }
}
