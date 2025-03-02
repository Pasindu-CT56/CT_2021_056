package Q2;

import javax.swing.*;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name:-");
        String firstName = input.nextLine();

        System.out.print("Enter your last name:-");
        String lastName = input.nextLine();


        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle(firstName + " " + lastName);
        myWindow.setVisible(true);
    }
}