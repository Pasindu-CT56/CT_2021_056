package Q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name:-");
        String firstName = input.nextLine();

        System.out.print("Enter your Middle name:-");
        String middleName = input.nextLine();

        System.out.print("Enter your last name:-");
        String lastName = input.nextLine();

        System.out.print(lastName + "," + firstName + " " +middleName.charAt(0) + ".");


    }
}