package lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Book {
    private String path;
    private ArrayList<String> words = new ArrayList<>();
    private HashMap<String, Integer> repeatedWords;
    private ArrayList<String> topWords;


    public Book(String path) {
        this.path = path;
    }

    public void generateStatistics(String nameBook) {
        generateCopyBook();
        searchPopularWords();
        int uniqueWords = repeatedWords.size();

        String pathSaveStatistics = "src/lesson13/";

        pathSaveStatistics = pathSaveStatistics + nameBook + "_statistics.txt";

        File storageStatistics = new File(pathSaveStatistics);

        try {
            FileWriter fileWriter = new FileWriter(storageStatistics, true);
            fileWriter.write( "Top 10 repeated words in a book " + nameBook + ":");
            System.out.println("Top 10 repeated words in a book " + nameBook + ":");
            for (String word: topWords) {
                fileWriter.write(word + "\n");
                System.out.println(word);
            }
            fileWriter.write("\nNumber of unique words in the book - " + uniqueWords);
            System.out.println("\nNumber of unique words in the book - " + uniqueWords);
            fileWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void generateCopyBook() {
        FileInputStream fileInputStream;
        String buffer = "";

        try {
            fileInputStream = new FileInputStream(path);
            int a;
            while ((a = fileInputStream.read()) != -1) {
                if (a >= 65 && a <= 90 || a >= 97 && a <= 122)
                    buffer += (char) a;

                if (a == 44 || a == 32 || a == 46 || a == 59) {
                    words.add(buffer);
                    buffer = "";
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void searchPopularWords() {
        repeatedWords = new HashMap<>();
        topWords = new ArrayList();
        List<String> exceptionWords = Arrays.asList("A", "The", "If");
        List<Integer> numberRepetitions = new ArrayList<>();
        int count;

        for (String word : words) {
            if (!word.isEmpty()) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
                if (!exceptionWords.contains(word)) {
                    if (!repeatedWords.containsKey(word))
                        repeatedWords.put(word, 1);
                    else {
                        count = repeatedWords.get(word);
                        count++;
                        repeatedWords.put(word, count);
                    }
                }
            }
        }

        for (Map.Entry<String, Integer> wordEntry : repeatedWords.entrySet()) {
            if (!numberRepetitions.contains(wordEntry.getValue()))
                numberRepetitions.add(wordEntry.getValue());
        }

        Collections.sort(numberRepetitions);

        //print the 10 most repeated words
        int numberPins = 10;
        for (int i = numberRepetitions.size() - 1; numberPins != 0; i--) {
            for (Map.Entry<String, Integer> wordEntry : repeatedWords.entrySet()) {
                if (wordEntry.getValue().equals(numberRepetitions.get(i)) && wordEntry.getKey().length() > 2) {
                    topWords.add(wordEntry.getKey() +" - " + wordEntry.getValue());
                    numberPins--;
                }
            }
        }
    }



}
