package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double lAmount = input.nextDouble();

        System.out.print("Annual interest rate (in percentage): ");
        double annual_iR = input.nextDouble();

        System.out.print("Loan period (in years): ");
        int lPeriod = input.nextInt();

        int months = 12;

        System.out.print("\n");

        double monthly_iR = annual_iR / 100.0 / months;
        System.out.printf("Monthly interest rate: %.5f %%%n", monthly_iR);

        int no_of_payments = lPeriod * months;
        System.out.println("Number of payments: " + no_of_payments);

        double monthlyPayment = (lAmount * monthly_iR) / (1 - Math.pow( (1 / ( 1 + monthly_iR)), no_of_payments) );
        System.out.printf("Monthly payment: $ %.2f%n", monthlyPayment);

        System.out.printf("Total payment: $ %.2f%n", (monthlyPayment * no_of_payments) );
    }
}
