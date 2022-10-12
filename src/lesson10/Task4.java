package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the list words:");
        List<String> wordsData = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            wordsData.add(scanner.nextLine());

        calcOccurance(wordsData);
    }

    public static void calcOccurance(List<String> wordData) {
        List<String> wordDataCollector = new ArrayList<>();

        int count, lastIndex;

        for (int i = 0; i < wordData.size(); i++) {
            count = 0;
            if (!wordDataCollector.contains(wordData.get(i))) {
                wordDataCollector.add(wordData.get(i));
                count++;
                lastIndex = wordDataCollector.size() - 1;
                for (int j = i + 1; j < wordData.size(); j++)
                    if (wordDataCollector.get(lastIndex).equals(wordData.get(j)))
                        count++;
                System.out.println(wordData.get(i) + " - " + count);
            }
        }
    }
}

