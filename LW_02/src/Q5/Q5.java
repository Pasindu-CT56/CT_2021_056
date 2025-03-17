package Q5;

import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter temperature in fahrenheit: ");
        double fahrenheit = scanner.nextDouble();


        double Celsius = (5.0 / 9.0) * (fahrenheit - 32);


        System.out.printf("%.2f F is equal to %.2f C.%n", fahrenheit,Celsius);


    }
}
