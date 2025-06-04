package Q2;



import java.util.Scanner;

public class Q2 {
    public static int countDigits(int num) {
        if (num == 0) return 1;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("Enter an integer (negative to stop): ");
            input = scanner.nextInt();
            if (input >= 0) {
                System.out.println("Number of digits: " + countDigits(input));
            }
        } while (input >= 0);
        scanner.close();
    }
}
