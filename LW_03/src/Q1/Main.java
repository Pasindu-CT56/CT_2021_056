package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature in celsius: ");

        double celsius = input.nextDouble();

        Temperature temp = new Temperature();

        temp.setCelsius(celsius);

        System.out.print("Temperature in Fahrenheit: " + temp.toFahrenheit() );




    }
}
