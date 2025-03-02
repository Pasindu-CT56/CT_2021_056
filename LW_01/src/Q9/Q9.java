package Q9;

import java.util.Scanner;

public class Q9 {public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter text:-");
    String txt = input.nextLine();

    int ln = txt.length();

    System.out.println(txt.length());
    System.out.println(txt.charAt(0));
    System.out.println(txt.charAt(ln-1));


}
}
