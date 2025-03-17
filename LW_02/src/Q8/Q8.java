package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input the Radius of the sphere: ");
        double radius = scan.nextDouble();

        double PI = 3.14;
        double volume = (4.0 / 3.0) * ( (PI * Math.pow(radius, 3)) );

        System.out.printf("The volume of the sphere: %.2f", volume );
    }
}
