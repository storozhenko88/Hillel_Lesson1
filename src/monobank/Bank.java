package monobank;

import java.util.Scanner;

public class Bank {
    static Scanner scanner;
    static String firstNameClient;
    static String lastNameClient;
    static double depositAmount;
    static final int INTEREST_RATE = 2;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Hello\nEnter your name: ");
        firstNameClient = scanner.nextLine();
        System.out.print("Enter your last name: ");
        lastNameClient = scanner.nextLine();
        System.out.print("Enter your deposit: ");
        depositAmount = scanner.nextDouble();

        infoByDeposit();

    }

    public static void infoByDeposit() {
        double annualDeposit = depositAmount + depositAmount * INTEREST_RATE / 100;

        System.out.printf("""
                dear %s %s%n annual interest on deposit - 2 percent%n
                _____________________________________________________
                deposit for 1 years, including interest - %.2f UAH%n
                deposit for 5 years, including interest - %.2f UAH%n
                deposit for 10 years, including interest - %.2f UAH
                """, firstNameClient, lastNameClient, annualDeposit, annualDeposit*5, annualDeposit*10);
    }

}
