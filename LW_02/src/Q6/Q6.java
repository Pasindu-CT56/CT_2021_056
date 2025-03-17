package Q6;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int birthYear = scan.nextInt();

        int currentYear = calendar.get(GregorianCalendar.YEAR);
        int age = currentYear - birthYear;

        System.out.printf("You were born in %d and will be %d years old in this year", birthYear, age);
    }
}
