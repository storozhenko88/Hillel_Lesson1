package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the length of the array: ");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("enter number: ");
            numbers[i] = scanner.nextInt();
        }

        List<Integer> digiStorage = toList(numbers);

        System.out.println(digiStorage);

    }

    public static List<Integer> toList(int[] numbers) {
        List<Integer> numbersList = new ArrayList<>();
        for (int number: numbers)
            numbersList.add(number);
        return numbersList;
    }


}
