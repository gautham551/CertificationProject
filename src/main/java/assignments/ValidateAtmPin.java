package assignments;

import java.util.Scanner;

public class ValidateAtmPin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Bank");
        System.out.print("Enter ATM Pin to whithdraw: ");

        int pin = 1234;
        int attempts = 3;
        attempts = in.nextInt();

        switch (pin) {

        case 1:

            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        default:
            System.out.println("Invalid Pin.");
            break;
        }
    }
}
