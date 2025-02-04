package Learning.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // To declare arry

        int[] myArray = new int[5];

        // one way to declare array
        // Here order does not matter
        myArray[0]=10;
        myArray[1]=20;
        myArray[2]=30;
        myArray[3]=40;
        myArray[4]=50;

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);

        System.out.println("-------Directly declare when value are known---------");

        // directly insert values

        int[] directDeclare= {50,60,70,80,90};

        System.out.println(directDeclare[0]);
        System.out.println(directDeclare[1]);
        System.out.println(directDeclare[2]);
        System.out.println(directDeclare[3]);
        System.out.println(directDeclare[4]);

    }
}
