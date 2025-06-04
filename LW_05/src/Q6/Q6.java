package Q6;

import java.util.Scanner;
import java.util.Random;

public class Q6{
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            if (guess < target) {
                System.out.println("Higher!");
            } else if (guess > target) {
                System.out.println("Lower!");
            }
        } while (guess != target);
        System.out.println("Correct! The number was " + target);

    }
}
