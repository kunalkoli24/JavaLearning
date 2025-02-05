package Learning.Arrays;

public class Traverse_2D_array {
    public static void main(String[] args) {
        int [] [] myArray={{1,2,3},{4,5,6}};

        int i=0;
        while (i<myArray.length){
            int j =0;
            while (j<myArray[i].length){
                System.out.print(myArray[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
