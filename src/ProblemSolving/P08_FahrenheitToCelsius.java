package ProblemSolving;

import java.util.Scanner;

public class P08_FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Conversion Of Fahrenheit To Celsius");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        float F = input.nextFloat();

        float C = (F - 32) * 5 / 9;
        System.out.print("Temperature in Celsius: " + C);
    }
}
