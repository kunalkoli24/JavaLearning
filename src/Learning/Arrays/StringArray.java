package Learning.Arrays;

public class StringArray {
    public static void main(String[] args) {
        // same as int array just type is string

        String[] str = new String[4];

        str[0]= "Hello";
        str[1]= "How";
        str[2]= "Are";
        str[3]= "You";

        System.out.println(str[0]);
        System.out.println(str[1]);
        System.out.println(str[2]);
        System.out.println(str[3]);

        System.out.println("-------Directly declare when value are known---------");

        String[] arr1= {"Python","Java","C++","JavaScript"};

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);


    }
}
