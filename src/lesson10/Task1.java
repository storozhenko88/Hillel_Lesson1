package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;

        System.out.print("enter the word you want to check the presence in the list: ");
        String word = scanner.nextLine();

        System.out.println("enter the list words:");
        ArrayList<String> arrayWords = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            arrayWords.add(scanner.nextLine());

        count = countOccurance(arrayWords, word);

        System.out.println("the word " + word + " repead " + count);

    }

    public static int countOccurance(ArrayList<String> arrayWords, String word) {
        int countOccurance =0;

        for (String arrayWord : arrayWords)
            if (arrayWord.contains(word))
                countOccurance++;

        return countOccurance;
    }
}
