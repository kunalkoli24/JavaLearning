package Learning;

import java.util.Scanner;

public class Return_Statement {
    public static void main(String[] args) {

        greet();

        int num1 = Numbers();
        int num2 = Numbers();

        int sum= num1+num2;
        System.out.print("Addition is: "+sum);
    }

    // divide this into methods:

    public static void greet(){
        System.out.println("Addition program");
    }

    public static int Numbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  number: ");
        int num = input.nextInt();
        return num; // as our method is returning something therefore we need to use return.
    }
}
