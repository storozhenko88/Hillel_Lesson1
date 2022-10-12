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
        ArrayList<String> wordsData = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            wordsData.add(scanner.nextLine());

        count = countOccurance(wordsData, word);

        System.out.println("the word " + word + " repeated " + count);

    }

    public static int countOccurance(ArrayList<String> wordsData, String verificationWord) {
        int countOccurance =0;

        for (String word : wordsData)
            if (word.contains(verificationWord))
                countOccurance++;

        return countOccurance;
    }
}
