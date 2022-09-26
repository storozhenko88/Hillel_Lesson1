package lesson4;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner;

    public static void main(String[] args) {
        inputData();
    }

    public static void inputData (){
        scanner = new Scanner(System.in);
        double firstNumber, secondNumber;
        char sign;
        boolean continuationOperation;

        do {
            System.out.print("enter first number: ");
            firstNumber = scanner.nextDouble();

            System.out.print("enter sign '+' '-' '*' '/': ");
            sign = scanner.next().charAt(0);

            System.out.print("enter second number: ");
            secondNumber = scanner.nextDouble();

            switch (sign) {
                case '+' -> System.out.println(firstNumber + secondNumber);
                case '-' -> System.out.println(firstNumber - secondNumber);
                case '*' -> System.out.println(firstNumber * secondNumber);
                case '/' -> {
                    if (secondNumber == 0) {
                        System.out.println("error! you are trying to divide by 0");
                        break;
                    }
                    System.out.println(firstNumber / secondNumber);
                }
                default -> System.out.println("you enter the wrong sign");
            }

            continuationOperation = choiceContinuation();

        }while (continuationOperation);
        scanner.close();
    }

    public static boolean choiceContinuation (){
        scanner = new Scanner(System.in);
        System.out.println("""
                    Please choose:
                    1 - restart;
                    2 - exit;
                    """);
        String choice = scanner.nextLine();

        return choice.equals("1") || choice.equals("restart");
    }
}
