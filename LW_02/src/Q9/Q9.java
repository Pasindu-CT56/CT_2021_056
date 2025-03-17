package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("amount of investment: ");
        double P = input.nextDouble();

        System.out.print("Annual interest rate (in percentage): ");
        double R = input.nextDouble();

        System.out.print("Investment period (in years): ");
        int N = input.nextInt();

        double earnings = P * (1 + Math.pow((R / 100), N) );
        System.out.printf("The amount of money you will be earn after %d years: $ %.2f", N, earnings);
    }
}
