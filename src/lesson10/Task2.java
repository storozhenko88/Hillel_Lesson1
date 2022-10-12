package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the length of the array: ");
        int lengthArray = scanner.nextInt();
        int[] dataNumbers = new int[lengthArray];

        for (int i = 0; i < dataNumbers.length; i++) {
            System.out.print("enter number: ");
            dataNumbers[i] = scanner.nextInt();
        }

        List<Integer> numbersList = toList(dataNumbers);

        System.out.println(numbersList);

    }

    public static List<Integer> toList(int[] dataNumbers) {
        List<Integer> numbersList = new ArrayList<>();
        for (int number: dataNumbers)
            numbersList.add(number);
        return numbersList;
    }


}
