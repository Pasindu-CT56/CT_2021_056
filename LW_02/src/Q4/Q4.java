package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight on pounds(lb): ");
        double pounds  = input.nextDouble();

        double calories = pounds * 19;
        System.out.print("Number of calories you need in one day: " + calories);


    }
}
