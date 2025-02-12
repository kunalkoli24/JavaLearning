package ProblemSolving;

import java.util.Scanner;

public class P28NumOccurrenceInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements in array: ");
        int arrSize = input.nextInt();

        int[] Arr = new int[arrSize];
        int i =0;
        while (i<arrSize){
            System.out.print("Enter element " + (i+1) + " : ");
            Arr[i] = input.nextInt();
            i++;
        }
        System.out.print("Enter number to check its occurrence: ");
        int numOcc= input.nextInt();
        int Occurrences= NumOfOccurrence(Arr,numOcc);
        System.out.println("Number Of Occurrence is: "+Occurrences);
    }

    public static int NumOfOccurrence(int[] Arr,int numOcc){
        int occ= 0;
        int i =0;
        while (i<Arr.length){
            if (Arr[i]==numOcc){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
