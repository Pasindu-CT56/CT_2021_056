package Q4;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        boolean LeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (LeapYear) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}