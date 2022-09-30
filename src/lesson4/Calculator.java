package lesson4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        inputData();
    }

    public static void inputData (){
        Scanner scanner = new Scanner(System.in);
        double firstNumber, secondNumber;
        char sign;
        boolean continuationOperation;
        int choiceOperation;

        do {
            System.out.print("enter first number: ");
            firstNumber = scanner.nextDouble();

            System.out.print("enter sign '+' '-' '*' '/': ");
            sign = scanner.next().charAt(0);

            System.out.print("enter second number: ");
            secondNumber = scanner.nextDouble();



            switch (sign) {
                case '+' -> System.out.println("Result = " + (firstNumber + secondNumber));
                case '-' -> System.out.println("Result = " + (firstNumber - secondNumber));
                case '*' -> System.out.println("Result = " + (firstNumber * secondNumber));
                case '/' -> {
                    if (secondNumber == 0) {
                        System.out.println("error! you are trying to divide by 0");
                        break;
                    }
                    System.out.println("Result = " + (firstNumber / secondNumber));
                }
                default -> System.out.println("you enter the wrong sign");
            }

            System.out.println("""
                    Please choose:
                    1 - restart;
                    2 - exit;
                    """);

            choiceOperation = scanner.nextInt();

            continuationOperation = choiceOperation == 1;

        }while (continuationOperation);

        scanner.close();
    }
}
