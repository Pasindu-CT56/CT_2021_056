package Q3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();


        double fahrenheit = (1.8 * celsius) + 32;


        System.out.printf("%.2f C is equal to %.2f F.%n", celsius, fahrenheit);


    }
}
