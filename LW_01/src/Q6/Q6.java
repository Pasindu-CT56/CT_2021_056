package Q6;

import javax.swing.*;
import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width of the window:-");
        int width = input.nextInt();

        System.out.print("Enter height of the window:-");
        int height = input.nextInt();

        input.nextLine();

        System.out.print("Enter the title of the window:-");
        String title  = input.nextLine();

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(width,height);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}