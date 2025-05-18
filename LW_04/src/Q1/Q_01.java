package Q1;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("The smallest number is: " + smallest);
    }
}