package Q8;

import java.util.Scanner;

public class Q8 { public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter text:-");
    String txt = input.nextLine();

    int index = txt.indexOf("!");

    //System.out.print(index);

    System.out.println(txt.substring(0,index));

    int ln = txt.length();

    //System.out.print(ln);

    String sub = txt.substring(index+1,ln);

    System.out.print(sub.trim());


//one potato two potato ! three potato
}
}