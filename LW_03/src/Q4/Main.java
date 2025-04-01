package Q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the Owner: ");
        String ownerName = input.next();

        System.out.print("Enter the phone number: ");
        String phoneNo = input.next();

        Bicycle bic = new Bicycle();

        bic.setBicycleowner( ownerName );
        bic.setBicyclephoneno( phoneNo );

        System.out.println("Name of the Bicycle owner: " + bic.getBicycleowner());
        System.out.print("Phone number is: " + bic.getBicyclephoneno());

    }
}
