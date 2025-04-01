package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of inner circle: ");
        double ri = input.nextDouble();

        System.out.print("Enter the radius of outer circle: ");
        double ro = input.nextDouble();

        Circle rad = new Circle();

        rad.setRadius(ri , ro);

        System.out.println("Shaded Area of the circle : " + rad.computeArea());

        rad.computeCircumference();


    }
}
