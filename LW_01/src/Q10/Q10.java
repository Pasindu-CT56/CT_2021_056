package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text:-");
        String txt = input.nextLine();

        int len = txt.length();

        if(len % 2 == 1){
            System.out.print(txt.charAt(len / 2));
        } else {
            System.out.print("ENTER odd number word");
        }


    }
}

