package Learning.Arrays;

import java.util.Scanner;

public class StringSearchInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr1= {"Python","Java","C++","JavaScript"};
        System.out.print("Enter string To Search: ");
        String str = input.nextLine();
        boolean isFound = isFound(arr1, str);

        if(isFound){
            System.out.println("String Present In Array");
        }else {
            System.out.println("String Is Not present In Array");
        }
    }

    public static boolean isFound(String[] arr1, String str){
        int index =0;
        while (index < arr1.length){
            if(arr1[index].equals(str)){
                return true;
            }
            index++;
        }

        return false;
    }
}
