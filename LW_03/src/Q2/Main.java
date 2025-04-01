package Q2;

import Q1.Temperature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit: ");

        double Fahrenheit = input.nextDouble();

        Temperature temp = new Temperature();

        temp.setFahrenheit(Fahrenheit);

        System.out.print("Temperature in celsius: " + temp.toCelsius());

    }
}
