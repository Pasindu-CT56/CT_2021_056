package Q5;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Categories:");
        System.out.println("1. Entree");
        System.out.println("2. Side Dish");
        System.out.println("3. Drink");
        System.out.println("Select a category (1-3):");
        int category = scanner.nextInt();

        switch (category) {
            case 1:
                System.out.println("Entree Options:");
                System.out.println("Tofu Burger - $3.49");
                System.out.println("Cajun Chicken - $4.59");
                System.out.println("Buffalo Wings - $3.99");
                System.out.println("Rainbow Fillet - $2.99");
                break;
            case 2:
                System.out.println("Side Dish Options:");
                System.out.println("Rice Cracker - $0.79");
                System.out.println("No-Salt Fries - $0.69");
                System.out.println("Zucchini - $1.09");
                System.out.println("Brown Rice - $0.59");
                break;
            case 3:
                System.out.println("Drink Options:");
                System.out.println("Cafe Mocha - $1.99");
                System.out.println("Cafe Latte - $1.90");
                System.out.println("Espresso - $2.49");
                System.out.println("Oolong Tea - $0.99");
                break;
            default:
                System.out.println("Invalid category.");
        }
    }
}
