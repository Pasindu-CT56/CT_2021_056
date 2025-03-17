package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input your height in cm: ");
        int H = input.nextInt();

        System.out.print("Input your weight in kg: ");
        int W = input.nextInt();

        double BMI = W / Math.pow( (H / 100.00), 2);
        System.out.printf("Your BMI value: %.3f%n",BMI);

        if ( 20 <= BMI || BMI <= 25) {
            System.out.println("You BMI value is in healthy range (20.0 - 25.0)");
        } else
            System.out.println("You BMI value is not in healthy range (20.0 - 25.0)");


    }
}
