package monobank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNameClient;
        String lastNameClient;
        double depositAmount;
        final int  INTEREST_RATE = 2;

        System.out.print("Hello\nEnter your name: ");
        firstNameClient = scanner.nextLine();
        System.out.print("Enter your last name: ");
        lastNameClient = scanner.nextLine();

    }
}
