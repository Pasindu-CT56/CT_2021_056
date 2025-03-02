package Q3;

import java.util.Scanner;

public class Q3 { public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your first name:-");
    String firstName = input.nextLine();

    System.out.print("Enter your Middle name:-");
    String middleName = input.nextLine();

    System.out.print("Enter your last name:-");
    String lastName = input.nextLine();

    System.out.print(firstName + " " + middleName.charAt(0) + "." + lastName );

}
}
