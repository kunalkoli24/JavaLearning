import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        // to take inout from user we use scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = input.nextLine(); // input in string and store in variable name
        System.out.println("Hello " + name);

        // to take integer as input
        System.out.print(name + ",What is your age:");
        int Age = input.nextInt();
        System.out.println("Your age is: " + Age);

        // float
        System.out.print("Enter float number: ");
        float floatNumber = input.nextFloat();
        System.out.println("number: " + floatNumber);

        // double
        System.out.print("double number: ");
        double doubleNumber = input.nextDouble();
        System.out.println("double number: " + doubleNumber);
    }
}
