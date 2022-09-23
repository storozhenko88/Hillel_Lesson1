package lesson3;

import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareTwoNumbers(1, 9));
        checkNumberSign(-5);
        System.out.println(checkNumberSignLogical(-7));
        printString("Hillel", 3);
        System.out.println(definitionLeapYear());
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 7;

        if (a + b >= 0)
            System.out.println("The amount is positive");
        else
            System.out.println("The amount is negative");
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0)
            System.out.println("Red");
        else if (value > 0 && value <= 100)
            System.out.println("Yellow");
        else
            System.out.println("Green");
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 3;

        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
        ;
    }

    public static boolean compareTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber >= 10 && firstNumber + secondNumber <= 20;
    }

    public static void checkNumberSign(int number) {
        if (number >= 0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is negative");
    }

    public static boolean checkNumberSignLogical(int number) {
        return number < 0;
    }

    public static void printString(String string, int amount) {
        if (amount <= 0)
            System.out.println("Error");
        else {
            for (int i = 0; i < amount; i++)
                System.out.println(string);
        }

    }

    public static boolean definitionLeapYear() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter year - ");
        int year = scan.nextInt();

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
